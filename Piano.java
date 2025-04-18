import java.util.ArrayList;

public class Piano {
    private int numeroPiano;
    private ArrayList<Persona> codaPersone = new ArrayList<>();

    public Piano(int numeroPiano, ArrayList<Persona> codaPersone){
        this.numeroPiano = numeroPiano;
        this.codaPersone = codaPersone;
    }

    public void aggiungiPersonaCoda(Persona p){
        codaPersone.add(p);
    }

    public void rimuoviPersonaCoda(Persona p){
        codaPersone.remove(p);
    }

    @Override
    public String toString() {
    String recap = "";
    for (Persona persona : codaPersone) {
        recap = "Numero piano: " +  numeroPiano + " Destinazione: " +  persona.getPianoDestinazione() + "\n"; // Concatenazione corretta
    }
    return recap;
}

    public int getNumeroPiano(){
        return numeroPiano;
    }

    public int getCodaPersone(){
        int recap = 0;
        for(Persona persona: codaPersone){
            recap++;
        }
        return recap;
    }

   
}
