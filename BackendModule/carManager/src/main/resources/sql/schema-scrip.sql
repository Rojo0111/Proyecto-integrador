CREATE SCHEMA IF NOT EXISTS car_manager;

use car_manager;

CREATE TABLE user (
  user_id VARCHAR(50) NOT NULL PRIMARY KEY,
  name VARCHAR(50),
  last_name VARCHAR(50),
  email VARCHAR(50),
  phone VARCHAR(255)
);

CREATE TABLE car(
  card_id PRIMARY KEY NOT NULL,
  user_id FOREIGN KEY REFERENCES user(user_id),
  detail_id FOREIGN KEY REFERENCES car_detail(car_detail_id)
);

CREATE TABLE car_details(
car_details_id PRIMARY KEY NOT NULL,
model VARCHAR(50),
owner VARCHAR(255),
car_year VARCHAR(50),
last_revision DATE,
kilometers INT,
);

CREATE TABLE products(
product_id PRIMARY KEY NOT NULL,
product_details_id FOREIGN KEY REFERENCES products_details(product_details_id)
);

CREATE TABLE products_details(
product_details_id PRIMARY KEY NOT NULL,
price VARCHAR(50),
product_name VARCHAR(255)
);