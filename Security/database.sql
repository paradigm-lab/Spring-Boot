-- Note: The Database name should be in small case letter.

CREATE DATABASE springsec;

CREATE USER security WITH ENCRYPTED PASSWORD 'security';

GRANT ALL PRIVILEGES ON DATABASE springsec TO security;

\q

psql -h 127.0.0.1 -d springsec -U security --password

