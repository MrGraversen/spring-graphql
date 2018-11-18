package io.graversen.springgraphql.data.model;

import lombok.Data;
import lombok.NonNull;

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
    @NonNull
    private Set<Car> cars;

    @ManyToMany
    @JoinTable
    @NonNull
    private Set<Driver> drivers;

    @ManyToOne
    @NonNull
    private Car winnerCar;

    @ManyToOne
    @NonNull
    private Driver winnerDriver;

    @PrePersist
    void prePersist()
    {
        this.racedAt = LocalDate.now();
    }
}
