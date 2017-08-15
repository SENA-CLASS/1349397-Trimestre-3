-- DML

-- insert

insert into adsi.casa1(matricula, direccion) values ('235','23542354');
insert into adsi.casa1 values ('1234','23542354');
insert into adsi.casa1 values ('1234','23542354'), ('345235','23542354');

CREATE TABLE adsi.ejemplo2 (
  idnew_table INT NOT NULL,
  hora TIME NULL,
  fecha DATE NULL,
  
  PRIMARY KEY (idnew_table));
  
  -- insert con on duplicate
  INSERT INTO adsi.ejemplo2
  (idnew_table ,
  fecha,hora  )
VALUES
(3,
'2017-01-01',
'12:00:00') on duplicate key update fecha='2017-01-02', hora='15:00:00';

-- insert con set
insert into adsi.casa1 set matricula='234', direccion='sdfasd';

-- insert con una subconsulta

INSERT INTO adsi.casa2
(matricula,
direccion)
SELECT * FROM adsi.casa1;

-- update

UPDATE adsi.casa1
SET
matricula = 'asdfg',
direccion = 'nueva direccion'
WHERE matricula = '123';

INSERT INTO `Horario_DB2`.`Documento`
(`id_Documento`,
`Nombre`,
`Estado`)
VALUES
('CC',
'CEDULA DE CIUDADANIA',
true);

INSERT INTO Horario_DB2.Persona
(numero_Documento,
primer_Nombre,
segundo_Nombre,
primer_Apellido,
segundo_Apellido,
document)
VALUES
('80013833',
'Hernando',
'Enrique',
'Moreno',
'Moreno',
'CC');

UPDATE `Horario_DB2`.`Persona`
SET
`numero_Documento` = '12345',
`primer_Nombre` = 'herna',
`segundo_Nombre` = 'enri',
`primer_Apellido` ='mor',
`segundo_Apellido` = 'mor',

`document` = 'CC'
WHERE `numero_Documento` = '80013833' AND `document` = 'CC';

UPDATE `Horario_DB2`.`Documento`
SET
`id_Documento` = 'CCC',
`Nombre` = 'Cedula colombiana de ciudadania',
`Estado` = true
WHERE `id_Documento` = 'CC';

-- delete

DELETE FROM `adsi`.`casa1`
WHERE matricula='1234';


-- consulta 

select * from adsi.casa1;







































