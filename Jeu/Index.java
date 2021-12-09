package Jeu;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        char[][] zone = new char[6][7];

        for (int ligne = 0; ligne < zone.length; ligne++) {
            for (int colonne = 0; colonne < zone[ligne].length; colonne++) {
                zone[ligne][colonne] = '.';
            }
        } 

        System.out.println(zone);
    }

}
/*static int[][] situation = new int[11][11];
    static boolean fini_jeu;
    public static int[][] initialisation() {
        int i;
        int j;
        int x;
        int y;
        for (i = 0; i < 10; i = i + 1) {
            for (j = 0; j < 10; j = j + 1) {
                situation[i][j] = 0;
            }
        }
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        situation[x][y] = 1 - situation[x][y];
        situation[x][y - 1] = 1 - situation[x][y - 1];
        fini_jeu = false;
        return situation;
    }
    // Déclaration de la grille
    public static void affiche_jeu(int[][] situation) {
        int i;
        int j;
        System.out.println("   A B C D E F G H I J");
        for (i = 0; i < 10; i = i + 1) {
            System.out.print(i + "  ");
            for (j = 1; j < 11; j = j + 1) {
                if (situation[i][j] == 0) {
                    System.out.print("~ ");
                }
                if (situation[i][j] == 2) {
                    System.out.print("* ");
                }
                if (situation[i][j] == 1) {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        situation = initialisation();
        affiche_jeu(situation);
    }
}*/
/*https://mathonomie.files.wordpress.com/2017/10/cm-2017-10-16-isn-presentation-bataille-navale-beamer.pdf

import java.util.Scanner;
public class Pseudo {
    public  static void PseudoJ (){
        Scanner sc= new Scanner (System.in);
        System.out.println("Veuillez entrer le pseudos du premier joueur: ");
        String nom1 = sc.nextLine();
        System.out.println("Bienvenue Amiral " + nom1);
        System.out.println("Veuillez entrer le pseudos du second joueur: ");
        String nom2 = sc.nextLine();
        System.out.println("Bienvenue Capitaine " + nom2);
            try{
               int verif = Integer.parseInt(nom1);
                verif = Integer.parseInt(nom2);
            }catch (NumberFormatException e){
                System.out.println("Erreur! Veuillez rentrer un pseudos contenant au moins un caractère!: ");
            }
         }
    }*/
}
