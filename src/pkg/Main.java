package pkg;

import pkg.importovano.Vozidlo;
import pkg.importovano.Auto;
import pkg.zaklady.Vysvetlivka;

public class Main {

    private Main() { //konstruktor
        vypisVozidla(Vysvetlivka.VOZIDLA);

        /*
        Deklarace objektu
        NázevTřídy názevObjektu = new NázevTřídy(datovýTypParametru názevParametru)
         */
        Auto auto1 = new Auto(4, "Diesel", "Červená", "Volkswagen");
        Auto auto2 = new Auto(4, "Elektrika", "Modrá", "Škoda");
        //K deklaraci nebo referenci na potomka můžeš využít název nadřazené třídy
        Vozidlo auto3 = new Auto(4, "Benzín", "Černá", "Honda");

        vypisVozidla(new Vozidlo[]{auto1, auto2, auto3});

        //pro názornost
        int a = 5;
        //je ekvivalent
        Integer b = new Integer(5);
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

    private void vypisVozidla(Vozidlo[] poleVozidel) {
        for (Vozidlo vozidlo : poleVozidel) {
            System.out.println(vozidlo);
        }
    }

    public static void main(String[] args) {
        new Main(); //volání konstruktoru bez deklarace proměnné => vytvoření objektu bez jeho uložení
    }
}
