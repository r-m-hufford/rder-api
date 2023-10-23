package com.rmhufford.rder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="people")
public class Person {
    @Id
    private int id;
    private String first_name;
    private String last_name;
}
