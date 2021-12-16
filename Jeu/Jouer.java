import java.io.InputStream;
import java.util.Scanner;
package Jeu;

public class Jouer {
    public static void Play (String [][]){
        Scanner sc = new Scanner (System.in);
        String x;
        int y;
        System.out.println("Veuillez entrer une position (ligne puis colonne) de l'endroit ou vous pensez que le bateau ennemie se situe! Bonne chance Mousaillons!!");
        x= (sc.nextLine());
        y= Integer.parseInt(sc.nextLine());
        while (y>10 || y<0 || x!=) ;
    }
}
