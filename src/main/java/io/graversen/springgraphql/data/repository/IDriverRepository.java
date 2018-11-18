package io.graversen.springgraphql.data.repository;

import io.graversen.springgraphql.data.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDriverRepository extends JpaRepository<Driver, Long>
{
}
