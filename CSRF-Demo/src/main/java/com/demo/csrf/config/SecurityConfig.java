package com.demo.csrf.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by guptaavi on 2/5/2021
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("kumarra").password("{noop}password").roles("TEST")
        .and().withUser("parikhab").password("{noop}password").roles("TEST")
        .and().withUser("goyalya").password("{noop}password").roles("TEST")
        .and().withUser("moorthyrs").password("{noop}password").roles("TEST")
        .and().withUser("lakrash").password("{noop}password").roles("TEST")
        .and().withUser("sethimu").password("{noop}password").roles("TEST")
        .and().withUser("jainra").password("{noop}password").roles("TEST")
        .and().withUser("guptaavi").password("{noop}password").roles("TEST");

  }

}
