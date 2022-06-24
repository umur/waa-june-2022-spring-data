-- CREATE DATABASE spring_data_db;
--
--CREATE DATABASE spring_data_db;
--
-- USE spring_data;
--
--
----users
--
--CREATE TABLE user (
--  id INT NOT NULL AUTO_INCREMENT,
--  email VARCHAR(45) NULL,
--  firstName VARCHAR(45) NULL,
--  lastName VARCHAR(45) NULL,
--  password VARCHAR(45) NULL,
--  PRIMARY KEY (id)
--);

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (1, 'robeilaregawi@miu.edu', 'Robeil', 'Aregawi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (2, 'keleab@miu.edu', 'Keleab', 'Brhanemeskel', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (3, 'soliana@miu.edu', 'Soliana', 'Robeil', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (4, 'meron@miu.edu', 'Meron', 'Tekle', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2');


--products

INSERT INTO product (id, name, price, rating)
VALUES (1, 'iPhone', 1200, 5);

INSERT INTO product (id, name, price, rating)
VALUES (2, 'iPad', 900, 4);

INSERT INTO product (id, name, price, rating)
VALUES (3, 'Pen', 5, 3);

-- reviews

INSERT INTO REVIEW (id,comment,number_of_stars,user_id)
VALUES (1,'awesome phone',5,1);

INSERT INTO REVIEW (id,comment,number_of_stars,user_id)
VALUES (2,'amazing phone',5,2);

INSERT INTO REVIEW (id,comment,number_of_stars,user_id)
VALUES (3,'awesome tablet',3,3);

-- Address
INSERT INTO Address (id,street,zip,city,user_id)
VALUES (1,'176th','98188','Seattle',1);

INSERT INTO Address (id,street,zip,city,user_id)
VALUES (2,'south', '98188', 'Seattle',2);

INSERT INTO Address (id,street,zip,city,user_id)
VALUES (3, '176th', '98188', 'Seattle',3);

INSERT INTO Address (id,street,zip,city,user_id)
VALUES (4,'north','98188','Seattle',4);
