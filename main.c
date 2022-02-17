#include <stdio.h>
#define TAILLE_GRILLE 6

int hauteur_colonne (int grille[TAILLE_GRILLE][TAILLE_GRILLE], int colonne);
int poser_jeton (int grille[TAILLE_GRILLE][TAILLE_GRILLE], int colonne, int joueur);
void init_grille (int grille[TAILLE_GRILLE][TAILLE_GRILLE]);
void affiche_grille(int grille[TAILLE_GRILLE][TAILLE_GRILLE]);
int scan_colonne (int grille[TAILLE_GRILLE][TAILLE_GRILLE]);
int verifie_gagne (int grille[TAILLE_GRILLE][TAILLE_GRILLE], int colonne, int ligne, int joueur);



void init_grille (int grille[TAILLE_GRILLE][TAILLE_GRILLE]) {
    for (int ligne=0; ligne < TAILLE_GRILLE; ligne++) {
        for (int colonne=0; colonne < TAILLE_GRILLE; colonne++) {
            grille[ligne][colonne] = 0;
        }
    }
}

void affiche_grille (int grille[TAILLE_GRILLE][TAILLE_GRILLE]) {
    for (int ligne=TAILLE_GRILLE-1; ligne >=0; ligne--) {
        for (int colonne=0; colonne < TAILLE_GRILLE; colonne++) {
            if (grille[ligne][colonne] == 0) {
                printf("| ");
            } else if (grille[ligne][colonne] == 1) {
                printf("|X");
            } else {
                printf("|O");
            }
        }
        printf("|\n");
    }
}
 
int hauteur_colonne (int grille[TAILLE_GRILLE][TAILLE_GRILLE], int colonne) {
    int compteur=0;
    for (int ligne=TAILLE_GRILLE-1; ligne >= 0; ligne--) {
        if (grille[ligne][colonne] == 1 || grille[ligne][colonne] == 2) {
            compteur++;
        }
    }
    return compteur;
}

int poser_jeton (int grille[TAILLE_GRILLE][TAILLE_GRILLE], int colonne, int joueur) {
    int ligne = hauteur_colonne(grille, colonne);
    if (ligne == TAILLE_GRILLE) {
        return -3;
    } else if (colonne >= TAILLE_GRILLE || colonne < 0 ) {
        return -2;
    } else if (joueur != 1 && joueur != 2) {
        return -1;
    } else {
        grille[ligne][colonne] = joueur;
        return ligne;
    }
}

int scan_colonne (int grille[TAILLE_GRILLE][TAILLE_GRILLE]) {
    int saisie = 0;
    int saisieError;
    do {
        saisieError = -1;
        saisie = -1;
        printf("Saisissez la colonne dans laquelle vous voulez jouer : ");
        saisieError = scanf("%d", &saisie);
        saisie = saisie - 1;
    } while (saisie >= TAILLE_GRILLE || saisie < 0 || saisieError == 0);
    return saisie;
}


int verifier_gagne(int grille[TAILLE_GRILLE][TAILLE_GRILLE] , int colonne , int ligne , int joueur) {

    /*ALIGNEMENT HORIZONTAL*/
    int compteur = 0;
    int jetonA_gauche = 1;
    while(compteur <= 3 && grille[ligne][colonne-jetonA_gauche] == joueur && jetonA_gauche <= colonne) {
        jetonA_gauche++;
        compteur++;
    }
    compteur = 0;
    int jetonA_droite = 1;
    while(compteur <= 3 && grille[ligne][colonne+jetonA_droite] == joueur && jetonA_droite <= TAILLE_GRILLE-colonne-1) {
        jetonA_droite++;
        compteur++;
    }
    int jetonA_horizontal = jetonA_gauche + jetonA_droite;

    /*ALIGNEMENT VERTICAL*/
    compteur = 0;
    int jetonA_vertical = 1;
    while(compteur <= 3 && grille[ligne-jetonA_vertical][colonne] == joueur && jetonA_vertical <= ligne) {
        jetonA_vertical++;
        compteur++;
    } 

    /*ALIGNEMENT DIAGONALE 1*/
    compteur = 0;
    int jetonA_diagonal1a = 1;
    do {
        jetonA_diagonal1a++;
        compteur++;
    } while(compteur <= 3 && grille[ligne-jetonA_diagonal1a][colonne-jetonA_diagonal1a] == joueur && jetonA_diagonal1a <= colonne && jetonA_diagonal1a <= ligne);
    compteur = 0;
    int jetonA_diagonal1b = 1;
    while(compteur <= 3 && grille[ligne+jetonA_diagonal1b][colonne+jetonA_diagonal1b] == joueur && jetonA_diagonal1b <= TAILLE_GRILLE-colonne-1 && jetonA_diagonal1b <= TAILLE_GRILLE-ligne-1) {
        jetonA_diagonal1b++;
        compteur++;
    }
    int jetonA_diagonal1 = jetonA_diagonal1a + jetonA_diagonal1b;



    /*ALIGNEMENT DIAGONALE 2*/
    compteur = 0;
    int jetonA_diagonal2a = 1;
    while(compteur <= 3 && grille[ligne-jetonA_diagonal2a][colonne+jetonA_diagonal2a] == joueur && jetonA_diagonal1a <= TAILLE_GRILLE-colonne-1 && jetonA_diagonal1a <= ligne) {
        jetonA_diagonal2a++;
        compteur++;
    } 
    compteur = 0;
    int jetonA_diagonal2b = 1;
    while(compteur <= 3 && grille[ligne+jetonA_diagonal2b][colonne-jetonA_diagonal2b] == joueur && jetonA_diagonal1b <= TAILLE_GRILLE-ligne-1 && jetonA_diagonal1b <= colonne) {
        jetonA_diagonal2b++;
        compteur++;
    }
    int jetonA_diagonal2 = jetonA_diagonal2a + jetonA_diagonal2b;

    if (jetonA_horizontal >= 3 || jetonA_vertical >= 3 || jetonA_diagonal1 >= 3 || jetonA_diagonal2 >= 3) {
        return joueur;
    } else {
        return 0;
    }
}

int main () {
    int grille[TAILLE_GRILLE][TAILLE_GRILLE];
	init_grille (grille);
    affiche_grille(grille);
    int nbTour = 0;
    int maxTour = TAILLE_GRILLE*TAILLE_GRILLE;
    int colonne, joueur;

    do {
        colonne = scan_colonne(grille);
        if(nbTour % 2 == 0) {
            joueur = 1;
            poser_jeton(grille, colonne, 1);
        } else {
            joueur = 2;
            poser_jeton(grille, colonne, 2);
        }
            
        nbTour++;
        affiche_grille(grille);
    } while (nbTour < TAILLE_GRILLE*TAILLE_GRILLE && verifier_gagne(grille, colonne, hauteur_colonne(grille, colonne)-1, joueur) == 0);

    if (verifier_gagne(grille, colonne, hauteur_colonne(grille, colonne)-1, 1) == 1) {
        printf("Le joueur 1 a gagné !\n");
    } else if (verifier_gagne(grille, colonne, hauteur_colonne(grille, colonne)-1, 2) == 2) {
        printf("Le joueur 2 a gagné !\n");
    } else {
        printf("Match nul !\n");
    }


}