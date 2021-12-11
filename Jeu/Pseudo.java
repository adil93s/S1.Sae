import java.util.Scanner;
public class Pseudo {
    public static void main  (String[] args){
        PseudoJ();
    }
    public  static void PseudoJ (){
        try (Scanner saisie = new Scanner (System.in)) {
            System.out.println("Veuillez entrer le pseudos du premier joueur: ");
            String nom1 = saisie.nextLine();
            while(nom1.matches("^-?\\d+$")){
                System.out.println("Erreur! Veuillez rentrer un pseudos contenant au moins un caractère!: ");
                nom1 = saisie.nextLine();
            }
            System.out.println("Bienvenue Amiral " + nom1);
            System.out.println("Veuillez entrer le pseudos du second joueur: ");
            String nom2 = saisie.nextLine();
            while(nom2.matches("^-?\\d+$")){
                System.out.println("Erreur! Veuillez rentrer un pseudos contenant au moins un caractère!: ");
                nom2 = saisie.nextLine();
            }
            System.out.println("Bienvenue Capitaine " + nom2);
        }
           
         }
    }
