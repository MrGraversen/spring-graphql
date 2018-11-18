package io.graversen.springgraphql.graphql;

import graphql.schema.GraphQLSchema;
import io.graversen.springgraphql.data.service.CarService;
import io.leangen.graphql.GraphQLSchemaGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GraphQLSchemas
{
    private final CarService carService;

    @Autowired
    public GraphQLSchemas(CarService carService)
    {
        this.carService = carService;
    }

    @Bean
    public GraphQLSchema graphQLSchema()
    {
        return new GraphQLSchemaGenerator()
                .withOperationsFromSingleton(carService)
                .generate();
    }
}
