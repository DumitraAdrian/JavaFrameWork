package Tema;

import org.testng.annotations.Test;

public class Studiu3obiect {

    @Test

    public void metoda_test(){

        Studiu3constructor HP_i7=new Studiu3constructor("HP","CORE I7","Gri",3200,2023);
        HP_i7.prezentare_produs();
        System.out.println("========================");

        Studiu3constructor Lenovo=new Studiu3constructor("lenovo","I5 core","Verde",2000,2020);
        Lenovo.prezentare_produs();
        System.out.println("======================");

        Studiu3constructor OpelAstra_h=new Studiu3constructor("Opel","Astra H","Albastru",10000, 2023,"Electric");
        OpelAstra_h.prezentare_produs();
        OpelAstra_h.calculimpozit();
        System.out.println("===========================");

    }
}
