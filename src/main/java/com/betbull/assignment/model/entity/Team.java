package com.betbull.assignment.model.entity;


import com.betbull.assignment.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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


    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id", referencedColumnName = "id", insertable = false)
    private Set<Player> playerSet;
}
