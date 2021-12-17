package Jeu;

public class Plateau{
    public static void main(String[] args) {
        launch();
    }

    public static void launch() {
        joueur1 = initialisation(joueur1);
        joueur2 = initialisation(joueur2);
        System.out.println("\nPlateau du J1\n");
        afficherGrille(joueur1);
        System.out.println("\nPlateau du J2\n");
        afficherGrille(joueur2);
    }

    static String[][] joueur1 = new String[11][11];
    static String[][] joueur2 = new String[11][11];
    static boolean fini_jeu;

    public static String[][] initialisation(String[][] situation) {
        int ligne;
        int colonne;
        for (ligne = 0; ligne < situation.length - 1; ligne++) {
            for (colonne = 0; colonne < (situation[ligne].length - 1); colonne++) {
                situation[ligne][colonne] = "~";
            }
        }
        int x = 0; 
        int y = 0; 
        for (int compteur = 0; compteur < 10; compteur++) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            if(y != 0) {
                situation[x][y] = "□";
                situation[x][y - 1] = "□";
            }
        }
        fini_jeu = false;
        return situation;
    }

    public static void afficherGrille(String[][] situation) {
        int ligne;
        int colonne;
        System.out.println("     A B C D E F G H I J");
        for (ligne = 0; ligne < (situation.length - 1); ligne++) {
            if (ligne == 0) {
                for (int repeat = 0; repeat < 26; repeat++) {
                    if (repeat < 3)
                        System.out.print(" ");
                    else
                        System.out.print("■");
                }
                System.out.println();
            }  
            if (ligne != 9) {
                System.out.print((ligne+1) + "  ");
            } else {
                System.out.print((ligne+1) + " ");
            }
            for (colonne = 0; colonne < (situation[ligne].length - 1); colonne++) {
                if (colonne == 0) {
                    System.out.print("■ ");
                    System.out.print(situation[ligne][colonne] + " ");
                } else if (colonne == 9) {
                    System.out.print(situation[ligne][colonne] + " ");
                    System.out.print("■"); 
                }
                else {
                    System.out.print(situation[ligne][colonne] + " ");
                }
            }
            System.out.println();
        }
        for (int repeat = 0; repeat < 26; repeat++) {
            if (repeat < 3)
                System.out.print(" ");
            else
                System.out.print("■");
        }
        System.out.println();      
    }



}
