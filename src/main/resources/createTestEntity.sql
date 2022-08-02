-- liquibase formatted sql

-- changeset liquibase:1

CREATE TABLE test_entity
(
    id                    UUID NOT NULL,
    document_id           UUID,
    document_date         TIMESTAMP WITHOUT TIME ZONE,
    dictionary_value_id   UUID,
    dictionary_value_name UUID,
    sort_order            VARCHAR(255),
    test_id               UUID,
    test_name              VARCHAR(255),
    CONSTRAINT pk_testentity PRIMARY KEY (id)
);
