package StructuriRepetitive;

import org.testng.annotations.Test;

public class Caine {
    //structuri repetitive=for,while,for each

    @Test
    public void metoda_test(){
       // afisare_numere_for();
//        afisare_numere_While();
//        afisare_nume();
        suma_numere();
        //afisare_nr_divizibil();

    }

    //afisam primele 10 numere
     public void afisare_numere_for(){
        for (Integer index=0;index<50;index++){
            System.out.println(index);
        }

     }

     public void afisare_numere_While(){
        Integer index=0;
        while (index<50){
            System.out.println(index);
            index++;
        }
     }

     //afisam numele nostru de 5 ori
    public void afisare_nume(){
        for(Integer index=0;index<5;index++){
            System.out.println("Dumitra");
        }

    }

    //calculam suma primelor 10 numere

    public void  suma_numere(){
        Integer index=0;
        Integer suma_numere=index;
        while(index<=10) {
            suma_numere=suma_numere+index;
            index++;

        }
        System.out.println("suma numerelor este:"+suma_numere);

    }

    //afisam primele 3 numere divizibile cu 5

    public void afisare_nr_divizibil(){
        Integer a=0;
        for(Integer index=0;index<21;index++){
            if(index%5==0 && a<3 ){
                a++;
                System.out.println(index);

            }
//            if (a==3){
//                break;
//            }
        }

    }
    public void multimi(){

    }

}
