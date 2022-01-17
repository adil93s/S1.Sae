DROP SCHEMA bookwing cascade;
CREATE SCHEMA bookwing;

CREATE TABLE bookwing.client
(
    id_client INT NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    mail VARCHAR(255),
    numero_passeport VARCHAR(255),
    date_naissance DATE,
    nationalité VARCHAR(255),
    sexe VARCHAR(100),
    adresse VARCHAR(255),
    telephone INT,
    num_reservation INT NOT NULL,
    CONSTRAINT pk_client PRIMARY KEY (id_client),
    CONSTRAINT fk_reservation FOREIGN KEY (num_reservation) REFERENCES reservation (num_reservation)    
);

CREATE TABLE bookwing.vol
(
    num_vol INT KEY NOT NULL,
    date_heure_depart VARCHAR(255),
    date_heure_arrive VARCHAR(255),
    aeroport_depart VARCHAR(255),
    aeroport_arrive VARCHAR(255),
    capacité INT,
    id_compagnie INT NOT NULL,
    CONSTRAINT pk_vol PRIMARY KEY (num_vol),
    CONSTRAINT fk_compagnie FOREIGN KEY (id_compagnie) REFERENCES compagnie (id_compagnie)    
);

CREATE TABLE bookwing.aeroport 
(
    code_aeroport VARCHAR(50) NOT NULL,,
    nom_aeroport VARCHAR(255),
    taxe INT,
    id_ville INT NOT NULL,
    id_pays INT NOT NULL,
    id_compagnie INT NOT NULL,
    CONSTRAINT pk_aeroport PRIMARY KEY (code_aeroport),
    CONSTRAINT fk_pays FOREIGN KEY (id_pays) REFERENCES pays (id_pays)    
    CONSTRAINT fk_ville FOREIGN KEY (id_ville) REFERENCES ville (id_ville)    
    CONSTRAINT fk_compagnie FOREIGN KEY (id_compagnie) REFERENCES compagnie (id_compagnie)    
);

CREATE TABLE bookwing.reservation
(
    num_reservation INT PRIMARY KEY NOT NULL,
    ville_reservation VARCHAR(100),
    date_reservation DATE,
    date_heure_depart VARCHAR(255),
    date_heure_arrive VARCHAR(255),
    prix INT,
    id_client INT NOT NULL,
    id_classe INT NOT NULL,
    id_statut INT NOT NULL,
    CONSTRAINT pk_reservation PRIMARY KEY (num_reservation),
    CONSTRAINT fk_client FOREIGN KEY (id_client) REFERENCES client (id_client)    
    CONSTRAINT fk_classe FOREIGN KEY (id_classe) REFERENCES classe (id_classe)    
    CONSTRAINT fk_statut FOREIGN KEY (id_statut) REFERENCES statut (id_statut)    
);

CREATE TABLE bookwing.compagnie
(
    id_compagnie INT NOT NULL,
    nom_compagnie VARCHAR(100),
    CONSTRAINT pk_compagnie PRIMARY KEY (id_compagnie)
);

CREATE TABLE bookwing.ville 
(
    id_ville INT NOT NULL,
    nom_ville VARCHAR(255),
    id_pays INT NOT NULL, 
    CONSTRAINT pk_ville PRIMARY KEY (id_ville),
    CONSTRAINT fk_pays FOREIGN KEY (id_pays) REFERENCES pays (id_pays)    
);

CREATE TABLE bookwing.pays 
(
    id_pays INT NOT NULL,
    nom_pays VARCHAR(255),
    CONSTRAINT pk_pays PRIMARY KEY (id_pays)
);

CREATE TABLE bookwing.statut 
(
    id_statut INT NOT NULL,
    statut VARCHAR(100),
    CONSTRAINT pk_statut PRIMARY KEY (id_statut)
);

CREATE TABLE bookwing.pays 
(
    id_classe INT NOT NULL,
    classe VARCHAR(100),
    CONSTRAINT pk_classe PRIMARY KEY (id_classe)
);
