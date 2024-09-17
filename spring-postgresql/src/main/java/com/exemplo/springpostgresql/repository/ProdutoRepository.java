package com.exemplo.springpostgresql.repository;

import com.exemplo.springpostgresql.model.LivroFantasia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroFantasiaRepository extends JpaRepository<LivroFantasia, Long> {
}