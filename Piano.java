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
            recap = "Numero piano: " + numeroPiano + "\n" + "Persona in coda: " + codaPersone.size(); 
        }
        return recap;
    }

    public int getNumeroPiano(){
        return numeroPiano;
    }
}
