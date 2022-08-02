package com.example.testentityproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * В изначальном классе не хватало аннотаций @Column и @Component
 * Также прописал аннотацию Типа для ГУИД (зависит от базы, возможно что и без неё бы работало)
 * Также поменял тип documentDate на дату.
 * dictionaryValueName тоже можно бы поменять, но надо знать изначальную задумку, чтобы наверняка
 */
@Component
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TestEntity {

    @Id
    @Type(type="uuid-char")
    private UUID id;

    @Column
    @Type(type="uuid-char")
    private UUID documentId;

    @Column
    private LocalDateTime documentDate;

    @Column
    @Type(type="uuid-char")
    private UUID dictionaryValueId;

    @Column
    @Type(type="uuid-char")
    private UUID dictionaryValueName;

    @Column
    private String sortOrder;

    @Column
    private UUID testId;

    @Column
    private String testName = "Test";
}
