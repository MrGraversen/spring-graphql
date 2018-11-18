package io.graversen.springgraphql.data.service;

import io.graversen.springgraphql.data.model.Car;
import io.graversen.springgraphql.data.repository.ICarRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Car> cars()
    {
        return carRepository.findAll();
    }
}
