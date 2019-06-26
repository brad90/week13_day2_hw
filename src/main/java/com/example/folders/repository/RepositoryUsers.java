package com.example.folders.repository;

import com.example.folders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsers extends JpaRepository<User, Long> {
}
