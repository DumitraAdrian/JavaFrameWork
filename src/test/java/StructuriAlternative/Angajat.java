package StructuriAlternative;

import org.testng.annotations.Test;

public class Angajat {

    @Test
    public void metoda_test(){
        zilele_saptamanii(4);

    }
    //reprezentam zilele sapramanii
    public void zilele_saptamanii(Integer zi){
       switch (zi) {
           case 1:
               System.out.println("astazi este duminica");
               break;
           case 2:
               System.out.println("astazi este luni");
               break;
           case 3:
               System.out.println("astazi este marti");
               break;
           case 4:
               System.out.println("astazi este miercuri");
               break;

       }

       }

    }


