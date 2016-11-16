package me.dodam.dodam.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import me.dodam.dodam.web.config.WebAppConfig;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(new ContextLoaderListener(this.createRootContext()));
        
        servletContext.addFilter("encodingFilter", this.createEncodingFilter());
        
        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcher", new DispatcherServlet(this.createWebAppContext()));
        setDispatcherServlet(dispatcherServlet);
	}
	
	private AnnotationConfigWebApplicationContext createRootContext(){
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        
//      rootContext.register(blah);
        
        return rootContext;
	}
	
	private CharacterEncodingFilter createEncodingFilter(){
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		
		encodingFilter.setEncoding("UTF-8");
		
		return encodingFilter;
	}
	
	private void setDispatcherServlet(Dynamic dispatcherServlet){
		dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("/");
	}
	
	private AnnotationConfigWebApplicationContext createWebAppContext(){
		AnnotationConfigWebApplicationContext webbAppContext = new AnnotationConfigWebApplicationContext();
        
		webbAppContext.register(WebAppConfig.class);
        
        return webbAppContext;
	}
}
