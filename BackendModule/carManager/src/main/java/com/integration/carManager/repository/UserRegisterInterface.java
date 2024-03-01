package com.integration.carManager.repository;

import com.integration.carManager.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegisterInterface extends JpaRepository<User,String> {

}
