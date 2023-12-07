package OOPconcepte;

public class FabricaMasina {

    // OOP-programare orientate pe obiect
    // 4 Principii- mostenire,incapsulare,abstractizare,polimorfism.
    // Mostenire- conceptul prin care clasa parinte este mostenita de clasa copil.
    //in java o clasa poate sa mostenesaca doar o singura clasa.
    //clasa copil trebuie sa apeleze constructorul din clasa parinte.
    //Copilul are vizibilitate asupra metodelor/variabilelor din parinte daca sunt publice/proctected
    // ca sa apelam constructorulparinte in clasa copil vom folosi super

    //polimorfism=conceptul prin care o metoda poate suferi modificari la nivel  de continul sau structura
    //polimorfismul este de doua feluri: dinamic(override) sau static(overload)
    //Plolimorfismul dinamic= intr-o ierarhie de clase extinse prin mostenire o mostenire poate avea implementari diferite
    //Polimorfismul static=mai multe pot avea aceleasi nume cu conditia  sa se diferentieze prin nr sau tip de parametrii
    //Nu se poate aplica polimorfismul la metodele :" return" ci la cele cu "void".(nu stie complilatorul Java sa apeleze)

    //polimorfism dinamic=

    // Access control :public,private,proctected,default.
    //public=ofera vizibilitate pentru oricine si oriunde (in tot proiectul)
    //private= ofera vizibilitate doar in interiorul clasei




    private String marca;
    private  String model;
    private   String sasiu;
    private String culoare;
    private String motorizare;

    public FabricaMasina(String marca, String model, String sasiu, String culoare, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.sasiu = sasiu;
        this.culoare = culoare;
        this.motorizare = motorizare;
    }

    public void prezentareMasina(){

        System.out.println("marca masini este ;" +marca);
        System.out.println("modelul masini este : " +model);
        System.out.println("sasiul masini este :" +sasiu);
        System.out.println("culoarea masini este : " +culoare);
        System.out.println("motorizare masini este :" +motorizare);


    }
    // Polimorfism dinamic.
    public  void AngajariFirma(){

        System.out.println("Fabrica mama nu mai face angajari");
    }

    // ca sa accesam valoarea unei variabile cu private ne folosim de  conceptul GET
    //ca sa modificam valoarea unei variabile private cu private ne folosim de conceptul SET


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(String motorizare) {
        this.motorizare = motorizare;
    }
}
