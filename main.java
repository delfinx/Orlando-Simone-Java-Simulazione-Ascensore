import java.util.ArrayList;
import java.util.Scanner;
public class main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Persona Marco = new Persona(100,	2);

		System.out.println(Marco.toString());

		ArrayList<Persona> listaPersone = new ArrayList<>();
		Ascensore ascensore = new Ascensore(0, 	8, listaPersone);

		listaPersone.add(Marco);
		System.out.println(ascensore.toString());

		int destinazioneMarco = Marco.getPianoDestinazione();
		System.out.println("Destinazione: " + destinazioneMarco);

		ascensore.rimuoviPersoneArrivate();
		System.out.println(ascensore.toString()); //devo far si che si toglie la persona all'interno


	}
}
