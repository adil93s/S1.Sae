drop table if existes vaccination cascade;
drop table if existes pays cascade;
drop table if existes cas cascade;
drop table if existes mort cascade;
drop table if existes positive cascade;
drop table if existes reproduction cascade;
CREATE TABLE pays(
    idpays INT NOT NULL,
    nom_pays VARCHAR(100),
    nom_continent VARCHAR(100),
    stringecy_index INT NOT NULL,
);
CREATE TABLE cas(
    idcas INT NOT NULL,
    newcase_million INT NOT NULL,
    newcase INT NOT NULL,
    test_per_case INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_cas PRIMARY KEY (idcas),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays) 
);
CREATE TABLE mort(
    idmort INT NOT NULL,
    new_mort_million INT NOT NULL, 
    new_mort INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_mort PRIMARY KEY (idmort),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
CREATE TABLE positive(
    idpositive INT NOT NULL,
    rate INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_positive PRIMARY KEY (idpositive),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
CREATE TABLE reproduction(
    idreproduction INT NOT NULL,
    rate INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_reproduction PRIMARY KEY (idreproduction),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
CREATE TABLE vaccination(
    idvaccination INT NOT NULL,
    new_vaccination INT NOT NULL,
    newvaccination_smoothed INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_vaccination PRIMARY KEY (idvaccination),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
