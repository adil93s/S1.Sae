#include <stdio.h>
#define TAILLE_GRILLE 6




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
    int saisie;
    printf("Saisissez la colonne dans laquelle vous voulez jouer :");
    scanf("%d", &saisie);
    while(saisie >= TAILLE_GRILLE || saisie < 0) {
        printf("Erreur : entrer une colonne correcte");
        scanf("%d", &saisie);
    }
    return saisie;
}


int verifier_gagne(int grille[TAILLE_GRILLE][TAILLE_GRILLE] , int colonne , int ligne , int joueur) {

    /*ALIGNEMENT HORIZONTAL*/
    int jetonA_gauche = 0;
    int compteur = 1;
    while(compteur <= 3 && grille[ligne][colonne-compteur] == joueur && compteur <= colonne) {
        jetonA_gauche++;
        compteur++;
    }
    int jetonA_droite = 0;
    compteur = 1;
    while(compteur <= 3 && grille[ligne][colonne+compteur] == joueur && compteur <= TAILLE_GRILLE-colonne-1) {
        jetonA_droite++;
        compteur++;
    }
    int jetonA_horizontal = jetonA_gauche + jetonA_droite;

    /*ALIGNEMENT VERTICAL*/
    compteur = 0;
    int jetonA_vertical = 1;
    while(compteur <= 3 && grille[ligne-compteur][colonne] == joueur && compteur <= ligne) {
        jetonA_vertical++;
        compteur++;
    }

    /*ALIGNEMENT DIAGONALE 1*/
    compteur = 1;
    int jetonA_diagonal1a = 0;
    while(compteur <= 3 && grille[ligne-compteur][colonne-compteur] == joueur && compteur <= colonne && compteur <= ligne) {
        jetonA_diagonal1a++;
        compteur++;
    }
    compteur = 1;
    int jetonA_diagonal1b = 0;
    while(compteur <= 3 && grille[ligne+compteur][colonne+compteur] == joueur && compteur <= TAILLE_GRILLE-colonne-1 && compteur <= TAILLE_GRILLE-ligne-1) {
        jetonA_diagonal1b++;
        compteur++;
    }
    int jetonA_diagonal1 = jetonA_diagonal1a + jetonA_diagonal1b;



    /*ALIGNEMENT DIAGONALE 2*/
    compteur = 1;
    int jetonA_diagonal2a = 0;
    while(compteur <= 3 && grille[ligne-compteur][colonne+compteur] == joueur && compteur <= TAILLE_GRILLE-colonne-1 && compteur <= ligne) {
        jetonA_diagonal2a++;
        compteur++;
    };
    compteur = 1;
    int jetonA_diagonal2b = 0;
    while(compteur <= 3 && grille[ligne+compteur][colonne-compteur] == joueur && compteur <= TAILLE_GRILLE-ligne-1 && compteur <= colonne) {
        jetonA_diagonal2b++;
        compteur++;
    }
    int jetonA_diagonal2 = jetonA_diagonal2a + jetonA_diagonal2b;

    if (jetonA_horizontal >= 3 || jetonA_vertical >= 3 || jetonA_diagonal1 >= 3 || jetonA_diagonal2 >= 3)
        return 1;
    else
        return 0;
}

int main () {
    int grille[TAILLE_GRILLE][TAILLE_GRILLE];

	init_grille (grille);

	poser_jeton ( grille, 0, 1 )  ;
	poser_jeton ( grille, 1, 1 )  ;
	poser_jeton ( grille, 2, 1 )  ;
	poser_jeton ( grille, 3, 1 )  ;
    printf("\n");
    affiche_grille (grille);

    if (verifier_gagne(grille, 0, 0, 1) == 1) {
        printf("Vous avez gagné\n");
    } else {
        printf("Vous avez perdu\n");
    }

    	init_grille (grille);

	poser_jeton ( grille, 0, 1 )  ;
	poser_jeton ( grille, 1, 1 )  ;
	poser_jeton ( grille, 2, 2 )  ;
	poser_jeton ( grille, 3, 1 )  ;
    printf("\n");
    affiche_grille (grille);

    if (verifier_gagne(grille, 0, 0, 1) == 1) {
        printf("Vous avez gagné\n");
    } else {
        printf("Vous avez perdu\n");
    }

    init_grille (grille);
	poser_jeton ( grille, 0, 1 )  ;   
	poser_jeton ( grille, 0, 1 )  ;
	poser_jeton ( grille, 0, 1 )  ;
	poser_jeton ( grille, 0, 1 )  ;
    printf("\n");
    affiche_grille (grille);

    if (verifier_gagne(grille, 0, 0, 1) == 1) {
        printf("Vous avez gagné\n");
    } else {
        printf("Vous avez perdu\n");
    }

    init_grille (grille);
	poser_jeton ( grille, 0, 1 )  ;
	poser_jeton ( grille, 1, 2 )  ;
	poser_jeton ( grille, 1, 1 )  ;
	poser_jeton ( grille, 2, 2 )  ;
    poser_jeton ( grille, 2, 2 )  ;
    poser_jeton ( grille, 2, 1 )  ;
    poser_jeton ( grille, 3, 2 )  ;
    poser_jeton ( grille, 3, 2 )  ;
    poser_jeton ( grille, 3, 2 )  ;
    poser_jeton ( grille, 3, 1 )  ;


    printf("\n");
    affiche_grille (grille);

    if (verifier_gagne(grille, 0, 0, 1) == 1) {
        printf("Vous avez gagné\n");
    } else {
        printf("Vous avez perdu\n");
    }

    init_grille (grille);
	poser_jeton ( grille, 5, 1 )  ;
	poser_jeton ( grille, 4, 2 )  ;
	poser_jeton ( grille, 4, 1 )  ;
	poser_jeton ( grille, 3, 2 )  ;
    poser_jeton ( grille, 3, 2 )  ;
    poser_jeton ( grille, 3, 1 )  ;
    poser_jeton ( grille, 2, 2 )  ;
    poser_jeton ( grille, 2, 2 )  ;
    poser_jeton ( grille, 2, 2 )  ;
    poser_jeton ( grille, 2, 1 )  ;


    printf("\n");
    affiche_grille (grille);

    if (verifier_gagne(grille, 0, 0, 1) == 1) {
        printf("Vous avez gagné\n");
    } else {
        printf("Vous avez perdu\n");
    }


}