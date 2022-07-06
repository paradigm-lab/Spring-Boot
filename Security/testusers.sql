-- Users to test in the database

/*
INSERT INTO users (username, password, enabled) values ('matt', 'password', 'True');
INSERT INTO users (username, password, enabled) values ('collin', 'password', 'True');
INSERT INTO users (username, password, enabled) values ('kwawingu', 'password', 'True');
*/

-- authorities table
INSERT INTO authorities (username, authority) values ('matt', 'ADMIN');
INSERT INTO authorities (username, authority) values ('matt', 'USER');

INSERT INTO authorities (username, authority) values ('collin', 'USER');
INSERT INTO authorities (username, authority) values ('kwawingu', 'USER');

