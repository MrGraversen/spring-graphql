package io.graversen.springgraphql.data.model;

import lombok.Data;

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
    private String make;

    @Column
    private String model;

    @Column
    private int year;
}
