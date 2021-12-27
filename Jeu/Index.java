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

    public static void Tirer(String[][] grille, String j1, String j2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la position colonne de l'endroit ou vous pensez que le bateau ennemie se situe! Bonne chance Mousaillons!! (entre 1 et 10)");
        int x = Integer.parseInt(sc.nextLine());
        while (x < 1 || x > 10) {
            System.out.println("Erreur!! Vous avez rentrer une valeur non valide faîtes attention!  X");
            x = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Veuillez entrer une position ligne de l'endroit ou vous pensez que le bateau ennemie se situe! Bonne chance Mousaillons!! (entre 1 et 10)");
        int y = Integer.parseInt(sc.nextLine());
        while (y < 1 || y > 10) {
            System.out.println("Erreur!! Vous avez rentrer une valeur non valide faîtes attention!  Y");
            y = Integer.parseInt(sc.nextLine());
        }

        if (grille[y-1][x-1] == "□") {
            grille[y-1][x-1] = ANSI_RED + "X";
            System.out.println("\nNavire ennemi touché !\n");
            naviretouche = true;
            fini_jeu = verifFinJeu(grille);
            System.out.println("\nGrille de " + j1 + " :\n");
            Grille.afficherGrille(j1Grille);
            System.out.println("\nGrille de " + j2 + " :\n");
            Grille.afficherGrille(j2Grille);
        } else {
            grille[y-1][x-1] = ANSI_CYAN + "X";
            System.out.println("\nAucun navire touché !\n");
            naviretouche = false;
            System.out.println("\nGrille de " + j1 + " :\n");
            Grille.afficherGrille(j1Grille);
            System.out.println("\nGrille de " + j2 + " :\n");
            Grille.afficherGrille(j2Grille);
        }
    }

    public static void Play() {   
        String j1 = Pseudo.newPseudo();
        String j2 = Pseudo.newPseudo();

        System.out.println("\n\nGrille de " + j1 + " :\n");
        Grille.afficherGrille(j1Grille);
        System.out.println("\n\nGrille de " + j2 + " :\n");
        Grille.afficherGrille(j2Grille);

        while (fini_jeu == false) {
            while (naviretouche == true) {
                if (fini_jeu == true) {
                    System.out.println("\n" + j1 + " a gagné la partie");
                    naviretouche = false;
                } else {
                    System.out.println("\n" + j1 + " à vous de tirer !");
                    Tirer(j2Grille, j1, j2);
                }
            }

            naviretouche = true;
            
            while (naviretouche == true) {
                if (fini_jeu == true) {
                    System.out.println("\n" + j2 + " a gagné la partie");
                    naviretouche = false;
                } else {
                    System.out.println("\n" + j2 + " à vous de tirer !");
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