package pkg.importovano;
/*
Struktura tříd:

Místo pro psaní kódu je vždy uvnitř třídy.
Třída je šablona nebo předpis pro vytvoření objektu. Objekt si můžeš představit jako skutečný objekt z reálného světa.
- Představ si vozidlo v reálným životě. Vozidlo má spoustu vlastností a funkcí.
    - Vlastnosti: typ vozidla, pohon, počet kol...
- Vozidlo má ale i funkce:
    - Funkce: zatrub, jeď dopředu, couvej, zatoč doleva, zatoč doprava, vyklop náklad...

Stejně jako se v továrně vytváří vozidla podle nějakého plánu či návodu, stejně bys vytvářel vozidla v Javě.
Třída je právě ten plán, podle kterýho bys vytvořil vozidlo.
 */
public class Vozidlo {

    /*
    Tyhle vlastnosti a funkce popsaný o pár řádku vejš mají svoje ekvivalenty při psaní třídy
    Vlastnosti jsou tzv. atributy. Jsou to proměnné, které jsou viditelné a dostupné v celé své třídě.
    Pro názornost vemu dvě obecné vlastnosti vozidla: Počet kol a Pohon.

    Struktura atributů:

    1) modifikátor přístupu (private, protected, public, žádný)
        - povinný (modifikátor přístupu tam je, ikdyž ho nezadáš)
        - private - atribut je dostupný a viditelný pouze uvnitř své třídy
        - protected - atribut je dostupný a viditelný uvnitř své třídy a v potomku, který z této třídy dědí (pozdějc)
        - public - atribut je dostupný a viditelný všude
        - žádný - atribut je dostupný a viditelný v packagi, ve kterém se nachází daná třída
    2) vazba na objekt (static/žádná)
        - static určuje, zda daný atribut je vázaný na třídu či ne.
        - Pokud atribut není vázaný na třídu, každý objekt vytvořený
          z této třídy má svou vlastní hodnotu v tomto atributu.
        - Pokud atribut je vázaný na třídu (má static notaci), všechny objekty vytvořené
          z této třídy sdílí stejnou hodnotu v tomto atributu, protože tento atribut nenáleží
          těmto objektům, ale třídě, ze které jsou tyto objekty vytvořené.
            - Nestatické atributy jsou přístupné pomocí "nazevObjektu.nestatickyAtribut"
            - Statické atributy jsou přístupné pomocí "nazevTridy.statickyAtribut"
    3) určení konstanty (final/žádná)
        - Pokud má atribut notaci final, tak nemůže být v kódu změněna jeho hodnota.
        - je to konstanta
    4) datový typ
        - Určuje typ dat, které chceš v atributu ukládat.
        - Pokud chceš mít atribut cislo, můžeš využít číselných datových typů (float, int, byte, short, long, double...)
            - Tyto datové typy se liší svou velikostí v obsazení paměti nebo možností uchování části za desetinnou čárkou
        - Pokud chceš mít atribut text, můžeš využít datového typu String.
            - Všimni si, že datovej typ String je oproti číselným piše s velkým S
            - Je to proto, že String je komplexnější datovej typ, než číselný datový typy
            - String má daleko víc funkcí, než číselné datové typy
            - Je to taky proto, že každý svůj datový typ má svou třídu
            - int má třídu Integer, float má třídu Float, double má třídu Double ...
            - Jinými slovy, jsou to OBJEKTY tvořené z jejich náležících TŘÍD
    5) název;
        - prostě název atributu
    */
    private int pocetKol;
    private String pohon;
    private boolean vPohybu;

    /*
    Úplně ten stejný princip platí pro funkce vozidla. Vyberu 3 funkce: zatrub, jeď dopředu, zastav.

    Struktura funkcí:

    1) modifikátor přístupu (stejné jako u atributů)
    2) static (stejné jako u atributů)
        - Statickým funkcím či procedurám se říká "metody," jsou součástí knihoven (třídy, které obsahují jen funkce pro zpracovávání dat, např. třída Math)
    3) návratový typ
        - Jsou dva typy funkcí:
            - Funkce - vrací nějakou hodnotu (má návratový typ)
            - Procedury - nic nevrací (nemá návratový typ - VOID)
        - Při zavolání funkce se ti vrátí nějaká hodnota a musíš určit, jakýho datovýho typu ta hodnota bude.
    4) název funkce
    5) (datovyTypParametru nazevParametru)
        - Místo pro předání dat funkci, se kterými má funkce pracovat
        - Datový typ je nutno určit
        - Název parametru je lokální (platný pouze uvnitř funkce. To platí pro všechny proměnné,
          které jsou vytvořeny uvnitř funkcí/metod/procedur, zkrátka nejsou parametry)
    6) {telo pro kod metody;}
        - tady píšeš svůj kód. UVNITŘ SLOŽENEJCH ZÁVOREK
     */
    protected void zatrub() {
        System.out.println("Vozidlo zatroubilo");
    }

    protected void jedDopredu() {
        this.vPohybu = true;
        System.out.println("Vozidlo jede dopředu");
    }

    protected void zastav() {
        this.vPohybu = false;
        System.out.println("Vozidlo zastavilo");
    }

    /*
    Konstruktor
    - konstruktor je volán při vytváření objektu třídy, které daný konstruktor patří
    - vždy má stejný název jako třída, díky tomu poznáš konstruktor
    - strukturu má stejnou jako funkce, protože to je funkce pro vytvoření objektu daný třídy
    - nemá návratový typ (je void, ale ani to se nepíše)
    - V parametrech předáváš data, který chceš zpracovávat v konstruktoru.
        - nejčastějším použitím parametru v konstruktoru je přiřazení hodnot atributům objektu, který vytváříš
     */
    public Vozidlo(int pocetKol, String pohon) {
        /*
        Parametry konstruktoru či funkce mohou mít stejný název jako atributy třídy
        Pokud chceš volat atribut, použij notaci "this.nazevAtributu"
        IDE ti je barevně odliší
         */
        this.pocetKol = pocetKol; //atribut pocetKol dostane hodnotu parametru pocetKol
        this.pohon = pohon; //atribut pohon dostane hodnotu parametru pohon
        this.vPohybu = false; //vozidlo při vytvoření by nemělo být v pohybu

        /*
        Uvnitř konstruktoru můžeš dělat cokoliv, co bys dělal uvnitř jakékoliv procedury
        Např. může vozidlo zatroubit při vytvoření.
         */
        zatrub();
    }

    /*
    Gettery
    - Slouží k získání hodnot atributu objektu
    - Používá se u privátních atributů
    - Jsou to obyčejné, jednoduché funkce
     */
    public Integer getPocetKol() {
        //Pro názornost zaměním jednoduchej datovej typ int za jeho třídu Integer
        //aby bylo vidět, že návratovým typem může být i OBJEKT(!)
        return pocetKol;
    }

    public String getPohon() {
        return pohon;
    }

    public boolean isvPohybu() {
        return vPohybu;
    }

    /*
    Každý objekt dědí z třídy Object. Třída Object má metodu toString.
    Pomocí anotace @Override můžeš tuto metodu přepsat ve své vlastní třídě.
    Metoda toString je volána pokaždé, kdy chceš vypsat objekt. Nemusíš ji explicitně volat.
     */
    @Override
    public String toString() {
        return "Pohon: " + this.pohon + ", Počet kol: " + this.pocetKol;
    }
}
