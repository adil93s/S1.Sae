/*Moyenne des nouveaux cas des 5 pays d'Europe*/
SELECT avg(newcase) FROM covidata.cas;

/*Variance du taux positive des 5 pays d'Europe */
SELECT variance(rate) FROM covidata.positive;

/*Ecart type des nouvellles vaccinations des 5 pays d'Europe*/
SELECT stddev(new_vaccination) FROM covidata.vaccination;
