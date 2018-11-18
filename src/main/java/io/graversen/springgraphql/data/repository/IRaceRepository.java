package io.graversen.springgraphql.data.repository;

import io.graversen.springgraphql.data.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRaceRepository extends JpaRepository<Race, Long>
{
}
