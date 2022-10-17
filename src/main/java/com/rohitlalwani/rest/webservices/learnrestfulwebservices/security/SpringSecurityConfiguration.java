package com.rohitlalwani.rest.webservices.learnrestfulwebservices.security;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//All requests authenticated
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		//Popup to login, rest standards
		http.httpBasic(withDefaults());
		//diable csrf for post, put
		http.csrf().disable();
		return http.build();
	}
}
