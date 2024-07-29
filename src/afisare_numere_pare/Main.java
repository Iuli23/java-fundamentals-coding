package afisare_numere_pare;

/**
 * Sa se afiseze toate numerele pare de la 0 la 100
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Varianta cu if");
        for (int i=0; i<=100; i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }

        System.out.println("Varianta fara if");
        for(int i=0; i<=100; i+=2) {
            System.out.println(i);
        }
    }
}
