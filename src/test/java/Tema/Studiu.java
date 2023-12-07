package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Studiu {

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;

    @Test

    public void metoda_test() {
//        detalii();
//        calcul(9.0, 3.9, 9.9);
//        metoda_calcul_2(2, 4, 6, 8);
//        metoda_calcul_3();
//        for_afisare_primele_5_numere();
//        for_afisare_primele_50_numere();
//        for_afisare_nume();
//        while_afisare_5_numere();
//        while_afisare_10_numere();
//        while_afisare_nume();
//        suma_numere();
//        while_calcul_a_100_numere();
//        for_numere_divizibile();
//        numere_divizibile_b();
//        numere_divizibile_c();
//        numere_divizibile_d();
//        nume_coleg_array();
//        nume_animale();
//        nume_orase();
//        nume_fructe();
//      magazin();
        //obiecte_HashMap();
       // exemplul_4_hashmap();
        masini();


    }

    public void detalii() {
        nume = "Dumitra";
        prenume = "Adrian";
        varsta = 30;
        adresa = "Timisoata";

        System.out.println("introduceti detaliile : " + nume + "," + prenume + "," + varsta + "," + adresa);

    }

    public void calcul(Double a1, Double a2, Double a3) {
        Double calcul = a1 + a2 + a3;

        System.out.println("rezultatul dupa calcul este :" + calcul);


    }

    public void metoda_calcul_2(Integer b1, Integer b2, Integer c1, Integer c2) {
        Integer calcul;
        calcul = (b1 + b2) - (c1 * c2) / 2;

        System.out.println("Rezultatul este :" + calcul);
    }

    public void metoda_calcul_3() {
        Integer calcul, b1 = 2, b2 = 4, c1 = 6, c2 = 8;
        calcul = (b1 + b2) + (c1 * c2) / 2;

        System.out.println("Rezultatul este :" + calcul);
    }

    public void for_afisare_primele_5_numere() {
        for (Integer index = 0; index < 5; index++) {
            System.out.println(index);
        }

    }

    public void for_afisare_primele_50_numere() {
        for (Integer index = 0; index <= 50; index++) {
            System.out.println(index);
        }

    }

    public void for_afisare_nume() {
        for (Integer index = 0; index < 3; index++) {
            System.out.println("Dumitra");
        }

    }

    public void while_afisare_5_numere() {
        Integer index = 0;
        while (index < 5) {
            System.out.println(index);
            index++;
        }

    }

    public void while_afisare_10_numere() {
        Integer index = 0;
        while (index <= 10) {
            System.out.println(index);
            index++;
        }
    }

    public void while_afisare_nume() {
        Integer index = 0;
        while (index < 5) {
            System.out.println("Dumtra");
            index++;
        }
    }

    public void suma_numere() {
        Integer index = 0;
        Integer suma_numere = index;
        while (index < 10) {
            suma_numere = suma_numere + index;
            index++;

        }
        System.out.println("Suma numerelor este : " + suma_numere);
    }

    public void while_calcul_a_100_numere() {
        Integer index = 0;
        Integer suma = index;
        while (index < 100) {
            suma = suma + index;
            index++;
        }
        System.out.println("suma a 100 de numere este :" + suma);
    }

    //afisam primele 3 numere divizibile cu 5
    public void for_numere_divizibile() {
        Integer a = 0;
        for (Integer index = 0; index < 50; index++) {
            if (index % 5 == 0 && a < 3) {
                a++;
                System.out.println(index);
            }
        }

    }

    public void numere_divizibile_b() {
        Integer b = 0;
        for (Integer index = 0; index < 50; index++) {
            if (index % 4 == 0 && b < 4) {
                b++;
                System.out.println(index);
            }
        }
    }

    public void numere_divizibile_c() {
        Integer c = 0;
        for (Integer index = 0; index < 100; index++) {
            if (index % 10 == 0 && c<3) {
                c++;
                System.out.println(index);
            }

        }
    }
    public void numere_divizibile_d(){
        Integer d=0;
        for (Integer index=0;index<50;index++){
            if(index%2==0 && d<6){
                d++;
                System.out.println(index);
            }
        }

    }
    public void nume_coleg_array(){//array
        String[] nume_coleg=new String[4];
        nume_coleg[0]="Mircea";
        nume_coleg[1]="Alex";
        nume_coleg[2]="Nelu";
        nume_coleg[3]="Gigi";

        for (Integer index=0;index<nume_coleg.length;index++){
            System.out.println(nume_coleg[index]);

        }

    }
    public void nume_animale(){//array
        String[]nume_animale=new String[4];
        nume_animale[0]="caine";
        nume_animale[1]="vaca";
        nume_animale[2]="pisic";
        nume_animale[3]="lup";

        for (Integer index=0;index<nume_animale.length;index++){
            System.out.println(nume_animale[index]);
        }
    }
    public void nume_orase(){//array
        String[]nume_oras=new String[5];
        nume_oras[0]="Timisoara";
        nume_oras[1]="Bucuresti";
        nume_oras[2]="Tulcea";
        nume_oras[3]="Pitesti";
        nume_oras[4]="Arad";

        for(Integer index=0;index<nume_oras.length;index++ )
            System.out.println(nume_oras[index]);

    }
    public void nume_fructe(){//array
        String[]nume_fructe= new String[3];
        nume_fructe[0]="mere";
        nume_fructe[1]="pere";
        nume_fructe[2]="struguri";
        for(Integer index=0;index<nume_fructe.length;index++){
            System.out.println(nume_fructe[index]);
        }

    }
    public void lucruru_camera(){

        String[]lucruri=new String[3];
        lucruri[0]="televizor";
        lucruri[1]="noptiera";
        lucruri[2]="pat";

        for (Integer index=0;index<lucruri.length;index++){
            System.out.println(lucruri[index]);
        }
    }

    public void magazin(){
        String[]marfa_magazin=new String[5];
        marfa_magazin[0]="paine";
        marfa_magazin[1]="apa";
        marfa_magazin[2]="suc";
        marfa_magazin[3]="bere";
        marfa_magazin[4]="carne";

        for(Integer index=0;index<marfa_magazin.length;index++){
            System.out.println(marfa_magazin[index]);
        }


    }
    public void cumparaturi(){
        String[]lista_cumparaturi=new String[5];
        lista_cumparaturi[0]="sare";
        lista_cumparaturi[1]="ulei";
        lista_cumparaturi[2]="morcovi";
        lista_cumparaturi[3]="detergent";
        lista_cumparaturi[4]="iaurt de fructe";

        for (Integer index=0;index<lista_cumparaturi.length;index++){
            System.out.println(lista_cumparaturi[index]); //Array
        }

    }
     public void nume_elevi_Lista(){
         List<String>Prezenta_elevi=new ArrayList<>();
         Prezenta_elevi.add("Popescu");
         Prezenta_elevi.add("Ionescu");
         Prezenta_elevi.add("Georgescu");
         Prezenta_elevi.add("Dumitra");

         for(Integer index=0;index<Prezenta_elevi.size();index++){
             System.out.println(Prezenta_elevi.get(index));
         }


     }
     public void nume_fructe_Lista(){
        List<String>fructe=new ArrayList<>();
        fructe.add("mere");
        fructe.add("pere");
        fructe.add("gutui");
        fructe.add("struguri");

        for(Integer index=0;index<fructe.size();index++){
            System.out.println(fructe.get(index));
        }


     }
     public void componente_masina_List(){
        List<String>interior_masina=new ArrayList<>();
        interior_masina.add("scaune");
        interior_masina.add("volam");
        interior_masina.add("radio");
        interior_masina.add("presuri");

        for ( Integer index=0;index<interior_masina.size();index++){
            System.out.println(interior_masina.get(index));
        }

     }
     public void interior_capota_masina(){
        List<String>componente=new ArrayList<>();
        componente.add("motor");
        componente.add("curea accesorii");
        componente.add("alternator");
        componente.add("compresor");

        for (Integer index=0;index<componente.size();index++){
            System.out.println(componente.get(index));
        }

     }
     public void bucatarie(){
        String[]elemente_bucatarie=new String[3];
        elemente_bucatarie[0]="cuptor";
        elemente_bucatarie[1]="aragaz";
        elemente_bucatarie[2]="masina de spalat";

        for(Integer index=0;index<elemente_bucatarie.length;index++){
            System.out.println(elemente_bucatarie[index]);
        }

     }
     public void Bucatarie(){
        List<String>alte_elemente=new ArrayList<>();
        alte_elemente.add("hota");
        alte_elemente.add("masina de spalat vase");
        alte_elemente.add("mobilier bucatarie");

        for(Integer index=0;index<alte_elemente.size();index++){
            System.out.println(alte_elemente.get(index));
        }

     }
     public void obiecte_HashMap(){
        HashMap<String,String>obiecte=new HashMap<>();
        obiecte.put("bucatarie","aragaz");
        obiecte.put("autoturism","pasager");
        obiecte.put("magazin","ciocolata");

        for(String key :obiecte.keySet()){
            System.out.println("Cheia este : " +key);
            System.out.println("Valoarea este : " +obiecte.get(key));
        }

     }
     public void alt_exemplu_2_HashMap(){
        HashMap<String,String>Magazin=new HashMap<>();
        Magazin.put("electrocasnice","aspirator");
        Magazin.put("mobila","pat");
        Magazin.put("articole pescuit","lanseta");

        for(String key :Magazin.keySet()){
            System.out.println("cheie magazin : " +key);
            System.out.println("valoare magazin : " +Magazin.get(key));
        }

     }
     public void exemplul_3_Hashmap(){
        HashMap<String,String>Clasa_elevi=new HashMap<>();
        Clasa_elevi.put("Popescu","nota 5");
        Clasa_elevi.put("Ionescu","nota 8");
        Clasa_elevi.put("Georgescu","nota 9");

        for(String key:Clasa_elevi.keySet()){
            System.out.println("numele este : " +key);
            System.out.println("nota este : " +Clasa_elevi.get(key));
        }
     }
     public void exemplul_3_hashmap(){
        HashMap<String,String>angajati=new HashMap<>();
        angajati.put("IT","Popescu");
        angajati.put("Ferma","Ionescu");
        angajati.put("Georgescu","sofer");

        for(String key:angajati.keySet()){
            System.out.println("meserie este :"+key);
            System.out.println("numele angajatului este : " +angajati.get(key));
        }
     }
     public void exemplul_4_hashmap(){
        HashMap<String,String>student=new HashMap<>();
        student.put("Gigi","nota 7");
        student.put("Alex","nota 8");
        student.put("Madalina","nota 5");

        for(String key:student.keySet()){
            System.out.println("numele studentului este : " +key);
            System.out.println("nota studentului este : " +student.get(key));

        }
     }
     public void Licenta(){
        HashMap<String,String>note_licenta=new HashMap<>();
        note_licenta.put("Andrei","nota 5");
        note_licenta.put("George","nota 8");
        note_licenta.put("Ion","nota 3");

        for (String key:note_licenta.keySet()){
            System.out.println("numele cheie este : "+key);
            System.out.println("Valoare nota este : " +note_licenta.get(key));

        }
     }
     public void cinematograf(){
        HashMap<String,String>Film=new HashMap<>();
        Film.put("Dune","gen SF");
        Film.put("Indiana Jones","Gen Aventura");
        Film.put(" The Nun","Gen Horror");

        for (String key: Film.keySet()){
            System.out.println("numele filmului este cheie : " +key);
            System.out.println("genul filmului este valoarea : " +Film.get(key));
        }

     }
     public void revista_tari_si_orase(){
        HashMap<String,List<String>>Orase=new HashMap<>(); //new LinkedHashMap<>();este folosit pentru a pune in ordine codul declarat
        List<String>orase_Romania=new ArrayList<>();
        orase_Romania.add("Pitesti");
        orase_Romania.add("Oradea ");
        orase_Romania.add("Buzau");

        List<String>orase_America=new ArrayList<>();
        orase_America.add("Malibu");
        orase_America.add("New York");
        orase_America.add("California");

        for(String key: Orase.keySet()){
            System.out.println("Tara este : " +key);
            System.out.println("Orasele sunt urmatoarele :");

            List<String>orase_curente=Orase.get(key);
            for( Integer index=0;index<orase_curente.size();index++){
                System.out.println(orase_curente.get(index));
            }
        }

     }
     public void masini(){
        HashMap<String,List<String>>parc_auto=new LinkedHashMap<>();
        List<String>Parc_Adi_auto=new ArrayList<>();
        Parc_Adi_auto.add("Reanult");
        Parc_Adi_auto.add("Audi");
        Parc_Adi_auto.add("BMW");

        List<String>Parc_Giarmata=new ArrayList<>();
        Parc_Giarmata.add("Dacia");
        Parc_Giarmata.add("Mercedes");
        Parc_Giarmata.add("Opel");

        for(String key:parc_auto.keySet()){
            System.out.println("Parcul preferat este : " +key);
            System.out.println("modelul de masini din parc este :");

            List<String>masini_preferate=parc_auto.get(key);
            for(Integer index=0;index<masini_preferate.size();index++) {
                System.out.println(masini_preferate.get(index));
            }
        }
     }
}
