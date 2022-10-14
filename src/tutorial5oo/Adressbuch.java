package tutorial5oo;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Vector;

/**
*
* @author Cornelia Oberholzer, WI2a
* 
* Adressbuch
* 
*
*/

public class Adressbuch {

	public static void main(String[] args)
	{
		Person[] adressbuch = new Person[30];
		int count = 0;


		File file = new File("src/tutorial5oo/personen.txt");
		int length = (int)file.length() ;
		try (InputStreamReader reader = new InputStreamReader(
				new FileInputStream(file), StandardCharsets.UTF_8)) {
			char[] buffer = new char[length] ;
			int numberOfCharacters = reader.read(buffer) ;
			String text = new String(buffer, 0,
					numberOfCharacters);
			System.out.println("fileSize=" + length +
					", numberOfCharacters=" + numberOfCharacters +
					"\n" + text);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Collection<File> vector = new Vector<File>();
		vector.add(file);

		try
		{
			String fileName = "src/tutorial5oo/personen.txt";


			FileReader f = new FileReader(fileName, StandardCharsets.UTF_8);

			char[] c = new char[(int)length];

			f.read(c);
			String s = new String(c);
			String [] result = s.split(";|\n|\\.");
			
			for (int i = 0; i < result.length-1; i=i+9)
			{
				GregorianCalendar tmpDate = new GregorianCalendar(Integer.parseInt(result[i+8]), 
																  Integer.parseInt(result[i+7])-1,
																  Integer.parseInt(result[i+6]));
				
				Person tmpPers = new Person(result[i], result[i+1], tmpDate, result[i+2], result[i+3], result[i+5], Integer.parseInt(result[i+4]));
				adressbuch[count++] = tmpPers;
			}
		}
		catch (IOException e)
		{
			System.err.println("Fehler beim Einlesen der Datei");
			System.err.println(e.getMessage());
		}
		
		
		/**
			GregorianCalendar gc;
			
			gc = new GregorianCalendar(1975, Calendar.NOVEMBER, 3);
			Person anna = new Person("Allan", "Anna", gc, "Anna-Str", "1a", "Z�rich", 8000);
	
			gc = new GregorianCalendar(1985, Calendar.JULY, 7);
			Person bettina = new Person("Spadin", "Bettina", gc, "Bettina-Str", "2b", "Z�rich", 8000);
	
			gc = new GregorianCalendar(1976, Calendar.DECEMBER, 12);
			Person cynthia = new Person("Baur", "Cynthia", gc, "Cynthia-Str", "3c", "Z�rich", 8000);
	
			gc = new GregorianCalendar(1984, Calendar.MARCH, 10);
			Person patrick = new Person("Som", "Patrick", gc, "P�de-Str", "4d", "Z�rich", 8000);
	
			gc = new GregorianCalendar(1985, Calendar.AUGUST, 11);
			Person manuel = new Person("M�ller", "Manuel", gc, "Manu-Str", "5e", "Z�rich", 8000);
	
			gc = new GregorianCalendar(1981, Calendar.JULY, 8);
			Person seda = new Person("Demirtas", "Seda", gc, "Seda-Str", "6f", "Z�rich", 8000);
	
			adressbuch[count++] = anna;
			adressbuch[count++] = bettina;
			adressbuch[count++] = cynthia;
			adressbuch[count++] = patrick;
			adressbuch[count++] = manuel;
			adressbuch[count++] = seda;
		*/
		
		for (int i = 0; i < count; i++)
		{
			adressbuch[i].print();
		}
	}
	
	
}
