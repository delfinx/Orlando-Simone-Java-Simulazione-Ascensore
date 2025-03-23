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

    /*public Persona rimuoviPersonaCoda(){

    }*/

    @Override
    public String toString(){
        String recap = "";
        for(Persona persona: codaPersone){
            recap += persona.toString() + " persona in coda "; //sempre il problema per capire come stampare il contenuto dell'arreylist
        }
        return recap;
    }
}
