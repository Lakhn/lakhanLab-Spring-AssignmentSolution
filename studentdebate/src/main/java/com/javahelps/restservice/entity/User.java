package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String firstname;
    private String lastname;
    private String course;
    private String country;

    public String getUsername() {
        return firstname;
    }

    public void setUsername(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return lastname;
    }

    public void setPassword(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return course;
    }

    public void setName(String name) {
        this.course = course;
    }

    public String getEmail() {
        return country;
    }

    public void setEmail(String email) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" + "firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", course='" + course + '\''
                + ", country='" + country + '\'' + '}';
    }
}