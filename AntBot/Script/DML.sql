-- database: ../database/EXOBOT.sqlite

insert INTO IABot ( Nombre,Observacion ) VALUES("IA-RUSO" ,"" );

INSERT INTO AntBot(IdIABot,Nombre,Serie) 
VALUES(1,"exabot1","Serie E1"),
(1,"exabot2","Serie E2"),
(1,"exabot3","Serie E3"),
(1,"exabot4","Serie E4"),
(1,"exabot5","Serie E5"),
(1,"exabot6","Serie E6");


SELECT * FROM AntBot;

SELECT  IdExaBot, IdIABot, Nombre, Serie FROM ExaBot;


INSERT INTO HormigaTipo(Nombre,IdHormigaTipoPadre)
VALUES  ( "Reina",null ),
        ( "Rastreadora",1 ),
        ( "Larva",1 ),
        ( "Soldado",1 ),
        ( "Zangano",1 );
SELECT * FROM PersonaTipo;

INSERT INTO PersonaTipo(Nombre)
VALUES  ( "Mecatronico"),
        ( "Experto en ingles"),
        ( "Experto en Español");
SELECT * FROM PersonaTipo;
INSERT INTO Persona  
( IdPersonaTipo, Cedula, Nombre) VALUES
( 1,  "11111", "pepe"),
( 2,  "22222", "juan"),
( 3,  "33333", "pedro");

INSERT INTO Hormiga  
( IdHormigaTipo,Codigo, Nombre) VALUES
( 1,  "11111", "lola"),
( 2,  "22222", "paco"),
( 3,  "33333", "jeremy");

SELECT * FROM Persona;
