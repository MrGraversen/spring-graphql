package io.graversen.springgraphql.data.model;

import io.graversen.springgraphql.etc.Level;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
public class Driver
{
    @Id
    @GeneratedValue
    private long id;

    @Column
    @NonNull
    private String name;

    @Column
    @NonNull
    private int age;

    @Column
    @Enumerated(EnumType.STRING)
    @NonNull
    private Level level;
}
