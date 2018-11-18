package io.graversen.springgraphql.data.service;

import io.graversen.springgraphql.data.model.Car;
import io.graversen.springgraphql.data.repository.ICarRepository;
import io.graversen.springgraphql.lib.PredicateUtils;
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
    public List<Car> cars(@GraphQLArgument(name = "year") Integer year, @GraphQLArgument(name = "make") String make, @GraphQLArgument(name = "model") String model)
    {
        return carRepository.findAll().stream()
                .filter(PredicateUtils.safe(year, car -> car.getYear() == year))
                .filter(PredicateUtils.safe(make, car -> car.getMake().equalsIgnoreCase(make)))
                .filter(PredicateUtils.safe(model, car -> car.getModel().equalsIgnoreCase(model)))
                .collect(Collectors.toList());
    }
}
