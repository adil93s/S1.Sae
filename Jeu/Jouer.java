package Jeu;
import java.util.Scanner;

public class Jouer {
    public static void main (String[] args){
        Play();
    }
    public static void Play () {
        Scanner sc = new Scanner (System.in);
        String x;
        String[] Lettre = {"A","B","C","D"};
        int y;
        boolean acces = true;
        while (acces){
            x = sc.nextLine();
            for( int i = 0; i < Lettre.length;i++){
                if(Lettre[i] == x){
                    acces = false;
                }
                else{
                    System.out.println("Erreur!! Vous avez rentrer une valeur non valide faîtes attention!  X");
                    acces = false;
                }
            }
        }




        System.out.println("Veuillez entrer une position (ligne puis colonne) de l'endroit ou vous pensez que le bateau ennemie se situe! Bonne chance Mousaillons!!");

        y= Integer.parseInt(sc.nextLine());
        while (y<0 || y>10){
            System.out.println("Erreur!! Vous avez rentrer une valeur non valide faîtes attention!  Y");
            y= Integer.parseInt(sc.nextLine());
        }
    }
}
