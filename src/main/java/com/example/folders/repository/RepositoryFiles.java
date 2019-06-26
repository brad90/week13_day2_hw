package com.example.folders.repository;

import com.example.folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryFiles extends JpaRepository<File, Long> {
}
