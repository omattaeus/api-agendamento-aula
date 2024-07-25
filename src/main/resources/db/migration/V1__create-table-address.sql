CREATE TABLE Address (
    id UUID PRIMARY KEY,
    street VARCHAR(255),
    number VARCHAR(50),
    city VARCHAR(255),
    state VARCHAR(255),
    zipCode VARCHAR(20),
    country VARCHAR(255)
);
