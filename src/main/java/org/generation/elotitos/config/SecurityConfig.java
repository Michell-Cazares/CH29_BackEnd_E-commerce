package org.generation.elotitos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
@EnableWebSecurity //seguridad habilitada vía web
public class SecurityConfig {

	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		return http
				.csrf(csrf -> csrf.disable())
				.authorizeRequests(auth -> {
					auth.antMatchers("/").permitAll();
				})
				.httpBasic(withDefaults())
				.build();
	}//configure
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}//encoder
	
}//class SecurityConfig
