-- create_db.sql

CREATE TABLE Person (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name VARCHAR(255),
    age INT
);

CREATE TABLE Job (
    jobId VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255),
    experience INT
);

CREATE TABLE HardSkill (
    hardSkillId VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255),
    level VARCHAR(255)
);

CREATE TABLE SoftSkill (
    softSkillId VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255),
    level VARCHAR(255)
);

CREATE TABLE GiftTalent (
    giftTalentId VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255),
    level VARCHAR(255)
);

CREATE TABLE User (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    username TEXT NOT NULL,
    email TEXT NOT NULL,
    age INTEGER,
    city TEXT
);

CREATE TABLE Employee (
    employeeId VARCHAR(255) PRIMARY KEY,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    birthDate VARCHAR(255),
    gender VARCHAR(255),
    address VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(255)
);

CREATE TABLE Evaluation (
    evaluationId VARCHAR(255) PRIMARY KEY,
    employeeId VARCHAR(255),
    evaluatorId VARCHAR(255),
    date VARCHAR(255),
    comments VARCHAR(255),
    rating INT
);
