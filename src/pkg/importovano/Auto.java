package pkg.importovano;

/*
Dědičnost

Třída Auto dědí z třídy Vozidlo (class Auto extends-rozšiřuje Vozidlo)
Objekt vytvořený z třídy Auto má přístup ke všem funkcím a atributům třídy Vozidlo
 */
public class Auto extends Vozidlo {

    private String barva;
    private String znacka;

    public Auto(int pocetKol, String pohon, String barva, String znacka) {
        super(pocetKol, pohon); //volání konstruktoru z nadřazené třídy a nastavení parametrů z nadřazené třídy
        this.barva = barva;
        this.znacka = znacka;

        //System.out.println(this.barva);
        //- Atributy a funkce z nadřazené třídy (Vozidlo) voláš pomocí notace "super.nazevAtributu" nebo "super.nazevFunkce(parametry)"
        //System.out.println(super.getPocetKol());
        //- Privátní atributy a funkce ale takhle nezavoláš.
        //super.pocetKol by ti hodilo chybu, protože ve třídě Vozidlo je atribut pocetKol privátní
        //musíš změnit na protected, nebo použít getter jako na řádku 20
    }

    //Tyto funkce již nejsou viditelné a dostupné v třídě Vozidlo
    public String getBarva() {
        return barva;
    }

    public String getZnacka() {
        return znacka;
    }

    @Override
    public String toString() {
        return "Pohon: " + super.getPohon() + ", Počet kol: " + this.getPocetKol() + ", Barva: " + this.barva + ", Značka: " + this.znacka;
    }
}
