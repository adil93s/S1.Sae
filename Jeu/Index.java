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

/*https://mathonomie.files.wordpress.com/2017/10/cm-2017-10-16-isn-presentation-bataille-navale-beamer.pdf*/

