package br.com.alysonrodrigo.locadora.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.alysonrodrigo.locadora.config.AppConfig;
import br.com.alysonrodrigo.locadora.config.JpaConfig;
import br.com.alysonrodrigo.locadora.config.ServiceConfig;


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{JpaConfig.class, ServiceConfig.class};	
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{AppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}


}
