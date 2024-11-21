INSERT INTO users(username, password, enabled) VALUES ('admin', '$2a$12$udWBfIzO8aLwvny5XgHPCOE2HxO2SP2VAPej4ysSQXpNeJGgSsX6O', true);
INSERT INTO users(username, password, enabled) VALUES ('user', '$2a$12$MZEHhzgcUTOvwDrPLC.buuEckBBgANo3NBDO07.X4qFGN/t3Cdg4e', true);

INSERT INTO authorities(username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities(username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities(username, authority) VALUES ('user', 'ROLE_USER');
