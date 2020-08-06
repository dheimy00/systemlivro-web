package br.com.systemlivro.applicationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class ApplicationConfig implements WebMvcConfigurer {

	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}
	
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	          .addResourceHandler("/webjars/**")
	          .addResourceLocations("/webjars/");
	    }
	 
	 

}
