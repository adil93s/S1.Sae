import java.util.Scanner;

public class Pseudo {
    
    public static String newPseudo (){
        
        Scanner saisie = new Scanner (System.in);
        System.out.println("Veuillez entrer votre pseudo : ");
        String name = saisie.nextLine();
        while(name.matches("^-?\\d+$")){
            System.out.println("Votre pseudo doit contenir au moin un caractère : ");
            name = saisie.nextLine();
        }
        System.out.println("\nBienvenue Capitaine " + name + " ! Prêt pour la bataille ⚔️ ?\n");
        return name;
    }
}
