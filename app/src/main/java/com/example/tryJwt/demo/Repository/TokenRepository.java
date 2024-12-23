package com.example.tryJwt.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token,Long> {
    List<Token> findAllValidIsFalseOrRevokedIsFalseByUserId(long id);
    Optional<Token> findByToken(String jwtToken);
}

