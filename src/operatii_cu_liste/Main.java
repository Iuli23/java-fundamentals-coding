package operatii_cu_liste;

import java.util.Scanner;

/**
 * 1. Sa se defineasca un array de 10 elemente, sa se afiseze acel array in consola
 * 2. Sa se afiseze array-ul invers de la sfarsit spre inceput
 * 3. Sa se afiseze toate numerele pare din array
 * 4. Sa se calculeze suma numerelor divizibile cu 3 din array-ul dat
 * 5. Sa se verifice daca numarul noua este prezent in array, daca este prezent sa se afiseze un mesaj
 * 6. Se citeste de la tastatura un numar intreg n, sa se verifice daca acest numar este prezent in array
 * 7. Se citeste de la tastatura un numar intreg n, care va fi dimensiunea unui array, elementele array-ului se vor citi
 * de la tastatura. Sa se afiseze elementele array-ului intr-o singura linie separate prin virgula.
 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 1, 2, 33, 4, 20, 6, 7, 8, 9};
        //                0 1 2 3  4 5  6 7 8 9
        afisareArray(numbers);

        System.out.println("--------------------------------------------------");

        afisareArrayInvers(numbers);

        System.out.println("--------------------------------------------------");

        afisareNumerePare(numbers);
        System.out.println();
        System.out.println("--------------------------------------------------");

        sumaNumerelorDivizibilecu3(numbers);
        System.out.println("---------------------------------------------------");
        cautareNumarInArray(numbers);
        System.out.println("---------------------------------------------------");
        //citireNumarSiCautareInArray(numbers);
        System.out.println("---------------------------------------------------");
        citireArrayDeLaTastatura();
    }

    public static void afisareArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            //Pentru a afisa elementele invers folosim linia de mai jos
            //int element = numbers[numbers.length-1-i];
            if (i < (numbers.length - 1)) {
                System.out.print(element + ", ");
            } else {
                System.out.println(element);
            }
        }
    }

    public static void afisareArrayInvers(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            int element = numbers[i];
            if (i > 0) {
                System.out.print(element + ", ");
            } else {
                System.out.println(element);
            }
        }
    }

    public static void afisareNumerePare(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ", ");
            }
        }
    }

    public static void sumaNumerelorDivizibilecu3(int[] numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                suma = suma + numbers[i];
            }
        }
        System.out.println("Suma numerelor divizibile cu 3 este: " + suma);
    }

    public static void cautareNumarInArray(int[] numbers) {
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 9) {
                System.out.println("S-a gasit numarul 9");
                k = 1;
            }
        }
        if (k == 0) {
            System.out.println("Nu s-a gasit numarul 9");
        }
    }

    public static void citireNumarSiCautareInArray(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul cautat este: ");
        int n = scanner.nextInt();
        scanner.close();
        int k = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                k++;
            }
        }
        if (k>0){
            System.out.println("Numarul este prezent in array");
        }
        if (k == 0) {
            System.out.println("Numarul nu a fost gasit");
        }
    }

    public static void citireArrayDeLaTastatura(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numarul de elemente din array este: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Introdu " + n + " numare");
        for (int i=0; i<n; i++){
            //pentru a adauga un element pe pozitia i in array
            array[i]=scanner.nextInt();
       }
        System.out.println("Afisarea elementelor din array: ");
        afisareArray(array);

    }
}
