import java.util.Scanner;
public class Index { 

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
      
    public static String gagnant;

    static String[][] j1Grille = Grille.creerGrille();
    static String[][] j2Grille = Grille.creerGrille();
    static boolean naviretouche = true;
    static boolean fini_jeu = false;

    public static boolean verifFinJeu(String[][] grille) {
        for (int ligne = 0 ; ligne < grille.length ; ligne++) {
            for (int colonne = 0 ; colonne < grille[ligne].length ; colonne++) {
                if (grille[ligne][colonne] == "□") {
                    return false;
                }
            }
        }
        return true;
    } 
    
    public static boolean verifNavireCoule(String[][] grille, int y, int x) {
        if (x == 0) {
            if ((grille[y][x] == (ANSI_GREEN + "✗") && grille[y-1][x] != "□" && grille[y+1][x] != "□" && grille[y][x+1] != "□")) {
                return true;
            }
        } else if (x == 10) {
            if ((grille[y][x] == (ANSI_GREEN + "✗") && grille[y-1][x] != "□" && grille[y+1][x] != "□" && grille[y][x-1] != "□")) {
                return true;
            }  
        } else if (y == 0) {
            if (grille[y][x] == (ANSI_GREEN + "✗") && grille[y][x-1] != "□" && grille[y+1][x] != "□" && grille[y][x+1] != "□") {
                return true;
            }  
        } else if (y == 10) {
            if (grille[y][x] == (ANSI_GREEN + "✗") && grille[y-1][x] != "□" && grille[y][x-1] != "□" && grille[y][x+1] != "□") {
                return true;
            }  
        } else {
            if (grille[y][x] == (ANSI_GREEN + "✗") && grille[y-1][x] != "□" && grille[y][x-1] != "□" && grille[y+1][x] != "□" && grille[y][x+1] != "□") {
                return true;
            }   
        }
        return false;
    }

    public static int verifCoordonnee(int x) {
        Scanner sc = new Scanner(System.in);
        try {
            x = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            x=-1;
        }
        return x ; 
    }

    public static int coordonnee(int x) {
        x = verifCoordonnee(x);
        while (x < 1 || x > 10) {
            System.out.println("\nCoordonnée (colonne) incorrecte :");
            x = coordonnee(x);
        }
        return x;
    }

    public static void afficherGrilleAdversaire(String[][] grille, String joueur) {
        System.out.println("\n\t\t      Grille de votre adversaire " + joueur + ANSI_RESET + " :\n");
        Grille.afficherGrille(grille);
    }

    public static void Tirer(String[][] grille, String j1, String j2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrer les coordonnées pour lancer une frappe : (colonne puis ligne)");
        int x = 0; 
        x = coordonnee(x);
        int y = 0;
        y = coordonnee(y);

        while (grille[y-1][x-1] == ANSI_GREEN + "✗" || grille[y-1][x-1] == ANSI_RED + "✗"){
            System.out.println("\nZone déjà détruite !\nEntrer les coordonnées pour lancer à nouveau une frappe : (colonne puis ligne)");
            x = coordonnee(x);
            y = coordonnee(y);
        }

        if (grille[y-1][x-1] == "□") {
            grille[y-1][x-1] = ANSI_GREEN + "✗";
            if (verifNavireCoule(grille, (y-1), (x-1))) {
                System.out.println(ANSI_GREEN + "\n\t\t\t ✔ Le navire ennemi a coulé !" + ANSI_RESET);
            } else {
                System.out.println(ANSI_GREEN + "\n\t\t\t  ✔ Navire ennemi touché !" + ANSI_RESET);
            }
            naviretouche = true;
            fini_jeu = verifFinJeu(grille);
            if (grille == j1Grille) {
                afficherGrilleAdversaire(j1Grille, j1);
                if (!fini_jeu) {
                    System.out.println("\n\t\t\t" + j2 + " vous continuez de jouer !");
                }
            } else {
                afficherGrilleAdversaire(j2Grille, j2);
                if (!fini_jeu) {
                    System.out.println("\n\t\t\t" + j1 + " vous continuez de jouer !");
                }
            }
        } else {
            grille[y-1][x-1] = ANSI_RED + "✗";
            System.out.println(ANSI_RED + "\n\t\t\t   ✗ Aucun navire touché !" + ANSI_RESET);
            naviretouche = false;
            if (grille == j1Grille) {
                afficherGrilleAdversaire(j2Grille, j2);
                if (!fini_jeu) {
                    System.out.println("\n\t\t\t    " + j1 + " à votre tour !");
                }
            } else {
                afficherGrilleAdversaire(j1Grille, j1);
                if (!fini_jeu) {
                    System.out.println("\n\t\t\t    " + j2 + " à votre tour !");
                }
            }
        }
    }

    public static void Play() {   
        String j1 = ANSI_YELLOW + Pseudo.newPseudo();
        String j2 = ANSI_BLUE + Pseudo.newPseudo();
        Menu.clearConsole();

        afficherGrilleAdversaire(j2Grille, j2);
        System.out.println("\n\t\t\t    " + j1 + " à votre tour !");

        while (fini_jeu == false) {
            while (naviretouche == true && gagnant != j1 && gagnant != j2) {
                if (fini_jeu == true) {
                    gagnant = j1;
                    naviretouche = false;
                } else {
                    Tirer(j2Grille, j1, j2);
                }
            }

            naviretouche = true;
            
            while (naviretouche == true && gagnant != j1 && gagnant != j2) {
                if (fini_jeu == true) {
                    gagnant = j2;
                    naviretouche = false;
                } else {
                    Tirer(j1Grille, j1, j2);
                }
            }

            naviretouche = true;
        }
    }

    public static void main(String[] args) {
        Menu.launch();
    }
}
