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
        for (Persona persona : listaPersone) { 
            // Se la persona non è al piano corrente dell'ascensore
            if (persona.getPianoCorrente() != ascensore.getPianoCorrente()) {
                piano1.aggiungiPersonaCoda(persona);
                System.out.println("Persona ID: " + persona.getId() + " aggiunta alla coda al piano " + persona.getPianoCorrente());
            }
            else {
                if (ascensore.getNumeroPersone() < 8) { // Se c'è spazio nell'ascensore
                    ascensore.apriPorte();
                    persona.saliSuAscensore(ascensore, persona); // La persona sale sull'ascensore
                    System.out.println("Persona salita sull'ascensore: " + persona.getId());
                    piano1.rimuoviPersonaCoda(persona); // Rimuovi la persona dalla coda del piano
                    ascensore.chiudiPorte();
    
                    // Se ci sono meno di 4 persone, l'ascensore si muove immediatamente verso la destinazione della persona
                    if (ascensore.getNumeroPersone() < 4) {
                        // Spostamento dell'ascensore fino al piano di destinazione della persona
                        while (ascensore.getPianoCorrente() < persona.getPianoDestinazione()) {
                            ascensore.salita();
                            ascensore.apriPorte();
                            if (persona.getPianoDestinazione() == ascensore.getPianoCorrente()) {
                                persona.scendiDaAscensore(ascensore, persona);
                            }
                        }
                        while (ascensore.getPianoCorrente() > persona.getPianoDestinazione()) {
                            ascensore.discesa();
                        }
                    }
                } else {
                    // Se l'ascensore è pieno, la persona rimane in coda
                    System.out.println("L'ascensore è pieno, persona " + persona.getId() + " aspetta in coda.");
                    codaPersone.add(persona);
                }
            }
        }
    }

}