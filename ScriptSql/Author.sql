CREATE TYPE Topic AS ENUM ('COMEDY', 'ROMANCE', 'OTHER');


CREATE TABLE IF NOT EXISTS Author (
    authorId SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);