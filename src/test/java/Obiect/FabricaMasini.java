package Obiect;

public class FabricaMasini {

    // Constructor=are ca rol de a initializa atributele unei clase
    //Un constructor este public si are acelasi nume cu clasa
    //Un constructor poate sa fie de doua feluri: cu parametri si fara
    //Un constructor fara parametrii se mai numeste si default
    //Daca nu am definit noi un constructor,avem unul default
    //Intr-o clasa putem avea n constructori,diferentiati prin numar
    //sau tip de parametrii

    // Obiect=Instanta unei clase
    // Un obiect reprezinta o structura pe care o are clasa si din care
    // poate accesa variabilele si metodele fespective.

    //Dintr-o clasa putem initializa n obiecte
    //In momentul in care initializam un obiect,apelam conctructori din clasa

    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;

    public FabricaMasini(String marca, String model, String combustibil, String transmisie,
                         Integer an, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public FabricaMasini(String marca, String model, String combustibil, String transmisie,
                         Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareProdus() {
        System.out.println("Marca masini este : " + marca);
        System.out.println("Modelul masini este : " + model);
        System.out.println("Tipul de combustibil este : " + combustibil);
        System.out.println("Tipul de transmisie este : " + transmisie);
        System.out.println("Anul Fabticatiei este :" + an);
        System.out.println("Motorizarea este : " + motorizare);
        if (pret != null) {
            System.out.println("pretul masini este : " + pret);
        }

    }


    public void calculImpozit() {
        if (an >= 2020 && combustibil.equals("Electric")) {
            System.out.println("Clientul trebuie sa plateasca 5 lei");
        } else {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masini");
        }
    }

}

