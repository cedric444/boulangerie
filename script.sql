DROP DATABASE boulangerie IF EXISTS;

CREATE DATABASE boulangerie;

DROP TABLE adresse IF EXISTS;
DROP TABLE client IF EXISTS;
DROP TABLE categorie IF EXISTS;
DROP TABLE produit IF EXISTS;
DROP TABLE reservation IF EXISTS;

CREATE TABLE adresse(
    id bigint NOT NULL AUTO_INCREMENT,
    rue VARCHAR(150) NOT NULL,
    code_postal VARCHAR(5) NOT NULL,
    ville VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE client(
    id bigint  NOT NULL AUTO_INCREMENT,
    nom VARCHAR(100) NOT NULL,
    prenom VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    mot_de_passe VARCHAR(50) NOT NULL,
    telephone VARCHAR(10),
    id_adresse bigint,
    PRIMARY KEY(id)
);

CREATE TABLE categorie(
    id int NOT NULL AUTO_INCREMENT,
    libelle VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE produit(
    id int NOT NULL AUTO_INCREMENT,
    nom VARCHAR(100) NOT NULL,
    description MEDIUMTEXT,
    prix float,
    photo VARCHAR(150),
    PRIMARY KEY(id)
);

CREATE TABLE reservation(
    id_client bigint NOT NULL,
    id_produit int NOT NULL,
    date_reservation date NOT NULL,
    date_retrait date NOT NULL,
    PRIMARY KEY(id_client, id_produit),
    FOREIGN KEY(id_client) REFERENCES client(id),
    FOREIGN KEY(id_produit) REFERENCES produit(id)  
);