package Obiect;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test
    public void metoda_test(){
        FabricaMasini Mercedes_G63AMG=new FabricaMasini("Mercedes","G 63 AMG","Kerosen",
                "Electric",2023,4.89);
        Mercedes_G63AMG.prezentareProdus();
        Mercedes_G63AMG.calculImpozit();
        System.out.println("============");

        FabricaMasini DaewooMatiz=new FabricaMasini("Daewoo","Matiz","Gpl",
                "Automata",2023,1.0);
        DaewooMatiz.prezentareProdus();
        DaewooMatiz.calculImpozit();
        System.out.println("============");
        FabricaMasini AudiR8=new FabricaMasini("Audi","R8","electric",
                "Manuala",2022,3.2 , 99000);

        AudiR8.prezentareProdus();
        System.out.println("============");
        AudiR8.calculImpozit();

    }

}
