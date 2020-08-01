package com.betbull.assignment.model.entity;


import com.betbull.assignment.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Base64;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Team extends BaseEntity{

    @Column(name = "name")
    private String name;


    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "team_player",
            joinColumns = @JoinColumn(
                    name = "teamId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "playerId"
            )
    )
    private Set<Player> playerSet;
}
