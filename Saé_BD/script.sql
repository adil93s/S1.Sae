drop table if exists client cascade ;
drop table if exists vol cascade ;
drop table if exists aeroport cascade ;
drop table if exists reservation cascade ;
drop table if exists compagnie cascade ;
drop table if exists ville cascade ;
drop table if exists pays cascade ;
drop table if exists statut cascade ;
drop table if exists classe cascade ;

CREATE TABLE compagnie
(
    id_compagnie INT NOT NULL,
    nom_compagnie VARCHAR(100),
    CONSTRAINT pk_compagnie PRIMARY KEY (id_compagnie)
);

CREATE TABLE pays 
(
    id_pays INT NOT NULL,
    nom_pays VARCHAR(255),
    CONSTRAINT pk_pays PRIMARY KEY (id_pays)
);

CREATE TABLE ville 
(
    id_ville INT NOT NULL,
    nom_ville VARCHAR(255),
    id_pays INT NOT NULL, 
    CONSTRAINT pk_ville PRIMARY KEY (id_ville),
    CONSTRAINT fk_pays FOREIGN KEY (id_pays) REFERENCES pays (id_pays)    
);

CREATE TABLE statut 
(
    id_statut INT NOT NULL,
    statut VARCHAR(100),
    CONSTRAINT pk_statut PRIMARY KEY (id_statut)
);

CREATE TABLE classe 
(
    id_classe INT NOT NULL,
    classe VARCHAR(100),
    CONSTRAINT pk_classe PRIMARY KEY (id_classe)
);

CREATE TABLE aeroport 
(
    code_aeroport VARCHAR(50) NOT NULL,
    nom_aeroport VARCHAR(255),
    id_ville INT NOT NULL,
    id_pays INT NOT NULL,
    id_compagnie INT NOT NULL,
    CONSTRAINT pk_aeroport PRIMARY KEY (code_aeroport),
    CONSTRAINT fk_pays FOREIGN KEY (id_pays) REFERENCES pays (id_pays),
    CONSTRAINT fk_ville FOREIGN KEY (id_ville) REFERENCES ville (id_ville),
    CONSTRAINT fk_compagnie FOREIGN KEY (id_compagnie) REFERENCES compagnie (id_compagnie)    
);


CREATE TABLE vol
(
    num_vol INT NOT NULL,
    date_heure_depart VARCHAR(255),
    date_heure_arrive VARCHAR(255),
    capacite INT,
    aeroport_depart VARCHAR(255),
    aeroport_arrive VARCHAR(255),
    id_compagnie INT NOT NULL,
    CONSTRAINT pk_vol PRIMARY KEY (num_vol),  
    CONSTRAINT fk_compagnie FOREIGN KEY (id_compagnie) REFERENCES compagnie (id_compagnie)    
);

CREATE TABLE client
(
    id_client INT NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    mail VARCHAR(255),
    num_passeport VARCHAR(100),
    date_naissance DATE,
    nationalite VARCHAR(255),
    sexe VARCHAR(100),
    adresse VARCHAR(255),
    telephone BIGINT,
    CONSTRAINT pk_client PRIMARY KEY (id_client)
);

CREATE TABLE reservation
(
    num_reservation INT NOT NULL,
    ville_reservation VARCHAR(100),
    date_reservation DATE,
    date_heure_depart VARCHAR(255),
    date_heure_arrive VARCHAR(255),
    prix INT,
    num_vol INT NOT NULL,
    id_client INT NOT NULL,
    id_classe INT NOT NULL,
    id_statut INT NOT NULL,
    CONSTRAINT pk_reservation PRIMARY KEY (num_reservation),    
    CONSTRAINT fk_reservation_vol FOREIGN KEY (num_vol) REFERENCES vol (num_vol), 
    CONSTRAINT fk_client FOREIGN KEY (id_client) REFERENCES client (id_client), 
    CONSTRAINT fk_classe FOREIGN KEY (id_classe) REFERENCES classe (id_classe),  
    CONSTRAINT fk_statut FOREIGN KEY (id_statut) REFERENCES statut (id_statut)    
);
