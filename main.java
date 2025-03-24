import java.io.IOError;
import java.util.ArrayList;
import java.util.Scanner;
public class main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//CREATA PRIMA PERSONA
		Persona Marco = new Persona(100,	2, 4);

		/*System.out.println(Marco.toString());

		System.out.println("------------------------");*/

		//CREATO NUOVO ASCENSORE

		ArrayList<Persona> listaPersone = new ArrayList<>();
		Ascensore ascensore = new Ascensore(0, 	8, listaPersone);
		listaPersone.add(Marco);

		System.out.println(ascensore.toString());
		System.out.println("-------");

		//CREATO PIANO1
		Piano piano1 = new Piano(2, listaPersone);		

		/* 
		int destinazioneMarco = Marco.getPianoDestinazione();
		System.out.println("Destinazione di Marco: " + destinazioneMarco);*/
		
		Marco.settPianoDestinazione(0);
		ascensore.apriPorte();
		/* 
		destinazioneMarco = Marco.getPianoDestinazione(); 
		System.out.println("Destinazione di Marco: " + destinazioneMarco);
		System.out.println("------------------------"); */

		System.out.println("Prima di rimuoviPersoneArrivate: " + ascensore.toString());

		ascensore.rimuoviPersoneArrivate();	
		
		System.out.println("Dopo rimuoviPersoneArrivate: " + ascensore.toString());

		System.out.println("------------------------");
		System.out.println("-------");


		//CREATA NUOVA PERSONA

		Persona Ionela = new Persona(200, 3,9);
		//aggiunta nuova persona per controllare til toString in piano - cioè coda persone che richiede l'aggiunta di una persona in coda

		//VERIFICARE LE PERSONE IN CODA
		listaPersone.add(Ionela);

		ascensore.aggiungiPersona(Ionela);
		System.out.println(piano1.toString());

		System.out.println("------------------------");
		
		Ionela.saliSuAscensore(ascensore, Ionela);
		System.out.println(piano1.toString());


	}
}
