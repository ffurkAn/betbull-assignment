package com.betbull.assignment.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id", referencedColumnName = "id", insertable = false, updatable = true)
    private Set<Player> playerSet;
}
