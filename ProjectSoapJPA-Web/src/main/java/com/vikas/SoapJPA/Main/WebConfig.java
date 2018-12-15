package com.vikas.SoapJPA.Main;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WebConfig extends WsConfigurerAdapter {


    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
      return   new ServletRegistrationBean(servlet, "/jana/*");
    }

    @Bean
    public XsdSchema DbSchema(){
        return new SimpleXsdSchema(new ClassPathResource("Schema.xsd"));
    }

    @Bean(name = "dbservice")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema){
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("DbPort");
        definition.setLocationUri("/jana");
        definition.setTargetNamespace("http://www.VikasEvolution.com/ProjectSoapJPA");
        definition.setSchema(schema);
        return definition;
    }
}
