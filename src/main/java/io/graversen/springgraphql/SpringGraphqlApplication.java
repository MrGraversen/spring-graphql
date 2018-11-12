package io.graversen.springgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.graversen.springgraphql.config")
public class SpringGraphqlApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringGraphqlApplication.class, args);
    }
}
