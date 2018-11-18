package io.graversen.springgraphql.data.repository;

import io.graversen.springgraphql.data.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, Long>
{
}
