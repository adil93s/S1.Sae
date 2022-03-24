INSERT into pays(idpays ,nom_pays ,nom_continent) 
 values 
 (1,'Andorre','Europe'),
 (2,'Suisse','Europe'),
 (3,'Irlande','Europe'),
 (4,'Italie','Europe'),
 (5,'France','Europe');

INSERT INTO cas(idcas, newcase_million, newcase, test_per_case, dates, idpays)
 values
 (1,,,,1),
 (2,,,,2),
 (3,,,,3),
 (4,,,,4),
 (5,,,,5);
 
 INSERT INTO mort(idmort, new_mort_million, new_mort, dates, idpays)
  values
  (1,,,1),
  (2,,,2),
  (3,,,3),
  (4,,,4),
  (5,,,5);
 
