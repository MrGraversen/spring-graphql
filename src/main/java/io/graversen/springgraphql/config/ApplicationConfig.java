package io.graversen.springgraphql.config;

import io.graversen.springgraphql.data.model.Car;
import io.graversen.springgraphql.data.repository.ICarRepository;
import io.graversen.springgraphql.data.repository.IDriverRepository;
import io.graversen.springgraphql.data.repository.IRaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
@ComponentScan(basePackages = {"io.graversen.springgraphql.controller", "io.graversen.springgraphql.data", "io.graversen.springgraphql.lib"})
public class ApplicationConfig implements ApplicationListener<ApplicationReadyEvent>
{
    private final ICarRepository carRepository;
    private final IDriverRepository driverRepository;
    private final IRaceRepository raceRepository;

    @Autowired
    public ApplicationConfig(ICarRepository carRepository, IDriverRepository driverRepository, IRaceRepository raceRepository)
    {
        this.carRepository = carRepository;
        this.driverRepository = driverRepository;
        this.raceRepository = raceRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event)
    {
        Stream.of(
                new Car("Audi", "R8 V10 Plus", 2012),
                new Car("Audi", "RS3", 2016),
                new Car("Audi", "S8 LWB", 2016),
                new Car("Mercedes", "AMG GTR", 2018),
                new Car("Mercedes", "AMG GTS", 2018),
                new Car("Mercedes", "AMG GTC", 2018),
                new Car("Mercedes", "C63", 2016),
                new Car("Mercedes", "E63", 2016),
                new Car("Mercedes", "A45", 2012),
                new Car("Mercedes", "SLS Black", 2012),
                new Car("Volkswagen", "Scirocco", 2012),
                new Car("Volkswagen", "Polo GTI", 2018),
                new Car("Volkswagen", "Golf GTI", 2016)
        ).forEach(carRepository::save);
    }
}
