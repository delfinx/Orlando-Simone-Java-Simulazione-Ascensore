import java.io.IOError;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// CREATO ASCENSORE
		Persona Isra = new Persona(100, 0, 0);
		Persona Ionela = new Persona(200, 0, 0);
		Persona Matteo = new Persona(300, 0, 0);
		Persona Sergio = new Persona(400, 0, 0);
		
		ArrayList<Persona> listaPersone = new ArrayList<>()(List.of(Isra, Ionela, Matteo, Sergio));
		/*Ascensore ascensore = new Ascensore(0, 8, listaPersone);
		// CREATO PIANO1
		ArrayList<Persona> codaPersone = new ArrayList<>();
		Piano piano1 = new Piano(2, codaPersone);*/
		for(Persona persona: listaPersone){
			int randomDestinazione = destinazionePersonaRandom();
			persona.setPianoDestinazione(destinazioneCasuale);
			System.out.println(persona.id+ " ha destinazione al piano " + persona.getPianoDestinazione);
        }


		}
		listaPersone.add(Marco);
		
		
	}
	public void chiamaAscensore(Ascensore ascensore, Persona persona) {
         if (ascensore.getNumeroPersone() < 8) {
             ascensore.apriPorte();
             persona.saliSuAscensore(ascensore, persona);
             ascensore.chiudiPorte();
         } else {
             System.out.println("L'ascensore è pieno. Attendere che si svuoti.");
         }
     }

	 public String DestinazionePersonaRandom(Persona persona){
		String destinazionePersonaRandom = (int) (Math.random()*8+0);
		return destinazionePersonaRandom;
	 }
}
