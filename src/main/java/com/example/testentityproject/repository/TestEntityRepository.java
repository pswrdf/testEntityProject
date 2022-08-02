package com.example.testentityproject.repository;

import com.example.testentityproject.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TestEntityRepository extends JpaRepository<TestEntity, UUID> {
}
