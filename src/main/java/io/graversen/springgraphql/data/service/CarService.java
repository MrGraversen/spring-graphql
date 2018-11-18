package io.graversen.springgraphql.data.service;

import io.graversen.springgraphql.data.model.Car;
import io.graversen.springgraphql.data.repository.ICarRepository;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService
{
    private final ICarRepository carRepository;

    @Autowired
    public CarService(ICarRepository carRepository)
    {
        this.carRepository = carRepository;
    }

    @GraphQLQuery(name = "cars")
    public List<Car> cars(@GraphQLArgument(name = "year") Integer year)
    {
        return carRepository.findAll().stream()
                .filter(car -> car.getYear() == year)
                .collect(Collectors.toList());
    }

    @GraphQLQuery(name = "cars")
    public List<Car> cars()
    {
        return carRepository.findAll();
    }
}
