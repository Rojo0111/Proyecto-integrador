package com.integration.carManager.services;

import com.integration.carManager.models.entity.Admin;
import com.integration.carManager.models.entity.User;
import com.integration.carManager.repository.RegisterAdminRepository;
import com.integration.carManager.repository.UserRegisterInterface;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class RegisterUserAndAdminService {
    private final RegisterAdminRepository adminRepository;
    private final UserRegisterInterface userRepository;

    public void saveAdmin(Admin admin){
        adminRepository.save(admin);
    }

    public Optional<Admin> findAdmin(String id){
       return adminRepository.findById(id);
    }

    public boolean isCurrentAdmin(String id,String password){
        Optional<Admin> admin = adminRepository.findById(id);
        return  admin.get().getPassword().equals(password);
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public Optional<User> findUser(String id){
        return userRepository.findById(id);
    }

}
