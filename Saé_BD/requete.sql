select nom from reservation natural join client where date_reservation > '03/01/2022';
/*Afficher les noms des clients ayant reserver une date apres le 1er mars*/

select sum(prix) from reservation;
/*Afficher la somme total d'argent recolté des reservations*/

select nom, ville_reservation from reservation natural join client where id_statut = 02;
/*Afficher les noms des clients et la ville où la reservation a été annulé*/

select num_passeport from client inner join reservation on (client.id_client = reservation.id_client) inner join classe on (reservation.id_classe = classe.id_classe) where type_classe = 'Economique';
/* Affiche les numéro de passeport des clients qui sont en classe économique*/

select avg(prix) from reservation;
/*Affiche la moyenne des prix de réservation*/

select count(nom) from client where nationalite = 'Français';
/* Affiche le nombre de client de nationalité française*/
