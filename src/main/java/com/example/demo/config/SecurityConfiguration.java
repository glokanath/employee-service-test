/*
package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.service.JwtAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	

	//@Autowired
//	private JwtAuthenticationFilter jwtAuthFilter;
	*/
/*
	 * @Bean private AuthenticationManager authenticationProvider() { return new
	 * ProviderManager(null); }
	 *//*

	//@Autowired
	//private AuthenticationManager authenticationManager;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.headers().frameOptions().sameOrigin();

		*/
/*
		 * http.csrf(csrf-> csrf.disable()) // .authorizeHttpRequests(auth->
		 * auth.requestMatchers("/*", "/h2-console/**").permitAll())
		 * .authorizeHttpRequests().anyRequest().authenticated()
		 * .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
		 *//*

		*/
/*http
        .csrf()
        .disable()
        .authorizeHttpRequests(auth-> auth.requestMatchers("/*", "/h2-console/**").permitAll())
		.authorizeHttpRequests().anyRequest().authenticated()
        .and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .authenticationProvider(authenticationManager)
        .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);*//*




		return http.build();
		
	}

}
*/
