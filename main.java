import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creazione delle persone
        Persona Isra = new Persona(100, 0, 0);
        Persona Ionela = new Persona(200, 0, 0);
        Persona Matteo = new Persona(300, 0, 0);
        Persona Boss = new Persona(400, 0, 0);

        ArrayList<Persona> listaPersone = new ArrayList<>();
        listaPersone.add(Isra);
        listaPersone.add(Ionela);
        listaPersone.add(Matteo);
        listaPersone.add(Boss);

        Ascensore ascensore = new Ascensore(0, 8, new ArrayList<>());

        ArrayList<Persona> codaPersone = new ArrayList<>();
        Piano piano1 = new Piano(2, codaPersone);

        // Assegnazione random della destinazione per ogni persona
        for (Persona persona : listaPersone) {
            int randomDestinazione;
            do {
                randomDestinazione = (int) (Math.random() * 8);
            } while (randomDestinazione == persona.getPianoCorrente());

            persona.setPianoDestinazione(randomDestinazione);
            System.out.println(persona.getId() + " ha destinazione al piano " + persona.getPianoDestinazione());
        }

        

        // Eseguire 12 giri di simulazione
        for (int i = 0; i < 12; i++) {
            System.out.println("\n--- Giro " + (i + 1) + " ---");

            // Controllo dello stato delle persone

            // Decidere la direzione dell'ascensore
            ascensore.decidiDirezione(piano1);
            chiamaAscensore(ascensore, piano1, codaPersone, listaPersone);
            System.out.println(ascensore.toString());
       
        }

        
    }

    public static void chiamaAscensore(Ascensore ascensore, Piano piano1, ArrayList<Persona> codaPersone, ArrayList<Persona> listaPersone) {
        for(int i = 0; i < 10; i++){
            for (Persona persona : listaPersone) { 
                if()
            }
        }
    }
}