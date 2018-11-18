package io.graversen.springgraphql.data.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Race
{
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "raced_at")
    private LocalDate racedAt;

    @ManyToMany
    @JoinTable
    private Set<Car> cars;

    @ManyToMany
    @JoinTable
    private Set<Driver> drivers;

    @ManyToOne
    private Car winnerCar;

    @ManyToOne
    private Driver winnerDriver;
}
