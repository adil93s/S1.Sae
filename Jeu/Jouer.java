//package Jeu;
import java.util.Scanner;

public class Jouer {
    public static void main(String[] args) {
        Play();
    }
        public static void Play () {
            Scanner sc = new Scanner(System.in);
            char x;
            System.out.println("Veuillez entrer une position ligne  de l'endroit ou vous pensez que le bateau ennemie se situe! Bonne chance Mousaillons!! (Lettre en Majuscule)");
            boolean acces = true;
            x = sc.nextLine().charAt(0);
            while (x > 'j' || x > 'J') {
                System.out.println("Erreur!! Vous avez rentrer une valeur non valide faîtes attention!  X");
                x = sc.nextLine().charAt(0);
            }
            System.out.println("Veuillez entrer une position colonne de l'endroit ou vous pensez que le bateau ennemie se situe! Bonne chance Mousaillons!! (entre 1 et 10)");
            int y = Integer.parseInt(sc.nextLine());
            while (y < 1 || y > 10) {
                System.out.println("Erreur!! Vous avez rentrer une valeur non valide faîtes attention!  Y");
                y = Integer.parseInt(sc.nextLine());
            }
        }
}
