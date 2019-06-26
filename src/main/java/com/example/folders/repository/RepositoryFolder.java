package com.example.folders.repository;

import com.example.folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryFolder extends JpaRepository<Folder, Long> {
}
