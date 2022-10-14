package tutorial5oo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
*
* @author Cornelia Oberholzer, WI2a
* 
* Feinstaubbelastung
* 
* Eine Textdatei mit Messwerten zur Feinstaubbelastung von verschiedenen Orten in ganz Deutschland
*^aus dem Jahre 2003 soll eingelesen werden.
* Eine Zeile in der Datei besteht aus 8 Werten, die durch ";" getrennt sind.
* Zuerst die ID der Messstation, dann der Name, der Emissionsquelltyp, der Umgebungstyp, 
* der Jahresmittelwert, der maximale Tageswert, die Anzahl Tage mit mehr als 50 xg/m3 und 
* schliesslich die Anzahl Tage mit mehr als 60 xg/m3.
* 
* Aufgabe
* Schreiben Sie ein Programm, welches eine gegebene Textdatei einlesen kann, die Werte speichern kann, 
* den Durschnitt aller Jahresmittelwerte berechnet sowie alle Daten mit einem Jahresmittelwert über dem Grenzwert von 40 xx/m3 auf die Konsole schreibt. [Anzeigen...]
* 
* Es soll auch möglich sein, einen beliebigen Datensatz vollständig auszudrucken. [Anzeigen...] Hinweis: Die Abkürzung 'x' für Mikro wird nicht korrekt angezeigt. Ein 'x' kann in Java mit dem Code "\u03BC" generiert werden. 
* Die einzulesende Textdatei erhalten sie hier: [PM10_2003.txt...] (Rechtsklick um auf der Festplatte zu speichern). 
* 
* Hinweise
* Da Sie zu Beginn nicht wissen, wieviele Einträge die Datei hat, können Sie einzelne Messstationen in einem Vector statt einem Array speichern. 
*/

public class Feinstaubbelastung {

	public static void main (String[] args)
    {
        Vector<Messstation> vFeinstaubDaten = new Vector<>();
        String[] result = null;
        int i = 0;
        try
        {
            String fileName = "src/tutorial5oo/PM10_2003.txt";
            FileReader f = new FileReader(fileName);
            char[] c = new char[10000000];
            f.read(c);
            String s = new String(c);
            result = s.split(";|\n");
            
            for (i = 0; i < result.length-1; i=i+8)
            {
                Messstation tmpDaten = new Messstation(result[i], result[i+1], result[i+2], result[i+3],
                                                             Integer.parseInt(result[i+4]), Integer.parseInt(result[i+5]),
                                                             Integer.parseInt(result[i+6]), Integer.parseInt(result[i+7]));
                vFeinstaubDaten.add(tmpDaten);
                
            }
            System.out.println("File \"" + fileName + "\" erfolgreich eingelesen.");
            System.out.println(vFeinstaubDaten.size() + " Einträge generiert");
            
            //Ausgabe des formatierten Datensatzes an Stelle 0 im Vector
            //formattedDataPrint(vFeinstaubDaten, 0);
            
            System.out.println("Durchschnitt aller Jahresmittelwerte " + calcJahresMittel(vFeinstaubDaten) + "\n");

            Vector datenUeberWert = getStationenMittelWertHoeher(vFeinstaubDaten, 40);
            System.out.println("Stationen mit Jahresmittel über 40 Mikrogramm pro Kubikmeter");
            System.out.println("*************************************************************");
            System.out.println("Anzahl: " + datenUeberWert.size() + ".\n");
            formattedDataPrint(datenUeberWert);
        }
        catch (IOException e)
        {
            System.err.println("Fehler beim Einlesen der Datei.");
            System.err.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.err.println("Bei der Verarbeitung ist ein Fehler aufgetreten.");
            System.err.println(e.getMessage());
        }
    }
    
    public static double calcJahresMittel(Vector daten)
    {
        double wertTotal = 0;
        
        for (int i = 0; i < daten.size(); i++)
        {
            Messstation tmpDaten = (Messstation) daten.get(i);
            wertTotal += tmpDaten.getJahresMittelWert();
        }
        return wertTotal / daten.size();
    }

    public static Vector getStationenMittelWertHoeher(Vector daten, int wert)
    {
        Vector datenUeberWert = new Vector();
        for (int i = 0; i < daten.size(); i++)
        {
            Messstation tmpDaten = (Messstation) daten.get(i);
            if (tmpDaten.getJahresMittelWert() > wert)
            {
                datenUeberWert.add(tmpDaten);
            }
        }
        return datenUeberWert;
    }
    
    public static void formattedDataPrint(Vector daten)
    {
        for (int i = 0; i < daten.size(); i++)
        {
            Messstation tmpDaten = (Messstation) daten.get(i);
            System.out.println(tmpDaten.getName() + " " + tmpDaten.getUmgebungsTyp() + " " + tmpDaten.getJahresMittelWert());
        }
    }
    
    public static void formattedDataPrint(Vector daten, int vectorPlace)
    {
        Messstation tmpDaten = (Messstation) daten.get(vectorPlace);
        System.out.println(tmpDaten.getId() + " " + tmpDaten.getName());
        System.out.println("Emissionsquelltyp: " + tmpDaten.getEmissionsquellTyp());
        System.out.println("Umgebungstyp: " + tmpDaten.getUmgebungsTyp());
        System.out.println("Jahresmittelwert: " + tmpDaten.getJahresMittelWert() + (char)181 + "g/m3");
        System.out.println("Maximaler Tageswert: " + tmpDaten.getMaxTagesWert() + (char)181 + "g/m3");
        System.out.println("Tage mit Tageswert > 50" + (char)181 + "g/m3: " + tmpDaten.getAnzTageUeber50());
        System.out.println("Tage mit Tageswert > 60" + (char)181 + "g/m3: " + tmpDaten.getAnzTageUeber60());
    }
}