package com.betbull.assignment.model.entity;

import com.betbull.assignment.model.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TEAM_PLAYER")
public class TeamPlayer extends BaseEntity{

    private String teamId;
    private String playerId;
}
