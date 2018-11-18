package io.graversen.springgraphql.data.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Car
{
    @Id
    @GeneratedValue
    private long id;

    @Column
    @NonNull
    private String make;

    @Column
    @NonNull
    private String model;

    @Column
    @NonNull
    private int year;
}
