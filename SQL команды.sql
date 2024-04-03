DROP DATABASE IF EXISTS animals;
CREATE DATABASE animals;
USE animals;
DROP TABLE IF EXISTS type_of_animals;
CREATE TABLE type_of_animals
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    type_animals VARCHAR(45)
);

INSERT INTO type_of_animals (type_animals) VALUES 
('Pets'),
('Packanimals');

CREATE TABLE pets
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    type_pets VARCHAR(45),
    class_id INT,
    FOREIGN KEY (class_id) REFERENCES type_of_animals(id)
);

INSERT INTO pets (type_pets, class_id) VALUES 
('Dog', 1),
('Cat', 1),
('Hamster', 1);

CREATE TABLE packanimals
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    type_packanimals VARCHAR(45),
    class_id INT,
    FOREIGN KEY (class_id) REFERENCES type_of_animals(id)
);

INSERT INTO packanimals (type_packanimals, class_id) VALUES 
('Horse', 2),
('Camel', 2),
('Donkey', 2);


DROP TABLE IF EXISTS dog;
CREATE TABLE dog
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    comands VARCHAR(80),
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES pets(id)
);
INSERT INTO dog (nickname, birthday, comands, type_id) VALUES 
('Жучка', '2022-02-03', 'сидеть, лежать', 1),
('Карри', '2021-01-31', 'сидеть, лежать, ждать', 1),
('Дружок', '2019-10-12', '', 1);


DROP TABLE IF EXISTS cat;
CREATE TABLE cat
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    comands VARCHAR(80),
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES pets(id)
);
INSERT INTO cat (nickname, birthday, comands, type_id) VALUES 
('Мурка', '2015-05-03', 'еда', 2),
('Ева', '2016-09-30', 'сидеть, место', 2);

DROP TABLE IF EXISTS hamster;
CREATE TABLE hamster
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    comands VARCHAR(80),
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES pets(id)
);

INSERT INTO hamster (nickname, birthday, comands, type_id) VALUES 
('Хома', '2023-06-16', 'играть', 3),
('Ева', '2024-01-30', '', 3);

DROP TABLE IF EXISTS horse;
CREATE TABLE horse
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    comands VARCHAR(80),
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES packanimals(id)
);

INSERT INTO horse (nickname, birthday, comands, type_id) VALUES 
('Рыжик', '2015-06-16', 'стоять, вперед, поклон', 1),
('Вороной', '2014-09-25', 'стоять, вперед', 1),
('Герцог', '2020-08-31', 'стоять, вперед, поклон, рысь, прыжок', 1);

DROP TABLE IF EXISTS camel;
CREATE TABLE camel
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    comands VARCHAR(80),
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES packanimals(id)
);

INSERT INTO camel (nickname, birthday, comands, type_id) VALUES 
('Колючка', '2022-07-16', 'стоять, вперед', 2),
('Седой', '2014-02-03', 'стоять, вперед, сидеть', 2);

DROP TABLE IF EXISTS donkey;
CREATE TABLE donkey
(	
	id INT PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    comands VARCHAR(80),
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES packanimals(id)
);

INSERT INTO donkey (nickname, birthday, comands, type_id) VALUES 
('Упрямый', '2010-08-28', '', 3);


SELECT * FROM horse
UNION
SELECT * FROM donkey;

-- DELETE FROM camel;

DROP TABLE IF EXISTS all_animals;
CREATE TEMPORARY TABLE all_animals AS
SELECT * FROM cat
UNION
SELECT * FROM dog
UNION
SELECT * FROM hamster
UNION
SELECT * FROM horse
UNION
SELECT * FROM donkey
UNION
SELECT * FROM camel;

DROP TABLE IF EXISTS young_animals;
CREATE TABLE young_animals
SELECT
	nickname,
    birthday, 
    comands, 
    concat(cast(timestampdiff(year, birthday, NOW()) AS CHAR), ' года ',
    mod(cast(timestampdiff(month, birthday, NOW()) AS CHAR), 12), ' месяцев' ) AS age
FROM 
	all_animals
WHERE timestampdiff(month, birthday, NOW()) BETWEEN 12 AND 36;

SELECT * FROM young_animals;

DROP TABLE IF EXISTS animals;
CREATE TABLE animals
SELECT
	d.nickname,
    p.type_pets,
    d.birthday,
    d.comands,
    ta.type_animals
FROM dog d
JOIN pets p ON d.type_id = p.id
JOIN type_of_animals ta ON p.class_id = ta.id
UNION
SELECT
	c.nickname,
    p.type_pets,
    c.birthday,
    c.comands,
    ta.type_animals
FROM cat c
JOIN pets p ON c.type_id = p.id
JOIN type_of_animals ta ON p.class_id = ta.id
UNION
SELECT
	ha.nickname,
    p.type_pets,
    ha.birthday,
    ha.comands,
    ta.type_animals
FROM hamster ha
JOIN pets p ON ha.type_id = p.id
JOIN type_of_animals ta ON p.class_id = ta.id
UNION
SELECT
	h.nickname,
    pa.type_packanimals,
    h.birthday,
    h.comands,
    ta.type_animals
FROM horse h
JOIN packanimals pa ON h.type_id = pa.id
JOIN type_of_animals ta ON pa.class_id = ta.id
UNION
SELECT
	cl.nickname,
    pa.type_packanimals,
    cl.birthday,
    cl.comands,
    ta.type_animals
FROM camel cl
JOIN packanimals pa ON cl.type_id = pa.id
JOIN type_of_animals ta ON pa.class_id = ta.id
UNION
SELECT
	dy.nickname,
    pa.type_packanimals,
    dy.birthday,
    dy.comands,
    ta.type_animals
FROM donkey dy
JOIN packanimals pa ON dy.type_id = pa.id
JOIN type_of_animals ta ON pa.class_id = ta.id;
    
SELECT * FROM animals;

SELECT * FROM camel;
SELECT * FROM cat;
SELECT * FROM hamster;


