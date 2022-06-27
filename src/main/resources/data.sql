INSERT INTO address (id, city, street, zip)
VALUES (1, 'Fairfield', '1000n', 52577);

INSERT INTO address (id, city, street, zip)
VALUES (2, 'Ottumwa', '2000n', 52588);

INSERT INTO address (id, city, street, zip)
VALUES (3, 'Burlington', '3000n', 52599);


INSERT INTO users (id, email, first_name, last_name, password, address_id)
VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 1); --123

INSERT INTO users (id, email, first_name, last_name, password, address_id)
VALUES (2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 2); --123

INSERT INTO users (id, email, first_name, last_name, password, address_id)
VALUES (3, 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 3); --123

INSERT INTO users (id, email, first_name, last_name, password, address_id)
VALUES (4, 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 1); --123

INSERT INTO users (id, email, first_name, last_name, password, address_id)
VALUES (5, 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 2); --123

INSERT INTO users (id, email, first_name, last_name, password, address_id)
VALUES (6, 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 3); --123

-- Category
INSERT INTO category (id, name)
VALUES (1, 'phone');

INSERT INTO category (id, name)
VALUES (2, 'computer');

-- PRODUCTS

INSERT INTO product (id, name, price, rating, category_id, user_id)
VALUES (1, 'iPhone', 1200, 4.5, 1, 2);

INSERT INTO product (id, name, price, rating, category_id, user_id)
VALUES (2, 'iPad', 1200, 4.2, 1, 3);

INSERT INTO product (id, name, price, rating, category_id, user_id)
VALUES (3, 'Lenovo', 1200, 4.5, 2, 4);

-- REVIEWS

INSERT INTO REVIEW (id,comment,product_id, user_id)
VALUES (1,'awesome phone',1, 1);

INSERT INTO REVIEW (id,comment,product_id, user_id)
VALUES (2,'amazing phone', 1, 2);

INSERT INTO REVIEW (id,comment, product_id, user_id)
VALUES (3,'awesome tablet', 2, 3);