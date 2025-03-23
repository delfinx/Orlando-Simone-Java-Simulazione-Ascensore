import java.util.ArrayList;
import java.util.Scanner;
public class main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Persona Marco = new Persona(100,	2);

		System.out.println(Marco.toString());

		System.out.println("------------------------");

		ArrayList<Persona> listaPersone = new ArrayList<>();
		Ascensore ascensore = new Ascensore(0, 	8, listaPersone);
		listaPersone.add(Marco);
		System.out.println(ascensore.toString());

		int destinazioneMarco = Marco.getPianoDestinazione();
		System.out.println("Destinazione di Marco: " + destinazioneMarco);

		Marco.settPianoDestinazione(0);
		ascensore.apriPorte();

		destinazioneMarco = Marco.getPianoDestinazione(); 
		System.out.println("Destinazione di Marco: " + destinazioneMarco);

		ascensore.rimuoviPersoneArrivate();	
		System.out.println(ascensore.toString()); 

		System.out.println("------------------------");

		Piano piano1 = new Piano(2, listaPersone);		
		//aggiunta nuova persona per controllare til toString in piano - cioè coda persone che richiede l'aggiunta di una persona in coda
		Persona Ionela = new Persona(200, 3);

		listaPersone.add(Ionela);

		ascensore.aggiungiPersona(Ionela);
		System.out.println(piano1.toString());

	}
}
