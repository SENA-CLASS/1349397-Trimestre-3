-- crear una base de datos
create database adsi;
CREATE SCHEMA `new_schema` DEFAULT CHARACTER SET utf8 ;

-- crear un schema
create schema grupo1349397; 

-- en mysql un schema es igual a una database

-- eliminar un schema
drop schema adsi;

-- elimar una base de datos
drop database adsi;

alter schema adsi default character set latin1;
ALTER SCHEMA ejemplo  DEFAULT CHARACTER SET utf8;
ALTER SCHEMA `ejemplo`  DEFAULT CHARACTER SET latin1 ;

-- muestra todos los character set
SHOW CHARACTER SET;

-- muesta tdos los collation
show collation;

-- tipos de datos
-- numericos

-- bit

CREATE TABLE adsi.tipo_datos (
    a INT PRIMARY KEY,
    campo_bit BIT
);
INSERT INTO adsi.tipo_datos (a,campo_bit) VALUES ('3',b'11');

UPDATE `adsi`.`tipo_datos` SET `campo_bit`=b'10101010' WHERE `a`='1';

CREATE TABLE t (b BIT(8));
INSERT INTO t SET b = b'11111111';

-- tinyint
CREATE TABLE adsi.tipo_datos (
    a INT PRIMARY KEY,
    campo_1 tinyint,
    campo_2 tinyint unsigned
    
);

INSERT INTO adsi.tipo_datos (a,campo_1,campo_2) VALUES ('1','127','123');

-- boolean

CREATE TABLE adsi.tipo_datos (
    a INT PRIMARY KEY,
    campo_1 boolean,
    campo_2 bool
    
);

INSERT INTO adsi.tipo_datos (a,campo_1,campo_2) VALUES ('1',true,false);


drop table adsi.tipo_datos;
commit;
rollback;









