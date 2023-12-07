package OOPconcepte;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test

    public void testMethod(){

        List<String>dotariAudiA5=new ArrayList<>();
        dotariAudiA5.add("jenti");
        dotariAudiA5.add("trapa");
        dotariAudiA5.add("faruri");

        List<String>dotariAudiA7=new ArrayList<>();
        dotariAudiA7.add("jenti");
        dotariAudiA7.add("trapa");
        dotariAudiA7.add("spoiler");
        dotariAudiA7.add("oglinzi");

        List<String>dotariBMWX5interior=new ArrayList<>();
        dotariBMWX5interior.add("incalzire scauni");
        dotariBMWX5interior.add("clima bizonica");
        dotariBMWX5interior.add("GPS");
        dotariBMWX5interior.add("tetiera cu masaj");
        dotariBMWX5interior.add("display parbriz");

        List<String>dotariBMWX5exterior=new ArrayList<>();
        dotariBMWX5exterior.add("jenti");
        dotariBMWX5exterior.add("trapa");
        dotariBMWX5exterior.add("spoiler");
        dotariBMWX5exterior.add("oglinzi");

        FabricaAudi audiA5=new FabricaAudi("A5","sedan","Verde","20",dotariAudiA5);

        audiA5.prezentareAudi();

        FabricaAudi audiA7=new FabricaAudi("A7","Suv","Gri","20",dotariAudiA7);

        audiA7.prezentareAudi();

        audiA7.setModel("A8");
        audiA7.prezentareAudi();

        audiA7.AfisareRezultate();
        audiA7.AfisareRezultate(2022);
        audiA7.AfisareRezultate("X",2022);

        audiA7.AngajariFirma();

        FabricaBMW BMWX5=new FabricaBMW("X5","sedan","Verde","30",
                dotariBMWX5exterior,dotariBMWX5interior);

        BMWX5.prezentareBMW();
        BMWX5.AngajariFirma();




    }
}
