package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Studiu2 {
    String nume;
    String prenume;
    Integer varsta;
    String ocupatie;

    @Test

    public void metoda_test(){
        detalii();
        array();
    }
    public void detalii(){
        nume="Dumitra";
        prenume="Adrian Daniel";
        ocupatie="Tester";
        varsta=30;

        System.out.println("Numele este :" +nume+ " "+prenume+" ocupatia este  de " +ocupatie+ " si varsta de " +varsta);
    }
    public void array(){
        String[]Cursanti=new String[3];
        Cursanti[0]="Popescu";
        Cursanti[1]="Ionescu";
        Cursanti[2]="Georgescu";

        for (Integer index=0;index<Cursanti.length;index++){
            System.out.println(Cursanti[index]);
        }

    }
    public void list(){
        List<String>Cursanti_noi=new ArrayList<>();
        Cursanti_noi.add("Alin");
        Cursanti_noi.add("Stefan");
        Cursanti_noi.add("Razvan");

        for(Integer index=0;index<Cursanti_noi.size();index++){
            System.out.println(Cursanti_noi.get(index));
        }

    }
    public void Hashmap(){
        HashMap<String,String>Note_cursanti=new HashMap<>();
        Note_cursanti.put("Alin","nota 8");
        Note_cursanti.put("Stefan","nota 9");
        Note_cursanti.put("Razvan","nota 10");

        for(String key: Note_cursanti.keySet()){
            System.out.println("cheia nume este : " +key);
            System.out.println("valoarea nota este : " +Note_cursanti.get(key));
        }

    }
}
