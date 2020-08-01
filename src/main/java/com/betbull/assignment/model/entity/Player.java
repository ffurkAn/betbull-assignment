package com.betbull.assignment.model.entity;

import com.betbull.assignment.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PLAYER")
public class Player extends BaseEntity {

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(mappedBy = "playerSet", fetch = FetchType.LAZY)
    private Set<Team> teamSet;

}
