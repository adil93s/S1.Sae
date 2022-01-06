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

    public static int coordonneNavire() {
        //Génération coordonné aleatoirement
        int min = 1;
        int max = 8;
        int range = max - min + 1;
        int coordonne = (int)(Math.random() * range) + min;
        
        return coordonne;
    }

    public static void placementNavire(String[][] grilleJoueur, int tailleNavire, int nombreNavire) {
        if (tailleNavire == 1) {
            for (int compteur = 0; compteur < nombreNavire; compteur++) {

                int x = coordonneNavire();
                int y = coordonneNavire();

                //Condition si presénce d'un navire ou d'un navire proche
                boolean conditionPasDeNavire = grilleJoueur[x][y] != "□";
                boolean conditionPasDeNavireProche = grilleJoueur[x][y-1] != "□" && grilleJoueur[x-1][y] != "□" && grilleJoueur[x][y+1] != "□" && grilleJoueur[x+1][y] != "□" && grilleJoueur[x+1][y+1] != "□" && grilleJoueur[x-1][y-1] != "□" && grilleJoueur[x-1][y+1] != "□" && grilleJoueur[x+1][y-1] != "□";

                if (conditionPasDeNavire && conditionPasDeNavireProche) {
                    grilleJoueur[x][y] = "□";
                } else {
                    while (grilleJoueur[x][y] == "□" || grilleJoueur[x][y-1] == "□" || grilleJoueur[x-1][y] == "□" || grilleJoueur[x][y+1] == "□" || grilleJoueur[x+1][y] == "□" || grilleJoueur[x+1][y+1] == "□" || grilleJoueur[x-1][y-1] == "□" || grilleJoueur[x-1][y+1] == "□" || grilleJoueur[x+1][y-1] == "□") {
                        x = coordonneNavire();
                        y = coordonneNavire();
                    }
                    grilleJoueur[x][y] = "□";
                }
            }
        } else if (tailleNavire == 2) {
            for (int compteur = 0; compteur < nombreNavire; compteur++) {

                int x = coordonneNavire();
                int y = coordonneNavire();


                //Condition si presénce d'un navire ou d'un navire proche
                boolean conditionPasDeNavire = grilleJoueur[x][y] != "□";
                boolean conditionPasDeNavireProche = grilleJoueur[x][y-1] != "□" && grilleJoueur[x-1][y] != "□" && grilleJoueur[x][y+1] != "□" && grilleJoueur[x+1][y] != "□" && grilleJoueur[x+1][y+1] != "□" && grilleJoueur[x-1][y-1] != "□" && grilleJoueur[x-1][y+1] != "□" && grilleJoueur[x+1][y-1] != "□";

                //Génération d'un double compris entre 0 et 1
                double alea = Math.random();

                if (conditionPasDeNavire && conditionPasDeNavireProche) {
                    grilleJoueur[x][y] = "□";
                    if (alea < 0.5) {
                        grilleJoueur[x-1][y] = "□";
                    } else {
                        grilleJoueur[x][y-1] = "□";
                    }                
                } else {
                    while (grilleJoueur[x][y] == "□" || grilleJoueur[x][y-1] == "□" || grilleJoueur[x-1][y] == "□" || grilleJoueur[x][y+1] == "□" || grilleJoueur[x+1][y] == "□" || grilleJoueur[x+1][y+1] == "□" || grilleJoueur[x-1][y-1] == "□" || grilleJoueur[x-1][y+1] == "□" || grilleJoueur[x+1][y-1] == "□") {
                        x = coordonneNavire();
                        y = coordonneNavire();
                    }
                    grilleJoueur[x][y] = "□";
                    if (alea < 0.5) {
                        grilleJoueur[x-1][y] = "□";
                    } else {
                        grilleJoueur[x][y-1] = "□";
                    }                
                }
            }
        } else {
            for (int compteur = 0; compteur < nombreNavire; compteur++) {
                
                int x = coordonneNavire();
                int y = coordonneNavire();


                //Condition si presénce d'un navire ou d'un navire proche
                boolean conditionPasDeNavire = grilleJoueur[x][y] != "□";
                boolean conditionPasDeNavireProche = grilleJoueur[x][y-1] != "□" && grilleJoueur[x-1][y] != "□" && grilleJoueur[x][y+1] != "□" && grilleJoueur[x+1][y] != "□" && grilleJoueur[x+1][y+1] != "□" && grilleJoueur[x-1][y-1] != "□" && grilleJoueur[x-1][y+1] != "□" && grilleJoueur[x+1][y-1] != "□";

                //Génération d'un double compris entre 0 et 1
                double alea = Math.random();

                if (conditionPasDeNavire && conditionPasDeNavireProche) {
                    grilleJoueur[x][y] = "□";
                    if (alea < 0.5) {
                        grilleJoueur[x-1][y] = "□";
                        grilleJoueur[x+1][y] = "□";
                    } else {
                        grilleJoueur[x][y-1] = "□";
                        grilleJoueur[x][y+1] = "□";                    
                    }                 
                } else {
                    while (grilleJoueur[x][y] == "□" || grilleJoueur[x][y-1] == "□" || grilleJoueur[x-1][y] == "□" || grilleJoueur[x][y+1] == "□" || grilleJoueur[x+1][y] == "□" || grilleJoueur[x+1][y+1] == "□" || grilleJoueur[x-1][y-1] == "□" || grilleJoueur[x-1][y+1] == "□" || grilleJoueur[x+1][y-1] == "□") {
                        x = coordonneNavire();
                        y = coordonneNavire();
                    }
                    grilleJoueur[x][y] = "□";
                    if (alea < 0.5) {
                        grilleJoueur[x-1][y] = "□";
                        grilleJoueur[x+1][y] = "□";
                    } else {
                        grilleJoueur[x][y-1] = "□";
                        grilleJoueur[x][y+1] = "□";                    
                    }                
                }
            }        
        }
    }

    public static String[][] creerGrille() {
        String[][] grilleJoueur = new String[10][10];
        int ligne;
        int colonne;
        for (ligne = 0; ligne < grilleJoueur.length; ligne++) {
            for (colonne = 0; colonne < grilleJoueur[ligne].length; colonne++) {
                grilleJoueur[ligne][colonne] = "~";
            }
        }
        placementNavire(grilleJoueur, 3, 1);
        placementNavire(grilleJoueur, 2, 3);
        placementNavire(grilleJoueur, 1, 4);

        return grilleJoueur;
    }

    public static void afficherGrille(String[][] grilleJoueur) {
        int ligne;
        int colonne;
        System.out.println("\t\t\t     1 2 3 4 5 6 7 8 9 10");
        for (ligne = 0; ligne < grilleJoueur.length; ligne++) {
            if (ligne == 0) {
                System.out.print("\t\t\t");
                for (int repeat = 0; repeat < 26; repeat++) {
                    if (repeat < 3)
                        System.out.print(" ");
                    else
                        System.out.print("■");
                }
                System.out.println();
            }  
            if (ligne != 9) {
                System.out.print("\t\t\t" + (ligne+1) + "  ");
            } else {
                System.out.print("\t\t\t" + (ligne+1) + " ");
            }
            System.out.print("■ ");
            for (colonne = 0; colonne < grilleJoueur[ligne].length; colonne++) {
                //if (grilleJoueur[ligne][colonne] == (ANSI_GREEN + "✗") || grilleJoueur[ligne][colonne] == (ANSI_RED + "✗")) {
                    System.out.print(ANSI_CYAN + grilleJoueur[ligne][colonne] + " " + ANSI_RESET);
                /*} else {
                    System.out.print(ANSI_CYAN + "~ " + ANSI_RESET);
                }*/
            }
            System.out.print("■\n"); 
        }
        System.out.print("\t\t\t");
        for (int repeat = 0; repeat < 26; repeat++) {
            if (repeat < 3)
                System.out.print(" ");
            else
                System.out.print("■");
        }
        System.out.println();      
    }

}
