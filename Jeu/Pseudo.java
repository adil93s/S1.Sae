import java.util.Scanner;

public class Pseudo {
    
    public static String newPseudo (){
        Scanner saisie = new Scanner (System.in);
        System.out.println("Veuillez entrer votre pseudo : ");
        String name = saisie.nextLine();
        while(name.matches("^-?\\d+$")){
            System.out.println("Erreur ! Veuillez entrer un pseudo contenant au moin un caractère : ");
            name = saisie.nextLine();
        }
        System.out.println("\nBienvenue Amiral " + name + "\n");
        return name;
    }
}