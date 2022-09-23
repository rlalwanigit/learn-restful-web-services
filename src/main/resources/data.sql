INSERT INTO user_details(id,birth_date,name)
VALUES (1001, current_date(), 'Rohit');
INSERT INTO user_details(id,birth_date,name)
VALUES (1002, current_date(), 'Ram');
INSERT INTO user_details(id,birth_date,name)
VALUES (1003, current_date(), 'Rohan');

INSERT INTO post(id,description,user_id)
VALUES (2001,'I want to learn',1001);
INSERT INTO post(id,description,user_id)
VALUES (2002,'I want to dance',1001);
INSERT INTO post(id,description,user_id)
VALUES (2003,'I want to sing',1002);