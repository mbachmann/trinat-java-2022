package le01;

public class RefTyp {
    int x, y;
    static String bla;
    static void ausgabe(RefTyp ref) {
        ref.x = 25; ref.y = 25;
        System.out.println("Methode ausgabe: x = " + ref.x + " y = " + ref.y);
        bla = "ok";
    }
    public static void main(String[] args) {
        RefTyp ref = new RefTyp();
        ref.x = 15; ref.y = 15;
        ausgabe(ref);
        System.out.println("Methode main: x = " + ref.x + " y = " + ref.y);
    }
}