-- CATEGORY

INSERT INTO public.category (name) VALUES('Cellphone');
INSERT INTO public.category (name) VALUES('Tablets');

-- PRODUCTS

INSERT INTO public.product ("name", price, rating, category_id)
VALUES('iPhone13', 1200, 4 ,1);
INSERT INTO public.product ("name", price, rating, category_id)
VALUES('iPhone8', 200, 3, 1);

-- ADDRESS
INSERT INTO public.address ("city", "street", zip)
VALUES('Fairfield', '106 S D S', 52556);
INSERT INTO public.address ("city", "street", zip)
VALUES('Fairfield', '1000 N 4th S', 52557);

-- USERS for UNI-DIRECTIONAL oneToOne join column
INSERT INTO public.users (email, first_name, last_name, "password", address_id)
VALUES('user@gmail.com', 'John', 'Doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 1);

-- REVIEW for UNI-DIRECTIONAL onToMay join column
INSERT INTO public.review ("comment", user_id)
VALUES('JPA is great', 1);






