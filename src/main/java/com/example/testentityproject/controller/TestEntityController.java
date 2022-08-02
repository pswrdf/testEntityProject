package com.example.testentityproject.controller;

import com.example.testentityproject.model.TestEntity;
import com.example.testentityproject.service.TestEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class TestEntityController {

    private final TestEntityService testEntityService;

    @PostMapping("/create")
    public void create(@RequestBody TestEntity testEntity) {
        testEntityService.create(testEntity);
    }

    @GetMapping("/read/{id}")
    public TestEntity read(@PathVariable UUID id) {
        return testEntityService.read(id).orElseThrow();
    }

    @PutMapping("/update")
    public void update(@RequestBody TestEntity testEntity) {
        testEntityService.update(testEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable UUID id) {
        testEntityService.delete(id);
    }
}
