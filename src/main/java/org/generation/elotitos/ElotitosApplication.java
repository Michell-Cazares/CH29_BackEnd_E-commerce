package org.generation.elotitos;

import org.generation.elotitos.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElotitosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElotitosApplication.class, args);
	}//main
	
	
//	@Bean
//	public FilterRegistrationBean<JwtFilter> jwtFilter() {
//		FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<>();
//		registrationBean.setFilter(new JwtFilter());
//		registrationBean.addUrlPatterns("/api/productos/*");
//		registrationBean.addUrlPatterns("/api/usuarios/*");
//		registrationBean.addUrlPatterns("/api/compras/*");
//		registrationBean.addUrlPatterns("/api/compradetalle/*");
//		return registrationBean;
//	}//jwtFilter

}
