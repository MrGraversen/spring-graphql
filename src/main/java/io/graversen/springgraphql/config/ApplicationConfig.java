package io.graversen.springgraphql.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"io.graversen.springgraphql.controller", "io.graversen.springgraphql.data", "io.graversen.springgraphql.lib"})
public class ApplicationConfig implements ApplicationListener<ApplicationReadyEvent>
{
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event)
    {

    }
}
