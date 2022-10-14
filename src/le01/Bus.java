package le01;

public class Bus {

    private String hersteller;
    private int wechselintervall = 100000;
    private int kmGefahren;
    private int baujahr;

    void oelwechsel() {
        if (kmGefahren >= wechselintervall) {
            System.out.println("Ölwechsel bereits durchgeführt");
            kmGefahren = 0;
        } else {
            System.out.println("Ölwechsel nicht erforderlich");
        }
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getWechselintervall() {
        return wechselintervall;
    }

    public void setWechselintervall(int wechselintervall) {
        this.wechselintervall = wechselintervall;
    }

    public int getKmGefahren() {
        return kmGefahren;
    }

    public void setKmGefahren(int kmGefahren) {
        this.kmGefahren = kmGefahren;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
}
