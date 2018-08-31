package controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Evgeny Borisov
 */
@Configuration
public class Conf {
    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("//pages");
        resolver.setSuffix(".html");
        return resolver;
    }
}
