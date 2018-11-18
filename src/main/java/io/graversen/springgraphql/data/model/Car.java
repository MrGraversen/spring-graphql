package io.graversen.springgraphql.data.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
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
