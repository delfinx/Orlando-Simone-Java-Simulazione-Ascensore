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
		Ascensore ascensore = new Ascensore(0, 8);
		// CREATO PIANO1
		ArrayList<Persona> codaPersone = new ArrayList<>();
		Piano piano1 = new Piano(2, codaPersone);
		ascensore.apriPorte();
		ascensore.aggiungiPersona(Marco);
		/*
		 * System.out.println(Marco.toString());
		 * 
		 * System.out.println("------------------------");
		 */

		// CREATO NUOVO ASCENSORE

		System.out.println(ascensore.toString());
		System.out.println("-------");

		/*
		 * int destinazioneMarco = Marco.getPianoDestinazione();
		 * System.out.println("Destinazione di Marco: " + destinazioneMarco);
		 */

		Marco.settPianoDestinazione(0);
		ascensore.apriPorte();
		/*
		 * destinazioneMarco = Marco.getPianoDestinazione();
		 * System.out.println("Destinazione di Marco: " + destinazioneMarco);
		 * System.out.println("------------------------");
		 */

		System.out.println("Prima di rimuoviPersoneArrivate: " + ascensore.toString());

		ascensore.rimuoviPersoneArrivate();

		System.out.println("Dopo rimuoviPersoneArrivate: " + ascensore.toString()); // non stampa perchè togliendo la
																					// persona dentro l'ascensore resta
																					// vuoto logicamente

		System.out.println("------------------------");
		System.out.println("-------");

		// CREATA NUOVA PERSONA

		Persona Ionela = new Persona(200, 3, 2);
		// aggiunta nuova persona per controllare til toString in piano - cioè coda
		// persone che richiede l'aggiunta di una persona in coda

		// VERIFICARE LE PERSONE IN CODA
		System.out.println(piano1.toString() + " - perchè non cè nessuno in coda");
		codaPersone.add(Ionela);

		System.out.println("------------------------");

		System.out.println(ascensore.toString() + " - ");

		Ionela.saliSuAscensore(ascensore, Ionela);
		System.out.println(piano1.toString());
		System.out.println(ascensore.toString());

	}
}
