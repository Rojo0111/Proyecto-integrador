package com.integration.carManager.controllers;

import com.integration.carManager.models.entity.Admin;
import com.integration.carManager.models.entity.User;
import com.integration.carManager.models.web.request.LoginRequest;
import com.integration.carManager.services.RegisterUserAndAdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class AdminAndUserController {
    private final RegisterUserAndAdminService service;
    @PostMapping("/register-admin")
    public void registersAdmin(@RequestBody Admin admin){
        service.saveAdmin(admin);
    }

    @PostMapping("/register-user")
    public void registersUser(@RequestBody User user){
      service.saveUser(user);
    }

    @GetMapping("/find-user-info")
    public Optional<User> findUser(@RequestParam String id){
          return  service.findUser(id);
    }

    @GetMapping("/find-admin-info")
    public Optional<Admin> registersUser(@RequestParam String id){
        return  service.findAdmin(id);
    }


    @PostMapping("/login")
    public void loginAdmin(@RequestBody LoginRequest request){
        service.isCurrentAdmin(request.getId(), request.getPassword());
    }
}
