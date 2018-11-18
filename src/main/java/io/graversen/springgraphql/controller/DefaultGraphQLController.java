package io.graversen.springgraphql.controller;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class DefaultGraphQLController
{
    private static final String QUERY = "query";
    private static final String OPERATION_NAME = "operationName";

    private final GraphQL graphQL;

    @Autowired
    public DefaultGraphQLController(GraphQLSchema graphQLSchema)
    {
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    @ResponseBody
    @PostMapping(value = "/graphql", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String, Object> indexFromAnnotated(@RequestBody Map<String, String> request, HttpServletRequest httpServletRequest)
    {
        ExecutionResult executionResult = graphQL.execute(ExecutionInput.newExecutionInput()
                .query(request.get(QUERY))
                .operationName(request.get(OPERATION_NAME))
                .context(httpServletRequest)
                .build());

        return executionResult.toSpecification();
    }
}
