-- exercicio 1

CREATE TABLESPACE aebd_tables
DATAFILE '\u01\app\oracle\oradata\orcl12\orcl\aebd_tables_01.dbf' SIZE 100M

-- exercicio 2

CREATE TEMPORARY TABLESPACE aebd_temp
TEMPFILE '\u01\app\oracle\oradata\orcl12\orcl\aebd_temp_01.dbf' SIZE 50M
AUTOEXTEND ON

-- exercicio 3

SELECT * FROM dba_tablespaces

-- exercicio 4

CREATE USER JoaoNA
IDENTIFIED BY joao
DEFAULT TABLESPACE aebd_tables
TEMPORARY TABLESPACE aebd_temp;
GRANT CONNECT TO JoaoNA;

-- exercicio 5

SELECT * FROM dba_users

-- FICHA 5

-- exercicio 1a
 
 CREATE ROLE role;
 
GRANT CREATE table, CREATE view, CREATE procedure, CREATE trigger
TO role;

GRANT role TO JoaoNA;

CREATE TABLE PATROCINADOR (
    ID_PATROCINADOR NUMBER(5) PRIMARY KEY,
    NOME VARCHAR(200) NOT NULL,
    MONTANTE NUMBER(5) NOT NULL)
    TABLESPACE aebd_tables
    STORAGE (INITIAL 50K);


