-- Note: The Database name should be in small case letter.

CREATE DATABASE springsec;

CREATE USER security WITH ENCRYPTED PASSWORD 'security';

GRANT ALL PRIVILEGES ON DATABASE springsec TO security;

\q

psql -h 127.0.0.1 -d springsec -U security --password


CREATE TABLE users (
	username VARCHAR(50) NOT NULL PRIMARY KEY,
	password VARCHAR(50) NOT NULL,
	enabled BOOLEAN NOT NULL
);

-- This table will store the roles/authories
CREATE TABLE authorities (
	username VARCHAR(50) NOT NULL,
	authority VARCHAR(50) NOT NULL, -- Roles
	CONSTRAINT fk_authorities_users FOREIGN KEY(username) REFERENCES users(username) -- A foreign key to the users table
);


-- Index
-- CREATE UNIQUE INDEX ix_auth_username ON authorities (username, authority); 
