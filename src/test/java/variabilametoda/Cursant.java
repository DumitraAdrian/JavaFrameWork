package variabilametoda;

import org.testng.annotations.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Cursant {
    //primul program
    //Clasa =cu sablon specific unui obiect care contine variabile si metode
    //Identificam o clasa dupa cuvantul claaa
    //O clasa trebuie sa aiba un  nume
    //Continutul unei clase se regasese intre acolade
    //Intr-un fisier java putem avea mai multe clase
    //variabila =Proprietatea unei clase
    //variabilele sunt de doua feluri:global si local
    //Variabila globala=este vizibila este tot in classa
    //variabila locala =este vizibila doar in locul declarat
    //Variabila globala=public tip de date nume variabila
    //Variabila poate sau nu sa primeasca o valoare
    //Metoda=actiunea unei clase
    //Metodele sunt de 2 feluri : void si return
    //Void=metoda care executa si arata actiunea
    //Return=metoda care returneaza actiunea
    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areStudii;

@Test
    public void metodatest(){

     afisaredate();
     calculmedie("Semestrul1",9.25,6.65);
    calculmedie("Semestrul2",7.25,5.65);
     calculpret(10);
    calculpret(30);

    }
    public void afisaredate(){
        nume="Dumitra";
        prenume="Adrian";
        varsta=30;
        adresa="Timisoara nr 30";
        inaltime=1.65;
        greutate=68.5f;
        sex='M';
        areStudii=true;

        System.out.println("Numele cursantului este "+nume+" "+prenume+"  "+varsta);
        System.out.println("Varsta cursantului este " +varsta);
        System.out.println("Adresa cursantului este " +adresa);
        System.out.println("Inaltime cursantului este " +inaltime);
        System.out.println("Greutatea cursantului este " +greutate);
        System.out.println("Sexul cursantului este " +sex);
        System.out.println("Are cursantul studii? " +areStudii);
    }
public void calculmedie (String tipnote,Double nota1,Double nota2){

        Double rezultat=(nota1+nota2)/2;

        System.out.println("Media examenelor la " +tipnote+" este:"+rezultat);

}
public void calculpret(Integer reducere){

    Integer pret=1000;
    System.out.println("pret initial este: "+pret);
    Integer diferentapret=(pret*reducere)/100;
    Integer pretfinal=pret-diferentapret;
    System.out.println("Pretul final dupa aplicarea reducerii este:" +pretfinal);

    }

}


