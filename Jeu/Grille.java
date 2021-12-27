public class Grille {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String[][] creerGrille() {
        String[][] grilleJoueur = new String[11][11];
        int ligne;
        int colonne;
        for (ligne = 0; ligne < grilleJoueur.length - 1; ligne++) {
            for (colonne = 0; colonne < (grilleJoueur[ligne].length - 1); colonne++) {
                grilleJoueur[ligne][colonne] = "~";
            }
        }
        int x = 0; 
        int y = 0; 
        for (int compteur = 0; compteur < 3; compteur++) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            if(y != 0) {
                grilleJoueur[x][y] = "□";
                grilleJoueur[x][y - 1] = "□";
            }
        }
        return grilleJoueur;
    }

    public static void afficherGrille(String[][] grilleJoueur) {
        int ligne;
        int colonne;
        System.out.println("     1 2 3 4 5 6 7 8 9 10");
        for (ligne = 0; ligne < (grilleJoueur.length - 1); ligne++) {
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
            for (colonne = 0; colonne < (grilleJoueur[ligne].length - 1); colonne++) {
                if (colonne == 0) {
                    System.out.print("■ ");
                    System.out.print(ANSI_CYAN + grilleJoueur[ligne][colonne] + " " + ANSI_RESET);
                } else if (colonne == 9) {
                    System.out.print(ANSI_CYAN + grilleJoueur[ligne][colonne] + " " + ANSI_RESET);
                    System.out.print("■"); 
                }
                else {
                    System.out.print(ANSI_CYAN + grilleJoueur[ligne][colonne] + " " + ANSI_RESET);
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