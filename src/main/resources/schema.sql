CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE SCHEMA IF NOT EXISTS courses;

CREATE TABLE IF NOT EXISTS courses."courses" (
    id UUID NOT NULL,
    name VARCHAR NOT NULL,
    instructor VARCHAR NOT NULL,
    UNIQUE (name),
    PRIMARY KEY (id)
);