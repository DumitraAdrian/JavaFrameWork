package Tema;

import org.testng.annotations.Test;

public class Masina {
    public String Nume;
   public int Pret;
   public Integer Fabricatie;
   public String Culoare;
   public double Greutate;
   public String Logo;
   public boolean Disponibil;

@Test

   public void afisarespecificatii(){
        Nume="Suzuki";
        Pret=12000;
        Fabricatie=2023;
        Culoare="Albastru";
        Greutate=999.9;
        Logo="S";
        Disponibil=true;

        System.out.println(Nume);
        System.out.println(Pret);
        System.out.println(Fabricatie);
        System.out.println(Culoare);
        System.out.println(Greutate);
        System.out.println(Logo);
        System.out.println(Disponibil);
    }

}


