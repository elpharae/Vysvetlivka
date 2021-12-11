/*
Na začátku souboru je vždy "package x;"

- určuje, v jaké složce (packagi/balíčku) se daný .java soubor nachází
- Korelace mezi package a souborovou hiearchií projektu
    - jako například tento soubor: package pkg.zaklady;
    - soubor Vysvetlivka.java patří do package "zaklady,"
    - package "zaklady" patří do package "pkg"
    - v source souborech projektu je složka "pkg," ve které je vytvořen package "zaklady," ve kterém je soubor Vysvetlivka.java
- Cesta v prohlížeči souborů: "projekt"/src/pkg/zaklady/Vysvetlivka.java
- adresování package zaklady v javě: "package pkg.zaklady;
 */
package pkg.zaklady;

/*
Po package notaci může být (nemusí, pokud nepoužíváš žádné externí funkce) import
třeba v podobě "import pkg.importovano.Vozidlo;"
- Používá se v případě, kdy potřebuješ využít funkce, kterou sis vytvořil dříve v jiným package
  nebo na import tříd z vestavěných knihoven v JDK.
- Příkladem třída Scanner. Pro použití scanneru musíš napsat "import java.util.Scanner;" Programovací prostředí
  (např. NetBeans) to za tebe většinou dělá samo během psaní kódu.
 */
import pkg.importovano.Vozidlo; //pro vysvětlení struktury třídy jdi do třídy Vozidlo

public class Vysvetlivka {

    public static final Vozidlo[] VOZIDLA = {
        new Vozidlo(4, "Diesel"),
        new Vozidlo(4, "Elektrika"),
        new Vozidlo(6, "Nafta")
    };

}
