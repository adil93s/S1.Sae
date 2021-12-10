import java.io.*;

public class Menu {
    public static void main (String[] args) throws Exception {
        Menu();
    }
    public static void Menu() throws Exception
    {
        File file = new File(
                "/home/etudiants/info/igada/prive/S1/R1.01/Jeu/src/Message.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)

            System.out.println(st);
    }
}
