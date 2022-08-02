package com.example.testentityproject.service;

import com.example.testentityproject.model.TestEntity;
import com.example.testentityproject.repository.TestEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TestEntityService {
    private final TestEntityRepository testEntityRepository;

    public void create(TestEntity testEntity) {
        testEntityRepository.save(testEntity);
    }

    public Optional<TestEntity> read(UUID uuid) {
        return testEntityRepository.findById(uuid);
    }

    public void update(TestEntity testEntity) {
        testEntityRepository.save(testEntity);
    }

    public void delete(UUID uuid) {
        testEntityRepository.deleteById(uuid);
    }
}
