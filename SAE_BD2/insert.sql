INSERT into pays(idpays ,nom_pays ,nom_continent) 
 values 
 (1,'Andorre','Europe'),
 (2,'Suisse','Europe'),
 (3,'Irlande','Europe'),
 (4,'Italie','Europe'),
 (5,'France','Europe');

INSERT INTO cas(idcas, newcase_million, newcase, test_per_case, dates, idpays)
 values
 (1,,,,12/02/2022,1),
 (2,3072,26771,2,08/02/2022,2),
 (3,1139,5677,3,09/02/2022,3),
 (4,1030,62221,9,12/02/2022,4),
 (5,2305,155439,3,06/02/2022,5);
 
 INSERT INTO positive(idpositive, rate, dates, idpays)
  values
  (1,,,1),
  (2,0.397,08/02/2022,2),
  (3,0.3031,09/02/2022,3),
  (4,0.1076,12/02/2022,4),
  (5,0.328,06/02/2022,5);

    INSERT INTO reproduction(idreproduction, rate, dates, idpays)
    Values
  (1,,,1),
  (2,0.397,08/02/2022,2),
  (3,0.3031,09/02/2022,3),
  (4,0.1076,12/02/2022,4),
  (5,0.328,06/02/2022,5);

INSERT INTO reproduction(idreproduction, rate, dates, idpays)
    Values
  (1,,,1),
  (2,0.397,08/02/2022,2),
  (3,0.3031,09/02/2022,3),
  (4,0.1076,12/02/2022,4),
  (5,0.328,06/02/2022,5);
