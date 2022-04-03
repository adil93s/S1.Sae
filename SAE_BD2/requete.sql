/*Moyenne des nouveaux cas en France*/
SELECT avg(newcase) FROM covidata.cas NATURAL JOIN covidata.pays WHERE nom_pays = 'France';

/*Variance du taux positive des pays d'Europe en 2022*/
SELECT variance(rate) FROM covidata.positive WHERE dates > '2022-01-01';

/*Ecart type des nouvellles vaccinations des 5 pays d'Europe*/
SELECT stddev(new_vaccination) FROM covidata.vaccination;
