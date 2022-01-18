select nom from reservation natural join client where date_reservation > '03/01/2022';
/*Afficher les noms des clients ayant reserver une date apres le 1er mars*/

select sum(prix) from reservation;
/*Afficher la somme total d'argent recolté des reservations*/

select nom, ville_reservation from reservation natural join client where id_statut = 02;
/*Afficher les noms des clients et la ville où la reservation a été annulé*/
select nom from class natural join client where classe='Economique';
/* Affiche le nom des clients qui sont en classe économique*/
select avg(prix) from reservation;
/*Affiche la moyenne des prix de réservation*/
select count(nom) from client where nationalite='francaise';
/* Affiche le nombre de client de nationalité française*/
