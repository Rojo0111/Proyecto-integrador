package com.integration.carManager.repository;

import com.integration.carManager.models.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterAdminRepository extends JpaRepository<Admin,String> {
}
