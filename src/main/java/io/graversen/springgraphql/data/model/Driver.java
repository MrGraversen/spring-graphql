package io.graversen.springgraphql.data.model;

import io.graversen.springgraphql.etc.Level;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
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
