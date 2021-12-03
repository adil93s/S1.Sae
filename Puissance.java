import java.util.ArrayList;
import java.util.Scanner;
// fait par Adil Ismail :D

public class Puissance {

    public static boolean game = true ;
    public static int rejouer = 0 ;

    public static void main(String[] args) {


        //7*6
        //creation du plateau
        Scanner sc = new Scanner(System.in);

        int[] nbr = new  int[7] ;
        char[][] ligne1 = new char[6][7];

        for (int  i = 0  ; i < nbr.length ; i++){
            nbr[i] = i + 1 ;
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                ligne1[i][j] = '.';

            }
        }





        //la partie
        while (Puissance.game) {
            Puissance.rejouer = 0;
            int pos;

            do {

                if (Puissance.game) {
                    do {
                        afficherplateau(ligne1 , nbr );
                        System.out.println("joueur 1 entrer votre jeton ");
                        try {
                            pos = Integer.parseInt(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("il faut ecrire un nombre ");
                            pos = -1;
                        }


                    } while (pos < 1 || pos > 7);
                    pos = pos - 1;

                    ligne1 = entrerjeton(pos, ligne1, 'X');
                    isegalite(ligne1);
                }
            }
            while (Puissance.rejouer == 1);



            do {
                if (Puissance.game) {
                    do {
                        afficherplateau(ligne1 , nbr);

                        System.out.println("joueur 2 entrer votre jeton ");
                        try {
                            pos = Integer.parseInt(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("il faut ecrire un nombre ");
                            pos = -1;
                        }
                    } while (pos < 1 || pos > 7);
                    pos = pos - 1;
                    ligne1 = entrerjeton(pos, ligne1, '0');
                    isegalite(ligne1);
                }
            }while (Puissance.rejouer == 1);
        }
        //fin de partie
        afficherplateau(ligne1 , nbr);
        System.out.println("merci d'avoir joué :D");


    }




    public static void isegalite(char[][] plateau){

        for (int i = 0                                                                                                                                                                                                   ; i < 7 ; i++){
            if (plateau[0][i] == '.' ){

                return;
            }

            }


        Puissance.game = false;
        System.out.println("egalité personne ne gagne");

            }






    public static void afficherplateau(char[][] plateau , int[] nbr)
    {

        for (int nombre :nbr
        ) {
            System.out.print(nombre + " ");
        }
        System.out.println();


        for(int i = 0 ; i<= 5 ; i++){
            for (int j = 0 ; j<= 6 ; j++){
                System.out.print(plateau[i][j]+ " ");
            }
            System.out.println();
        }

    }


    public static char[][] entrerjeton(int pos , char[][] plateau , char jeton){

        if ( Puissance.game){
            int pos2 = 5 ;
            while(true) {
                if (plateau[pos2][pos] == '.') {
                    plateau[pos2][pos] = jeton;


                    didIWin(plateau, pos2, pos, jeton);
                    Puissance.rejouer = 0;
                    return plateau;
                } else {
                    pos2--;
                    if (pos2 < 0) {
                        System.out.println("vous ne pouvez pas jouer ici");
                        Puissance.rejouer = 1;
                        return plateau;
                    }
                }
            }

        }
        else {
            return plateau ;
        }
    }

    public static void didIWin(char[][] plateau , int y , int x , char jeton ){

      int lignex = 0 ;
      int ligney = y ;
      int count = 0;
      while (lignex <= 6 ){

          if (plateau[y][lignex] == jeton ){
              count++ ;
              if (count >= 4 ){
                  lignex = 0 ;
                  System.out.println("puissance 4 de la part de "+jeton+" fin de partie !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                  Puissance.game = false  ;

                /*  while ( lignex<=6 ){
                      if (plateau[y][lignex] == jeton ){
                          plateau[y][lignex] = 'W' ;
                      }
                      lignex++ ;
                  }*/
                    return;
              }
          }
          else {
              count = 0 ;
          }

          lignex++;
      }
      count = 0 ;

      int colonney = 0;
      int colonnex = x ;
      while (colonney <=5){

          if (plateau[colonney][x] == jeton){
              count++ ;
              if (count >= 4 ){
                  System.out.println("puissance 4 de la part de "+jeton+" fin de partie !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                  Puissance.game = false  ;
                  return;
              }
          }
          else {
              count = 0 ;
          }

          colonney++;
      }
      count = 0 ;
      colonnex = x ;
      colonney = y ;

      while (colonnex != 0 && colonney != 0){
          colonnex-- ;
          colonney--;

      }

      while (colonnex <= 6 && colonney <= 5){

          if (plateau[colonney][colonnex] == jeton){
              count++ ;
              if (count >= 4 ){
                  System.out.println("puissance 4 de la part de "+jeton+" fin de partie !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );
                  Puissance.game = false  ;
                  return;
              }
          }
          else {
              count = 0 ;
          }
          colonnex++ ;
          colonney++;
      }
        count = 0 ;
        colonnex = x ;
        colonney = y ;
        int oldcolonnex ;
        int oldcolonney ;

        while(colonney < 5){
            if (colonnex == 0 ){
                colonney++;
            }
            else {
                colonney++;
                colonnex-- ;
            }


           /* System.out.println("salut");
            System.out.println("colonnex "+ colonnex);
            System.out.println("colonney "+ colonney);*/
        }
        int yes =0 ;
        while (yes < 10 ){

            oldcolonnex = colonnex ;
            oldcolonney = colonney ;
            if (plateau[colonney][colonnex] == jeton){
                count++ ;
                if (count >= 4){
                    System.out.println("puissance 4 de la part de "+jeton+" fin de partie !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    Puissance.game = false  ;
                    return;
                }
            }
            else {
                count = 0 ;
            }
            if (colonnex != 6 ){
                colonnex++ ;
            }
            if(colonney != 0){
                colonney-- ;

            }

            if (colonnex == oldcolonnex && colonney == oldcolonney) {
                return;
            }
            /*System.out.println("count "+ count);
            System.out.println("colonnex "+ colonnex);
            System.out.println("colonney "+ colonney);*/
            yes++ ;

            }


        }

    }
