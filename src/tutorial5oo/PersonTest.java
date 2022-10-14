package tutorial5oo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PersonTest {

    public static void main(String[] args) {

        String name = "Muster";
        String vorname = "Felix";
        GregorianCalendar geburtsdatum = new GregorianCalendar(2000, Calendar.DECEMBER, 11);
        String strasse = "Bahnhofstrasse 11";
        String wohnort = "Lörrach";
        String hausnummer = "1";
        int plz = 74355;

        Person person = new Person(name, vorname, geburtsdatum, strasse, wohnort, hausnummer, plz);
        System.out.println(person.getAlter());
        person.print();

        System.err.println("Error");

    }
}
