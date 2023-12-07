package Multimi;

import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Multimi {

    @Test

    public void metoda_test() {
        nume_cursanti_array();
        nume_cursanti_lista();
        obiecte_hashmap();
        reteteGatit("Tiramisu");

    }

    //afisam numele cursantilor

    public void nume_cursanti_array() {
        String[] nume_cursanti = new String[4];
        nume_cursanti[0] = "Adi";
        nume_cursanti[1] = "Anca";
        nume_cursanti[2] = "Andreea";
        nume_cursanti[3] = "Claudia";

        for (Integer index = 0; index < nume_cursanti.length; index++) {
            System.out.println(nume_cursanti[index]);
        }
    }

    public void nume_cursanti_lista() {
        List<String> nume_cursanti = new ArrayList<>();
        nume_cursanti.add("Cosmin");
        nume_cursanti.add("Diana");
        nume_cursanti.add("Letitia");
        nume_cursanti.add("Oana");

        for (Integer index = 0; index < nume_cursanti.size(); index++) {
            System.out.println(nume_cursanti.get(index));
        }
    }

    //hashmap=key-value
    public void obiecte_hashmap() {
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("electronic", "telefon");
        obiecte.put("aliment", "supa");
        obiecte.put("masina", "ford");
        for (String key : obiecte.keySet()) {
            System.out.println("cheia este " + key);
            System.out.println("valoarea este " + obiecte.get(key));
        }

    }
    // reprezentam niste tari orase

    public void tariOrase() {
        HashMap<String, List<String>> testData = new HashMap<>();
        List<String> OraseRomanie = new ArrayList<>();
        OraseRomanie.add("Brasov");
        OraseRomanie.add("Timisoara");
        OraseRomanie.add("Pitesti");

        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Venetia");
        OraseItalia.add("Torino");

        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Sevilia");

        testData.put("Romania", OraseRomanie);
        testData.put("Italia", OraseItalia);
        testData.put("Spania", OraseSpania);

        for (String key : testData.keySet()) {
            System.out.println("Tara este : " + key);
            System.out.println("Orasele sunt urmatoarele :");

            List<String> OraseCurente = testData.get(key);
            for (Integer index = 0; index < OraseCurente.size(); index++) {
                System.out.println(OraseCurente.get(index));
            }

        }

    }

    //retete de gatit

    public void reteteGatit(String reteta) {
        HashMap<String, List<String>> carteBucate = new LinkedHashMap<>();
        List<String> reteteCiorba = new ArrayList<>();
        reteteCiorba.add("Morcovi-2bucati");
        reteteCiorba.add("Smantana");
        reteteCiorba.add("Telina");
        reteteCiorba.add("ou");
        reteteCiorba.add("apa");
        reteteCiorba.add("sare si piper");
        reteteCiorba.add("carne");

        List<String> tiramisu = new ArrayList<>();
        tiramisu.add("piscoturi");
        tiramisu.add("Mascarpone");
        tiramisu.add("Cafea");
        tiramisu.add("Amareto");
        tiramisu.add("Oua");
        tiramisu.add("Zahar");

        carteBucate.put("Ciorba Radauteana ", reteteCiorba);
        carteBucate.put("Tiramisu", tiramisu);

        for (String key : carteBucate.keySet()) {
            if (key.equals(reteta)) {


                System.out.println("Reteta pentru  : " + key);
                System.out.println("Igredientele pentru reteta sunt urmatoarete:" + carteBucate.get(key));


            }

        }

    }
}

