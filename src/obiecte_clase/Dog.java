package obiecte_clase;

/**
 * Keyword STATIC
 *  - se foloseste pentru: proprietati, metode, clase (nu se foloseste pentru constructori)
 *  - atunci cand o proprietate/variabila/clasa/metoda este statica se aloca spatiu in memorie la pornirea aplicatiei
 *  - intr-o metoda statica NU putem apela proprietati(variabile) sau metode care nu sunt statice
 *  - pentru a apela o proprietate/metoda/clasa statica folosim NUMELE CLASEI . NUMELE PROPRIETATII/METODEI/CLASEI => Dog.bark() , nu folosim instanta clasei, adica rex.bark()
 *  - elementele statice sunt independente de obiecte, adica acestea depind de clasa, nu de instanta lor
 */

public class Dog {
    //proprietati
    String rasa;
    int age;
    String nume;

    //constructori
    public Dog() {
        // constructor default
        // acest constructor se genereaza automat si nu este vizibil in cod.
        // atunci cand generam un constructor, constructorul default DISPARE
        // daca avem un constructor definit, putem defini in mod explicit constructorul default

    }

    public Dog(String rasa, int varsta, String nume) {
        // constructor cu parametrii

        this.rasa = rasa;
        this.age = varsta;
        this.nume = nume;

    }

    //metode:
    public String toString() {
        //metoda toString() transforma obiectul nostru intr-un text
        //atunci cand dorim sa afisam un obiect folosind System.out.println, metoda toString se apeleaza automat
        return "Rasa: " + this.rasa + ", varsta: " + this.age + ", nume: " + this.nume;
    }

    public boolean equals(Object o){
        Dog obj = (Dog) o; //am facut cast de la object la Dog

        if(this.nume.equals(obj.nume) && this.rasa.equals(obj.rasa) && this.age == obj.age){
            return true;
        }else{
            return false;
        }
    }

    public void apport(){
        System.out.println("Apport");
    }

    public void displayInfo(){
        System.out.println("Rasa: " + this.rasa + ", varsta: " + this.age + ", nume: " + this.nume);
    }

    public static void bark(){
        System.out.println("HAM HAM!");
    }


}
