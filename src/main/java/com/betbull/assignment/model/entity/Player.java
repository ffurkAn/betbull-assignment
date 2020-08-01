package com.betbull.assignment.model.entity;

import com.betbull.assignment.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PLAYER")
public class Player extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "team_id")
    private String  teamId;

}
