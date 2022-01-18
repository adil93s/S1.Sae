 INSERT INTO classe (id_classe, classe)
 VALUES
(01, 'Economique'),
(02, 'Economique Premium' ),
(03, 'Classe Affaires'),
(04, 'Première Classe');

INSERT INTO statut (id_statut, statut)
 VALUES
(01, 'Reserver' ),
(02, 'Annuler'),
(03, 'Supprimer');

INSERT INTO pays (id_pays, nom_pays)
 VALUES
 (01, 'France'),
 (02, 'Algerie'),
 (03, 'Maroc'),
 (04, 'Mali'),
 (05, 'Senegal'),
 (06, 'Italie');

INSERT INTO ville (id_ville, nom_ville, id_pays)
 VALUES
 (01, 'Orly', 01),
 (02, 'Oran', 02),
 (03, 'Tanger', 03),
 (04, 'Bamako', 04),
 (05, 'Dakar', 05),
 (06, 'Rome', 06);

INSERT INTO compagnie (id_compagnie, nom_compagnie)
 VALUES
(01, 'Air France'),
(02, 'Air Algerie'),
(03, 'Royal Air Maroc'),
(04, 'Sky Mali'),
(05, 'Corsair'),
(06, 'Alitalia');

INSERT INTO client (id_client, prenom, nom, adresse, date_naissance, sexe, nationalite, telephone, mail, num_passeport)
 VALUES
 (01, 'Rébecca', 'Armand', 'Saint-Didier-des-Bois', '12/03/1977', 'F', 'Français', 0654157887, 'r.armand@gmail.com', '05RP34083' ),
 (36, 'Aimée', 'Hebert', 'Marigny-le-Chatel', '10/25/2000', 'F', 'Français', 0654134887, 'a.hebert@gmail.com', '05P34H083'),
 (54, 'Marielle', 'Ribeiro', 'Mailleres', '02/10/1996', 'F', 'Français', 0654246887, 'm.ad@gmail.com', '15P64H083'),
 (04, 'Hilaire', 'Savary', 'Conie-Molitard', '11/15/1999', 'F', 'Français', 0654157127, 'h.savary@gmail.com', '05P34HML3'),
 (02, 'Abdel', 'Benkassim', 'Ivry sur Seine', '01/17/1975', 'M', 'Algeriens', 0654135687, 'b.abdel@gmail.com', '05P389Z83'),
 (10, 'Jelel', 'Ammari', 'Vitry sur Seine', '04/22/1981', 'M',  'Algeriens', 0654157054, 'r.ammari@gmail.com', '05S24H083'),
 (11, 'Bilal', 'Zidani', 'Choisy', '08/24/1983', 'M', 'Marocains', 0654151237, 'r.zbilal@gmail.com', '05P34H453'),
 (22, 'Elyes', 'Benamor', 'Kremelin Bicetre', '07/30/1980', 'M',  'Algeriens', 0652841564, 'r.benamor@gmail.com', '54P34H083'),
 (07, 'Thierno', 'Seye', 'Maison-Alfort', '09/03/1990', 'M', 'Guineens', 0654157887, 't.seye@gmail.com', '05P43H083'),
 (14, 'Salim', 'Saidi', 'Joinville', '10/31/1992', 'M',  'Algeriens', 0654657887, 's.saidir@gmail.com', '05P34H234'),
 (15, 'Chakour', 'Omar', 'Arceuil', '03/28/1993', 'M', 'Commoriens', 0654457887, 'c.pmar@gmail.com', '05P34H0876'),
 (21, 'Mady', 'Injai', 'Cachan', '05/09/1983', 'M', 'Senegalais', 0654843787, 'madboy94@gmail.com', '21P34H083'),
 (29, 'Marvyn', 'Le fevre', 'Alfort ville', '12/04/1987', 'M', 'Italiens', 0734957887, 'lechekdu94@hotmail.fr','05KZ89083'),
 (05, 'Nanicoye', 'Injai', 'Cachan', '02/05/1989', 'M', 'Senegalais', 0654739887, 'nanicoyegr@yahoo.fr', '05KZ89099'),
 (19, 'Diakary', 'Coulibally', 'Paris 13eme', '10/19/2000', 'M', 'Maliens', 0652197887, 'diaksparow@laposte.net','05KZ89012'),
 (12, 'Oussman', 'Haidara', 'Champigny', '12/01/2001', 'M', 'Maliens', 0654890887, 'abdoulhaidara@gmail.com','05PD89099'),
 (27, 'Lassana', 'Diakité', 'Montreuil', '02/14/2002', 'M', 'Maliens', 0654247887, 'lassanadiak@msn.com', '05KZ24099'),
 (28, 'Madrane', 'Dramé', 'Drancy', '09/24/1996', 'M', 'Maliens', 0654193888, 'mamadou@gmail.com', '05AH89099'),
 (16, 'Yasser', 'Gada', 'Paris 19eme', '07/28/1997', 'M',  'Algeriens', 0754157887, 'carlos@gmail.com', '15KZ89099'),
 (31, 'Walid', 'Boussoufi', 'Clamart', '10/17/1994', 'M', 'Français', 0673254681, 'pabllito.boussoufi@gmail.com', '051RZ9099');
 
