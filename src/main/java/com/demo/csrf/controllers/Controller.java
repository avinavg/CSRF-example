package com.demo.csrf.controllers;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by guptaavi on 1/31/2021
 */

@org.springframework.stereotype.Controller
public class Controller {

  private final Logger logger = LogManager.getLogger(this.getClass());
  private static final String LOGIN_ENDPOINT = "/letMeIn";
  private static final String LOGOUT_ENDPOINT = "/letMeGo";
  private static final String DEFAULT_ENDPOINT = "/";
  private static final String SEND_MONEY = "/sendMoney";
  private static final String SECRET_ENDPOINT = "/secret";
  private boolean loggedIn = false;

  @GetMapping(value = DEFAULT_ENDPOINT)
  @ResponseBody
  public ModelAndView defaultEndPoint() {
    logger.info("Default api called");
    loggedIn = true;
    return getView("Default");
  }

  @GetMapping(value = LOGIN_ENDPOINT)
  @ResponseBody
  public ModelAndView login() {
    logger.info("Temp login api called");
    loggedIn = true;
    return getView("Login");
  }

  @GetMapping(value = SEND_MONEY)
  @ResponseBody
  public ModelAndView sendMoney() {
    logger.log(Level.INFO, "Sending Money APi Called");
    if (loggedIn) {
      return getView("MoneySent");
    } else {
      return getView("MoneyNotSent");
    }
  }

  @GetMapping(value = LOGOUT_ENDPOINT)
  @ResponseBody
  public ModelAndView logOut() {
    logger.info("logout api called");
    loggedIn = false;
    return getView("LoggedOut");
  }


  @GetMapping(value = SECRET_ENDPOINT)
  @ResponseBody
  public ModelAndView secret() {
    if (loggedIn) {
      return getView("Thanks");
    } else {
      return getView("Nice");
    }
  }

  private ModelAndView getView(String name) {
    ModelAndView view = new ModelAndView();
    view.setViewName(name);
    return view;
  }
}
