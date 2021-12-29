import java.io.*;
import java.util.Scanner;

public class Menu {

    public final static void clearConsole() {
        try {
            if(System.getProperty("os.name" ).startsWith("Windows" ))
              Runtime.getRuntime().exec("cls" );
            else
              Runtime.getRuntime().exec("clear" );
        } catch (Exception excpt) {
            for(int i=0; i < 100; i++)
              System.out.println();
        }
    }

    public static void afficherEnLigne(char c, int longueur) {
	    for (int colonne = 1; colonne <= longueur; colonne++) {
			System.out.print(c);
		}
	}

	public static void afficherEnLigneln(char c, int longueur) {
		afficherEnLigne(c, longueur);
		System.out.println();
	}


    public static String message() {
        try {
            File file = new File("Message.txt");    
            FileReader fr = new FileReader(file);  
            BufferedReader br = new BufferedReader(fr);  
            StringBuffer sb = new StringBuffer();    
            String line;
            while((line = br.readLine()) != null)
            {
                sb.append(line);      
                sb.append("\n");     
            }
            fr.close();    
            return sb.toString();  
        } catch(IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    public static void messageMenu() {
        int hauteur = 10;
        int largeur = 40;
        afficherEnLigne(' ', 30);
        afficherEnLigneln('■', largeur);
        for (int ligne = 2; ligne < hauteur; ligne++) {
            afficherEnLigne(' ', 30);
            afficherEnLigne('■', 1);
            if (ligne == 5) {
                afficherEnLigne(' ', 9);
                System.out.print("1. Lancer une partie");
                afficherEnLigne(' ', 9);
            } else if (ligne == 6) {
                afficherEnLigne(' ', 14);
                System.out.print("2. Quitter");
                afficherEnLigne(' ', 14);
            } else {
                afficherEnLigne(' ', largeur - 2);
            }
            afficherEnLigneln('■', 1);
        }
        afficherEnLigne(' ', 30);
        afficherEnLigneln('■', largeur);
	}    

    public static void launch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n" + message());
        System.out.println("\n\n\t\t\t     Bataille Navale ⚔️, voici les règles du jeu :\n\n1. Les navires sont placé aléatoirement dans la map : 4 navires de 1 case, 3 navires de 2 cases et 1 navire de 3 cases\n\t\t2. Le premier qui coule tout les navires de l'adversaire a gagner la partie\n\t3. Si vous touchez un navire, vous continuez de jouer sinon c'est au tour de votre adversaire\n\n");
        messageMenu();
        int choix = Integer.parseInt(sc.nextLine());
        while (choix != 2) {
            if (Index.fini_jeu) {
                choix = 2;
            }
            switch (choix){
                case 1:
                    Index.Play();
                    System.out.println("\nÉlimination confirmé, " + Index.gagnant + " est le grand gagnant !");
                    break;
                default:
                    if (!Index.fini_jeu) {
                        System.out.println("\n Choix Incorrecte : ");
                        choix = Integer.parseInt(sc.nextLine());
                    }
                    break;
            }
        }
        sc.close();
    }
}

