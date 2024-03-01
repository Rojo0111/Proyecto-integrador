package com.integration.carManager.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user")
@Getter
@Setter
@ToString
public class User {
    @Id
    @Column(name= "user_id")
    private String userId;

    private String name;
    @Column(name= "last_name")
    private String lastName;

    private String email;

    private String phone;
}
