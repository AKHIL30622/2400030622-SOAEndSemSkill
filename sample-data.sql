CREATE DATABASE IF NOT EXISTS tourismdb;
USE tourismdb;
CREATE TABLE IF NOT EXISTS tourists (id BIGINT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), country VARCHAR(255), destination VARCHAR(255));
INSERT INTO tourists (name,country,destination) VALUES ('Rahul','India','Paris'),('John','USA','London'),('Akhil','India','Germany');
