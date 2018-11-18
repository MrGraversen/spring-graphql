package io.graversen.springgraphql.data.model;

import io.graversen.springgraphql.etc.Level;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Driver
{
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    @Enumerated(EnumType.STRING)
    private Level level;
}
