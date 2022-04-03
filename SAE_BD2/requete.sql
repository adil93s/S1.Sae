/*Moyenne des nouveaux cas en France*/
SELECT avg(newcase) FROM covidata.cas NATURAL JOIN covidata.pays WHERE nom_pays = 'France';
/*Moyenne des nouveaux cas par million en Suisse*/
SELECT avg(newcase_million) FROM covidata.cas NATURAL JOIN covidata.pays WHERE nom_pays = 'Suisse';
/*Moyenne des nouveaux mort en Italie*/
SELECT avg(new_mort) FROM covidata.mort NATURAL JOIN covidata.pays WHERE nom_pays = 'Italie';

/*Variance du taux positive des pays d'Europe en 2022*/
SELECT variance(rate) FROM covidata.positive WHERE dates > '2022-01-01';
/*Variance du taux positive des 5 pays d'Europe*/
SELECT variance(rate) FROM covidata.reproduction;
/*Variance des nouveaux mort par million en Europe*/
SELECT variance(new_mort_million) FROM covidata.mort;

/*Ecart type des nouvellles vaccinations des 5 pays d'Europe*/
SELECT stddev(new_vaccination) FROM covidata.vaccination;
/*Ecart type des test par cas des pays d'Europe en 2022*/
SELECT stddev(test_per_case) FROM covidata.cas WHERE dates > '2022-01-01';
/*Ecart type du taux de restriction des pays d'Europe*/
SELECT stddev(stringency_index) FROM covidata.restriction;
/*Ecart type des nouvelles vaccination smoothed en France*/
SELECT stddev(newvaccination_smoothed) FROM covidata.vaccination NATURAL JOIN covidata.pays WHERE nom_pays = 'France';
