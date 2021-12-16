package Jeu;
import java.io.*;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args) throws Exception {
        Menu();
    }
    public static void Menu() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        File file = new File(
                "/home/etudiants/info/igada/prive/S1/R1.01/Jeu/src/Message.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)

            System.out.println(st);
        String Menu = "1. Lancer une partie\n\t2. Quitter";
        System.out.println(Menu);
        int choix = Integer.parseInt(sc.nextLine());
        while (choix != 2) {
            switch (choix){
                case 1:
                    break;
                default:
                    System.out.println("Erreur!! Veuillez entrer un choisir une des deux options: ");
                    break;
            }
            choix = Integer.parseInt(sc.nextLine());
        }
    }
}

