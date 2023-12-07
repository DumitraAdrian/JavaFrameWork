package Tema;

public class Studiu3constructor {

    public String marca;
    public String model;
    public String culoare;
    public Integer pret;
    public Integer an_fabricatie;
    public String combustibil;

    public Studiu3constructor(String marca, String model, String culoare, Integer pret, Integer an_fabricatie) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
        this.an_fabricatie = an_fabricatie;

    }

    public Studiu3constructor(String marca, String model, String culoare, Integer pret, Integer an_fabricatie, String combustibil) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
        this.an_fabricatie = an_fabricatie;
        this.combustibil = combustibil;
    }

    public void prezentare_produs() {
        System.out.println("Marca este :" + marca);
        System.out.println("Modelul este: " + model);
        System.out.println("Culoarea este : " + culoare);
        System.out.println("Pretul este : " + pret);
        System.out.println("Anul fabricatiei este :" + an_fabricatie);


    }

    public void calculimpozit() {
        if (an_fabricatie >= 2020 && combustibil.equals("Electric")) {
            System.out.println("Clientul trebuie sa platesaca 10 lei");

        } else {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masini");
        }

    }
}