package Tema;

import org.testng.annotations.Test;

public class Angajat_nou {
    public String nume;
    public String prenume;
    public Integer varsta;
    public String ocupatie_anterioara;
    public String adresa;

    @Test
    public void metoda_testare() {
        date();
        verificare_varsta(18);
        // get_marire(25);
        // System.out.println(get_marire(10));
        System.out.println("salariul dupa marire este :" + get_marire(10) + "");
        zi_libera(3);
        adunare(20,50,100);
        comparatie_3_numere();
        calcul_complex();

    }


    public void date() {
        nume = "Dumitra";
        prenume = "Adrian Daniel";
        varsta = 18;
        ocupatie_anterioara = "bucatar";
        adresa = "Timisoara numarul 3";

        System.out.println("Numele angajatului este:" + nume + "\n" + prenume + "");
        System.out.println("Varsta angajatului este : " + varsta + "");
        System.out.println(("Locul de munca anterior este :" + ocupatie_anterioara + ""));
        System.out.println("Adresa angajatului este :" + adresa + "");

    }

    public void verificare_varsta(Integer varsta) {
        if (varsta >= 18 && varsta <= 18) {
            System.out.println("Angajatul este major :");
        } else if (varsta <= 18) {
            System.out.println("Angajatul este minor");

        }

    }

    public Integer get_marire(Integer procent) {
        Integer salar = 9200;
        Integer marire = (salar * procent) / 100;

        System.out.println("Salariul este marit cu :" + marire + "");


        return salar + marire;
    }

    public void zi_libera(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
        }

    }

    public void adunare(Integer n1, Integer n2, Integer n3) {
        Integer numar;
        numar = n1 + n2 + n3;


        System.out.println("Rezultatul este : " + numar );


    }

    public void comparatie_3_numere() {

        Integer a = 10, b = 11, c =125;

        System.out.println("Introduceti numerele :" + a + "," + b + "," + c);
        if (a > b && a > c) {
            System.out.println("Cel mai mare este :" + a);
        }
        if (b > a && b > c) {
            System.out.println("Cel mai mare este :" + b);
        }
        if (c > a && c > b) {
            System.out.println("Cel mai mare este :" + c );
        }

    }
    public void calcul_complex(){
        Integer a=10,b=21,c=42,d=76,e=300,rezultat;
       rezultat=(a*b)-(c+d)/2+e;
        System.out.println("Rezultatul este :"+rezultat);
    }


}


