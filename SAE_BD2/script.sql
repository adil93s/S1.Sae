drop schema if exist covidata;
create schema covidata;

drop table if existes vaccination cascade;
drop table if existes pays cascade;
drop table if existes cas cascade;
drop table if existes mort cascade;
drop table if existes positive cascade;
drop table if existes reproduction cascade;
drop table if existes restriction cascade;
CREATE TABLE covidata.pays(
    idpays INT NOT NULL,
    nom_pays VARCHAR(100),
    nom_continent VARCHAR(100),
);
CREATE TABLE covidata.cas(
    idcas INT NOT NULL,
    newcase_million INT NOT NULL,
    newcase INT NOT NULL,
    test_per_case INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_cas PRIMARY KEY (idcas),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays) 
);
CREATE TABLE covidata.mort(
    idmort INT NOT NULL,
    new_mort_million INT NOT NULL, 
    new_mort INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_mort PRIMARY KEY (idmort),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
CREATE TABLE covidata.positive(
    idpositive INT NOT NULL,
    rate INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_positive PRIMARY KEY (idpositive),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
CREATE TABLE covidata.reproduction(
    idreproduction INT NOT NULL,
    rate INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_reproduction PRIMARY KEY (idreproduction),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
CREATE TABLE covidata.vaccination(
    idvaccination INT NOT NULL,
    new_vaccination INT NOT NULL,
    newvaccination_smoothed INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_vaccination PRIMARY KEY (idvaccination),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
CREATE TABLE covidata.restriction(
    idrestriction INT NOT NULL,
    dates date,
    idpays INT NOT NULL,
    CONSTRAINT pk_restriction PRIMARY KEY (idrestriction),
    CONSTRAINT fk_pays FOREIGN KEY (idpays) REFERENCES pays (idpays)
);
