--User Insertion
INSERT INTO users (id, city,street,zip,email,first_name,last_name,password)
VALUES(1,'Novac','Dinosaur Lookout','0008434B','cBoone@falloutu.com','Craig','Boone','Lastthingyounever$ee');

INSERT INTO users (id, city,street,zip,email,first_name,last_name,password)
VALUES(2,'Freeside','Old Mormon Fort','0011ED01','aGannon@falloutu.com','Arcade I','Gannon','ForAuldLangSyne');

--Category
INSERT INTO category (id, name)
VALUES (1, 'Stationary Object');

INSERT INTO category (id, name)
VALUES (2, 'Non Stationary Object');

--Products
INSERT INTO product (id, name, price, rating, id_user,category_id)
VALUES (1, 'A Bowl of rice on a counter top', 14.92, 3,1,2);

INSERT INTO product (id, name, price, rating, id_user,category_id)
VALUES (2, 'Paper', .08, 10,2,1);

--Review
INSERT INTO review(id,comment,user_id_id,product_id_id)
VALUES(1,'The paper is Tear-Able',1,2)

INSERT INTO review(id,comment,user_id_id,product_id_id)
VALUES(2,'Dont knock it till you try it, and then knock it. Three thumbs down',2,1)
