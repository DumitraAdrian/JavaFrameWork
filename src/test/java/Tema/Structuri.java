package Tema;

import org.testng.annotations.Test;

import java.util.Enumeration;

public class Structuri {

    @Test

    public void metoda_test() {
//      afisare_cuvant_1();
//       afisare_cuvant_2();
//        Primele_5_numere_divizibile_cu_3_for();
//        Primele_3_numere_dibizibile_cu_5_for();
//       Primele_4_numere_pozitive_si_pare_for();
//        Suma_numerelor_pana_la_10();
//       Produsul_numerelor_pana_la_5();
//       Citim_3_numere_cu_valori_diferite();


    }
    public void Citim_3_numere_cu_valori_diferite() {
        Integer a = 50, b = 20, c = 30;
        Integer rezultat = a + b;
        if (rezultat > c) {
            System.out.println("suma primelor 2 numere este mai mare decat al 3 lea numar :" + rezultat);
        } else {
            System.out.println("suma este mai mare decat : " + c);
        }
    }

        public void afisare_cuvant_1() {
        for (Integer index = 0; index < 5; index++) {
            System.out.print("DA\t");
        }

    }

    public void afisare_cuvant_2() {
       Integer index=0;
        while (index<5){
            System.out.print("Da\t");

            index++;

        }

    }

    public void Primele_5_numere_divizibile_cu_3_for() {
        Integer a = 0;
        for (Integer index = 0; index < 100; index++) {
            if (index % 3 == 0 && a < 5) {
                a++;
                System.out.println(index);

            }

        }
    }

    public void Primele_3_numere_dibizibile_cu_5_for() {
        Integer a = 0;
        for (Integer index = 0; index < 100; index++) {
            if (index % 5 == 0 && a < 3) {
                a++;
                System.out.println(index);
            }
        }

    }

    public void Primele_4_numere_pozitive_si_pare_for() {
        Integer a = 0;
        for (Integer index = 0; index < 100; index++) {
            if (index % 2 == 0 && a < 4) {
                a++;
                System.out.println(index);
            }
        }

    }

    public void Suma_numerelor_pana_la_10() {
        Integer index = 0;
        Integer suma_numere = index;
        while (index <= 10) {
            suma_numere = suma_numere + index;
            index++;
        }
        System.out.println("suma numerelor este:" + suma_numere);

    }

    public void Produsul_numerelor_pana_la_5() {
        Integer index = 1;
        Integer produs_numar = index;
        while (index <= 5) {
            produs_numar = produs_numar * index;
            index++;
        }
        System.out.println("produsul numerelor este:" + produs_numar);
    }


    }

