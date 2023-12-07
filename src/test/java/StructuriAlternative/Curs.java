package StructuriAlternative;

import org.testng.annotations.Test;

import java.util.Date;

public class Curs {
    //structurile sunt de 2 feluri :alternative si repetitive
    //1.structuri alternative:if..then..switcw...case
    //

    @Test
    public void test_metod() {
        Verific_nr_mai_mare(9);
        Verific_nr_mai_mare(1);
        Verific_nr_mai_mare(5);
        Verific_nr_mai_mare(-6);
        Verific_nr_mai_mare(4);
        Verific_nr_mai_mare(6);
        verific_numar_par(1);
        verific_numar_par(2);
        verific_numar_par(-10);
        verific_numar_par(0);
        verific_numar_par(-3);
        verific_numar_par(6000);
        verific_numar_par(3333);
        persoana_majora(17);
        persoana_majora(18);
        persoana_majora(19);
    }

    //verificam daca un nr este mai mare decat 5
    public void Verific_nr_mai_mare(Integer nr) {
        if (nr > 5) {
            System.out.println("numarul " + nr + " este mai mare ca 5");

        } else {
            System.out.println("numarul " + nr + " este mai mic ca 5");
        }
    }
    //verificam daca un numar este par si pozitiv
    //daca vreau catul=/(div)
    //daca veau restul=%mod

    public void verific_numar_par(Integer nr) {
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("numarul " + nr + " este par si pozitiv");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("numarul este par si negativ");
            } else {
                System.out.println("numarul este impar si negativ");
            }
        } else {
            System.out.println("numarul " + nr + " este 0");
        }

    }

    //verificam daca persoana este majora
    public void persoana_majora(Integer varsta) {
        if (varsta >= 18) {
            System.out.println("Persoana cu varsta"+varsta+"este majora");
        }
        else {
            System.out.println("persoana nu este majora");

        }
    }

}