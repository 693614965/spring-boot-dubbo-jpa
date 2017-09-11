package com.gaofeng.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@PropertySource({"classpath:dubbo.properties"})
@ImportResource({"classpath:applicationContext.xml"})
public class Application {

    public static void main(String[] argv) {
        new SpringApplicationBuilder(Application.class).web(true).run(argv);
    }
}
