package com.betbull.assignment.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @GenericGenerator(name = "CustomGeneratedEntityId", strategy = "com.betbull.assignment.config.EntityIdGenerator")
    @GeneratedValue(generator = "CustomGeneratedEntityId")
    @Column(name = "id")
    private String id;


}
