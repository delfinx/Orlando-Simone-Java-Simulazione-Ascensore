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

		Marco.settPianoDestinazione(1);

		destinazioneMarco = Marco.getPianoDestinazione(); 
		System.out.println("Destinazione di Marco: " + destinazioneMarco);

		ascensore.rimuoviPersoneArrivate();	//funziona nn worka
		System.out.println(ascensore.toString()); //devo far si che si toglie la persona all'interno

		System.out.println("------------------------");

		Piano piano1 = new Piano(1, listaPersone);
		System.out.println(piano1.toString());
	
	}
}
