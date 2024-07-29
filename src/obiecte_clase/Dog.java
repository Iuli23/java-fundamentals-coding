package obiecte_clase;

public class Dog {
    //proprietati
    String rasa;
    int varsta;
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
        this.varsta = varsta;
        this.nume = nume;

    }

    //metode:
    public String toString() {
        //metoda toString() transforma obiectul nostru intr-un text
        //atunci cand dorim sa afisam un obiect folosind System.out.println, metoda toString se apeleaza automat
        return "Rasa: " + this.rasa + ", varsta: " + this.varsta + ", nume: " + this.nume;
    }

    public boolean equals(Object o){
        Dog obj = (Dog) o; //am facut cast de la object la Dog

        if(this.nume.equals(obj.nume) && this.rasa.equals(obj.rasa) && this.varsta == obj.varsta){
            return true;
        }else{
            return false;
        }
    }
}