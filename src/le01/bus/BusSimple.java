package le01.bus;

public class BusSimple {
    public String hersteller;
    int wechselintervall = 100000;
    int kmGefahren;
    int baujahr;

    public static void test() {

    }

    public static void test(int a) {

    }

    public static void test1(int a) {

    }


    public BusSimple (String hersteller, int wechselintervall,
                      int kmGefahren, int baujahr) {
        this.hersteller=hersteller;
        this.wechselintervall=wechselintervall;
        this.kmGefahren=kmGefahren;
        this.baujahr=baujahr;
    }

    public BusSimple (String hersteller, int baujahr) {
        this.hersteller=hersteller;
        this.kmGefahren=100000;
        this.baujahr=baujahr;
    }

    public BusSimple() {
        this.hersteller="VW";
        this.wechselintervall=100000;
        this.kmGefahren=10000;
        this.baujahr=2020;
    }
    public void oelwechsel() {
        if (kmGefahren >= wechselintervall) {
            System.out.println("Ölwechsel durchgeführt");
            kmGefahren = 0;
        } else {
            System.out.println("Ölwechsel nicht erforderlich");
        }
    }

}