package OOPconcepte;

import java.util.List;

public class FabricaBMW extends FabricaMasina {

    private Integer pretSrandard;
    private Integer pretFinal;
    private List<String> dotariExterioare;
    private List<String> doratiInterioare;

    public FabricaBMW(String model, String sasiu, String culoare,
                      String motorizare, List<String> dotariExterioare, List<String> dotariInterioare) {
        super("BMW", model, sasiu, culoare, motorizare);
        this.dotariExterioare = dotariExterioare;
        this.doratiInterioare = dotariInterioare;
    }

    public void prezentareBMW() {

        prezentareMasina();
        definirePretmodel();
        pretFinal = pretSrandard + calculdotariInterioare() + calculdotariExterioare();

        System.out.println("pretul satandard este :" + pretSrandard);
        System.out.println("pretul final este :" + pretFinal);

    }

    public void definirePretmodel() {

        switch (getModel()) {
            case "X5":
                pretSrandard = 75000;
                break;
            case "X7":
                pretSrandard = 600000;
                break;
            default:
                System.out.println("Numai avem pe stoc acest model");
        }
    }

    public Integer calculdotariExterioare() {

        Integer pretDotari = 0;
        for (Integer i = 0; i < dotariExterioare.size(); i++) {
            switch (dotariExterioare.get(i)) {
                case "jenti":
                    pretDotari = pretDotari + 500;
                    break;
                case "trapa":
                    pretDotari = pretDotari + 900;
                    break;
                case "faruri":
                    pretDotari = pretDotari + 1200;
                    break;
                case "spoiler":
                    pretDotari = pretDotari + 650;
                    break;
                case "oglinzi":
                    pretDotari = pretDotari + 2000;
                    break;
            }
        }
        return pretDotari;


    }

    public Integer calculdotariInterioare() {

        Integer pretDotari = 0;
        for (Integer i = 0; i < doratiInterioare.size(); i++) {
            switch (doratiInterioare.get(i)) {
                case "incalzire scaune":
                    pretDotari = pretDotari + 500;
                    break;
                case "clima bizonica":
                    pretDotari = pretDotari + 900;
                    break;
                case "GPS":
                    pretDotari = pretDotari + 1200;
                    break;
                case "tetiera cu masaj":
                    pretDotari = pretDotari + 650;
                    break;
                case "display parbriz":
                    pretDotari = pretDotari + 2000;
                    break;
            }
        }
        return pretDotari;

    }

    public Integer getPretSrandard() {
        return pretSrandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public List<String> getDoratiInterioare() {
        return doratiInterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public void setDoratiInterioare(List<String> doratiInterioare) {
        this.doratiInterioare = doratiInterioare;
    }
    public void AngajariFirma(){

        System.out.println("Nu sunt posturi disponibile la Fabrica BMW");
        super.AngajariFirma();


    }
}
