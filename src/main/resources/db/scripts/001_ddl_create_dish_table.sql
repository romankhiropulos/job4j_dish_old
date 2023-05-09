CREATE TABLE IF NOT EXISTS dish
(
    id          SERIAL PRIMARY KEY NOT NULL,
    name        VARCHAR(2000)      NOT NULL,
    cost        FLOAT,
    category_id BIGINT,
    type_id     BIGINT
);