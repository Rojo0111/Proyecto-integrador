package com.integration.carManager.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Table
@Entity
@Getter
@Setter
@ToString
public class Admin {

    @Id
    @Column(name= "admin_id")
    private String adminId;

    private String name;
    @Column(name= "last_name")
    private String lastName;

    private String email;

    private String phone;

    private String password;

}
