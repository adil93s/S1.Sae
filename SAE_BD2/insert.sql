INSERT into covidata.pays(idpays ,nom_pays ,nom_continent) 
 values 
 (1,'Andorre','Europe'),
 (2,'Suisse','Europe'),
 (3,'Irlande','Europe'),
 (4,'Italie','Europe'),
 (5,'France','Europe');

INSERT INTO covidata.cas(idcas, newcase_million, newcase, test_per_case, dates, idpays)
 values
 (1,465,36,7.8,'2022-02-12',1),
 (2,3072,26771,2,'2022-02-08',2),
 (3,1139,5677,3,'2022-02-09',3),
 (4,1030,62221,9,'2022-02-12',4),
 (5,2305,155439,3,'2022-02-06',5);
 
 INSERT INTO covidata.positive(idpositive, rate, dates, idpays)
  values
  (1,0.1281,'2021-04-12',1),
  (2,0.397,'2022-02-08',2),
  (3,0.3031,'2022-02-09',3),
  (4,0.1076,'2022-02-12',4),
  (5,0.329,'2022-02-05',5),
  (6,0.328,'2022-02-06',5);

INSERT INTO covidata.mort(idmort, new_mort_million, new_mort, dates, idpays)
    Values
  (1,12.928,1,'2021-04-12',1),
  (2,6.54,57,'2022-02-08',2),
  (3,12.643,63,'2022-02-09',3),
  (4,4.456,269,'2022-02-12',4),
  (5,1.913,129,'2022-02-06',5);

INSERT INTO covidata.reproduction(idreproduction, rate, dates, idpays)
    Values
  (1,0.95,'2021-04-12',1),
  (2,0.91,'2022-02-08',2),
  (3,0.98,'2022-02-09',3),
  (4,0.69,'2022-02-12',4),
  (5,0.8,'2022-02-05',5);
  (6,0.78,'2022-02-06',5);

INSERT INTO covidata.vaccination(idvaccination, new_vaccination, newvaccination_smoothed, dates, idpays) 
   Values
  (1,1973,854,'2021-04-12',1),
  (2,12037,766,'2022-02-08',2),
  (3,7784,1131,'2022-02-09',3),
  (4,273208,26725,'2022-02-12',4),
  (5,41486,9917,'2022-02-06',5);
  
 INSERT INTO covidata.restriction(idrestriction, stringency_index, dates, idpays) 
   Values
  (1,52.78,'2021-04-12',1),
  (2,56.48,'2022-02-08',2),
  (3,23.15,'2022-02-09',3),
  (4,76.85,'2022-02-12',4),
  (5,69.44,'2022-02-06',5);
