package com.example.tryJwt.demo.Repository;

import com.example.tryJwt.demo.Modelo.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Long> {
    public Optional<Users> findByEmail(String email);
}
