package com.smalik.common;

import org.apache.struts.action.ActionServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StrutsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrutsApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean strutsServletBean() {
        ActionServlet servlet = new ActionServlet();
        ServletRegistrationBean bean = new ServletRegistrationBean(servlet, "*.do");
        bean.addInitParameter("config", "/WEB-INF/struts-config.xml");
        bean.setLoadOnStartup(1);
        bean.setName("action");
        return bean;
    }
}
