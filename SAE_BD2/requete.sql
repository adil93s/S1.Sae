SELECT avg(newcase) FROM covidata.cas NATURAL JOIN covidata.pays WHERE nom_pays = 'France';

SELECT var(rate) FROM covidata.postive NATURAL JOIN covidata.pays WHERE nom_pays = 'Italie';

SELECT stddev(new_vaccination) FROM covidata.vaccination NATURAL JOIN covidata.pays WHERE nom_pays = 'Andorra';

SELECT
