import java.io.IOError;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// CREATA PRIMA PERSONA
		Persona Marco = new Persona(100, 2, 4);
		// CREATO ASCENSORE
		ArrayList<Persona> listaPersone = new ArrayList<>();
		Ascensore ascensore = new Ascensore(0, 8, listaPersone);
		// CREATO PIANO1
		ArrayList<Persona> codaPersone = new ArrayList<>();
		Piano piano1 = new Piano(2, codaPersone);
		
		listaPersone.add(Marco);
		
		
	}
}
