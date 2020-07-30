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
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String teamName;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id", referencedColumnName = "id", insertable = false, updatable = true)
    private Set<Player> playerSet;
}
