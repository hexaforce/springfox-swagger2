package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

}
