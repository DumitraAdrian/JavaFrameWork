package TemaVariabile;
import java.time.*;
import java.time.format.DateTimeFormatter;
import org.testng.annotations.Test;

public class Tema {

    public String Buna;
    public String Salut;
    public String Nume ;
    public String Prenume;
    public Integer Varsta;
    public Character salut;
    public String LocalDate;
    public String dataObject;


    @Test

    public void Metoda_test(){
        NumeTest();
        Data_si_timp();
        Exercitiu();
        Adunare();
        adunare();

    }
    public void NumeTest(){
        Salut="salut";
        Buna="Hello World";
        Nume="Dumitra";
        Prenume="Adrian Daniel";
        Varsta=30;
        char a='M';
        char b='H';
        char c='Z';

        System.out.println(Salut+a);
        System.out.println(b+Buna);
        System.out.println("Numele meu  este : "+Nume+" \n "+Prenume);
        System.out.println("Varsta  este : " +Varsta);
        System.out.println("Ana"+c+" are"+c+"  mere"+c+" ,pere"+c+" ,prune"+c+" ");
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");


    }

    public void Data_si_timp () {
        LocalDateTime timedateObj ;
        timedateObj = LocalDateTime. now ( ) ;
        DateTimeFormatter dtf ;
        dtf = DateTimeFormatter. ofPattern ( "dd-MM-yy \n HH: mm: ss" ) ;
        System . out . println ( dtf. format ( timedateObj ) ) ;
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }
    public void Exercitiu(){
       Integer a=2,b=2,c=4,rezultat;
        rezultat=(a+(b*c)-b)/b;

        System.out.println("Stiu ca am calculat bine :" +rezultat);
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }
public void Adunare(){
        double a=10,b=27.3,c=50,d;
        d=a+b+c;
    System.out.println("Stiu ca am calculat bine :" +d);
    System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
}
public void adunare(){
        Integer a=15,b=21,c;
        c=a+b;
    System.out.println("Stiu ca am calculat bine :" +c);
    System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
}

}
