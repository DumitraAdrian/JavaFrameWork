package OOPconcepte;

import java.util.List;

public class FabricaAudi extends FabricaMasina {

    private Integer pretSrandard;
    private Integer pretFinal;
    private List<String> dotariExterioare;
    public FabricaAudi( String model, String sasiu, String culoare,
                       String motorizare,List<String>dotariExterioare) {
        super("Audi", model, sasiu, culoare, motorizare);
        this.dotariExterioare=dotariExterioare;
    }
    public void prezentareAudi(){

        prezentareMasina();
        definirePretmodel();
        calculPretfinal();
        if(dotariExterioare==null) {
            System.out.println("pretul satandard este :" +pretSrandard);
        }
        else {
            System.out.println("pretul satandard este :" +pretSrandard);
            System.out.println("pretul final este :" +pretFinal);
        }

        System.out.println("dotarile exterioare sunt :" +dotariExterioare);
    }
    public void definirePretmodel(){

        switch (getModel()){
            case "A5":
                pretSrandard=40000;
                break;
            case "A7":
                pretSrandard=80000;
                break;
            default:
                System.out.println("Numai avem pe stoc acest model");
        }
    }
    public  void calculPretfinal(){

         Integer pretDotari=0;
        for(Integer i=0;i<dotariExterioare.size();i++){
            switch (dotariExterioare.get(i)){
                case "jenti":
                    pretDotari=pretDotari+500;
                    break;
                case "trapa":
                    pretDotari=pretDotari+900;
                    break;
                case "faruri":
                    pretDotari=pretDotari+1200;
                    break;
                case "spoiler":
                    pretDotari=pretDotari+650;
                    break;
                case "oglinzi":
                    pretDotari=pretDotari+2000;
                    break;
            }
        }
        pretFinal=pretSrandard+pretDotari;

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

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }
    //Suprascriem metoda Angajari din parinte- propria implementare a fabrici cu acelasi nume
    public void AngajariFirma(){
        System.out.println("Fabrica Audi are 4 locuri disponibile");

    }
    // Polimorfism static
    public void  AfisareRezultate(){
        System.out.println("Fabrica a produs 15 masini");
    }
    public void  AfisareRezultate(String marca){
        System.out.println("Fabrica a produs 10 masini cu marca x");
    }
    public void  AfisareRezultate(String marca,Integer an){
        System.out.println("Fabrica a produs 10 masini cu marca x din anul 2022");
    }
    public void  AfisareRezultate(Integer an){
        System.out.println("Fabrica a produs 10 masini din anul 2022");
    }

}
