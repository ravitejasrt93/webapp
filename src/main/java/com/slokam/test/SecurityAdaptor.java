package com.slokam.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityAdaptor extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().anyRequest().authenticated()
		.and().
		formLogin().
		loginPage("/gotoLogin").permitAll().
		loginProcessingUrl("/abc").
		usernameParameter("user").
		passwordParameter("password").
		defaultSuccessUrl("/getData").
		failureUrl("/gotoLogin");
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authentication) throws Exception { 
		authentication.inMemoryAuthentication()
		.withUser("slokam").password("slokam123").roles("ADMIN");
	}
	
	
}
