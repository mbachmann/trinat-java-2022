package le01;

import le01.bus.BusSimple;

public class BusSimpleTest {
    public static void main(String[] args) {


        int a = 1;
        BusSimple linie4 = new BusSimple("MAN", 30000, 45000, 1989);
        BusSimple meinPrivatBus = new BusSimple("VW", 20000, 0, 1989);
        BusSimple meinPrivatBus2 = new BusSimple("VW", 1989);


        linie4.oelwechsel();
        meinPrivatBus.oelwechsel();

        // Immutable Objects
        Integer a1 = Integer.valueOf(1);
        String s = "Hallo";

        // Array = Reference Type
        String[] arr = {"Hallo", ""};

        changeString(s, a1, linie4, arr);
        System.out.println(s);
        System.out.println(a1);
        System.out.println(linie4.hersteller);
        System.out.println(arr[1]);

        Bus bus = new Bus();
        System.out.println(bus.getWechselintervall());

        bus.setBaujahr(2020);
        bus.setHersteller("VW");
        bus.setKmGefahren(10000);
        bus.setWechselintervall(20000);

        BusSimple bus1 = new BusSimple();
        BusSimple.test();

        bus.oelwechsel();

        BusSimple.test();

        BusSimple simple = getBus();

    }

    static void changeString (String s, Integer a1, BusSimple linie, String[] arr) {
        s = "ok";
        a1 = 999;
        linie.hersteller = "Mercedes";
        arr[1]="Hallo Velo";
    }

    static BusSimple getBus() {
        return new BusSimple();
    }
}