INSERT INTO vol (num_vol, date_heure_depart, date_heure_arrive, aeroport_depart, aeroport_arrive, capacite, id_compagnie)
 VALUES
 (555, '03/20/2022 10:30', '03/20/2022 14:30', 'Alger-Houari Boumediene', 'Paris-Orly', '300', 01),
 (245, '02/13/2022 08:30', '02/13/2022 11:30', 'Paris-Orly', 'Tanger-Ibn Batouta', '250', 03),
 (300, '02/19/2022 03:00', '02/19/2022 12:00', 'Dakar-Blaise Diagne', 'Leonard-de-Vinci de Rome Fiumicino', '500', 06),
 (145, '03/02/2022 16:00', '03/02/2022 20:00', 'Paris-Orly', 'Modibo Keita', '350', 04),
 (444, '04/15/2022 22:30', '04/16/2022 01:00', 'Tanger-Ibn Batouta', 'Alger-Houari Boumediene', '400', 02),
 (170, '01/30/2022 08:00', '01/30/2022 15:00', 'Modibo Keita', 'Dakar-Blaise Diagne', '500', 05);

INSERT INTO aeroport (code_aeroport, nom_aeroport, id_ville, id_pays, id_compagnie)
 VALUES
 ('LFPO', 'Paris-Orly', 01, 01, 01),
 ('DAAG', 'Alger-Houari Boumediene', 02, 02, 02),
 ('GMTT', 'Tanger-Ibn Batouta', 03, 03, 03),
 ('GABS', 'Modibo Keita', 04, 04, 04),
 ('GOBD', 'Dakar-Blaise Diagne', 05, 05, 05), 
 ('LIRF', 'Leonard-de-Vinci de Rome Fiumicino', 06, 06, 06);

INSERT INTO reservation (num_reservation, ville_reservation, date_reservation, date_heure_depart, date_heure_arrive, prix, num_vol, id_client, id_classe, id_statut)
 VALUES
 (100, 'Paris', '03/20/2022', '03/20/2022 10:30', '03/20/2022 14:30', 320, 555, 01, 02, 01),
 (102, 'Paris', '03/20/2022', '03/20/2022 10:30', '03/20/2022 14:30', 320, 555, 07, 01, 02),
 (103, 'Paris', '03/20/2022', '03/20/2022 10:30', '03/20/2022 14:30', 320, 555, 16, 01, 01),
 (104, 'Paris', '03/20/2022', '03/20/2022 10:30', '03/20/2022 14:30', 320, 555, 22, 01, 01),
 (105, 'Tanger', '02/13/2022', '02/13/2022 08:30', '02/13/2022 11:30', 250, 245, 36, 04, 01),
 (106, 'Tanger', '02/13/2022', '02/13/2022 08:30', '02/13/2022 11:30', 250, 245, 11, 04, 02),
 (107, 'Tanger', '02/13/2022', '02/13/2022 08:30', '02/13/2022 11:30', 250, 245, 14, 02, 01),
 (108, 'Rome', '02/19/2022', '02/19/2022 03:00', '02/19/2022 12:00', 500, 300, 54, 03, 01),
 (109, 'Rome', '02/19/2022', '02/19/2022 03:00', '02/19/2022 12:00', 500, 300, 19, 03, 01),
 (110, 'Bamako', '03/02/2022', '03/02/2022 16:00', '03/02/2022 20:00', 340, 145, 01, 01, 02),
 (111, 'Bamako', '03/02/2022', '03/02/2022 16:00', '03/02/2022 20:00', 340, 145, 15, 02, 01),
 (112, 'Bamako', '03/02/2022', '03/02/2022 16:00', '03/02/2022 20:00', 340, 145, 21, 01, 01),
 (113, 'Alger', '04/15/2022','04/15/2022 22:30', '04/16/2022 01:00', 230, 444, 31, 01, 03),
 (114, 'Alger', '04/15/2022','04/15/2022 22:30', '04/16/2022 01:00', 230, 444, 02, 01, 03),
 (115, 'Alger', '04/15/2022','04/15/2022 22:30', '04/16/2022 01:00', 230, 444, 28, 02, 03),
 (116, 'Dakar', '01/30/2022','01/30/2022 08:00', '01/30/2022 15:00', 455, 170, 27, 03, 02),
 (117, 'Dakar', '01/30/2022','01/30/2022 08:00', '01/30/2022 15:00', 455, 170, 12, 03, 01),
 (118, 'Dakar', '01/30/2022','01/30/2022 08:00', '01/30/2022 15:00', 455, 170, 29, 01, 01),
 (119, 'Dakar', '01/30/2022','01/30/2022 08:00', '01/30/2022 15:00', 455, 170, 04, 02, 01);
