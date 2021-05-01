INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Samuka', 'Legal', 'samuka@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Maria', 'Silva', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');


INSERT INTO tb_rule (authority) VALUES ('RULE_OPERATOR');
INSERT INTO tb_rule (authority) VALUES ('RULE_ADMIN');

INSERT INTO tb_user_rule (user_id, rule_id) VALUES (1, 1);
INSERT INTO tb_user_rule (user_id, rule_id) VALUES (2, 1);
INSERT INTO tb_user_rule (user_id, rule_id) VALUES (2, 2);