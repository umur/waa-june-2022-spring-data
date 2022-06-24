-- USERS

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (3, 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (4, 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (5, 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (6, 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123


-- PRODUCTS
--
INSERT INTO product (id, name, price, rating, user_id)
VALUES (1, 'iPhone', 1200, 10, 1);

INSERT INTO product (id, name, price, rating, user_id)
VALUES (2, 'iPad', 900, 10, 1);

INSERT INTO product (id, name, price, rating, user_id)
VALUES (3, 'Pen', 5, 10, 1);

-- REVIEWS

INSERT INTO review (id,comment,product_id,user_id)
VALUES (1,'awesome phone',1,1);

INSERT INTO review (id,comment,product_id,user_id)
VALUES (2,'amazing phone',1,1);

INSERT INTO review (id,comment,product_id,user_id)
VALUES (3,'awesome tablet',1,2);