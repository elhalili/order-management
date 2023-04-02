CREATE TABLE product (
                         id int AUTO_INCREMENT PRIMARY KEY,
                         name varchar(255),
                         price float(10, 3)
    );

CREATE TABLE client (
                        num int AUTO_INCREMENT PRIMARY KEY,
                        name varchar(255)
);

CREATE TABLE order (
                       id int AUTO_INCREMENT PRIMARY KEY,
                       date date,
                       client_num int REFERENCES client(num)
);

CREATE TABLE order_detail (
                              id int AUTO_INCREMENT PRIMARY KEY,
                              qte int,
                              order_id int REFERENCES order(id),
                              product_id int REFERENCES product(id)
);
