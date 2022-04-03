drop table if exists covidata.vaccination cascade;
drop table if exists covidata.pays cascade;
drop table if exists covidata.cas cascade;
drop table if exists covidata.mort cascade;
drop table if exists covidata.positive cascade;
drop table if exists covidata.reproduction cascade;
drop table if exists covidata.restriction cascade;
drop schema if exists covidata;

create schema covidata;

CREATE TABLE covidata.pays(
    idpays INT NOT NULL,
    nom_pays VARCHAR(100),
    nom_continent VARCHAR(100),
    CONSTRAINT pk_pays PRIMARY KEY (idpays)
);

CREATE TABLE covidata.cas(
    idcas INT NOT NULL,
    newcase_million INT NOT NULL,
    newcase INT NOT NULL,
    test_per_case FLOAT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_cas PRIMARY KEY (idcas),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES covidata.pays (idpays) 
);

CREATE TABLE covidata.mort(
    idmort INT NOT NULL,
    new_mort_million FLOAT NOT NULL, 
    new_mort FLOAT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_mort PRIMARY KEY (idmort),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES covidata.pays (idpays)
);

CREATE TABLE covidata.positive(
    idpositive INT NOT NULL,
    rate FLOAT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_positive PRIMARY KEY (idpositive),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES covidata.pays (idpays)
);

CREATE TABLE covidata.reproduction(
    idreproduction INT NOT NULL,
    rate FLOAT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_reproduction PRIMARY KEY (idreproduction),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES covidata.pays (idpays)
);

CREATE TABLE covidata.vaccination(
    idvaccination INT NOT NULL,
    new_vaccination INT NOT NULL,
    newvaccination_smoothed INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_vaccination PRIMARY KEY (idvaccination),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES covidata.pays (idpays)
);

CREATE TABLE covidata.restriction(
    idrestriction INT NOT NULL,
    stringency_index FLOAT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_restriction PRIMARY KEY (idrestriction),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES covidata.pays (idpays)
);
