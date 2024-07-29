package afisare_n_numere;

import java.sql.SQLOutput;

/**
 * Sa se foloseasca cele 3 structuri repetitive pentru a afisa toate numerele de la 0 la 10
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Afisare numere cu FOR");
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("Afisare numere cu WHILE");
        int i = 0;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("Afisare numere cu Do-While");
        i=0;
        do {
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
