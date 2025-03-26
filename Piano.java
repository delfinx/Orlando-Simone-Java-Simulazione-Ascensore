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

    
    public void chiamaAscensore(Ascensore ascensore, Persona persona) {
        if (ascensore.getNumeroPersone() < 8) {
            ascensore.apriPorte();
            persona.saliSuAscensore(ascensore, persona);
            ascensore.chiudiPorte();
        } else {
            System.out.println("L'ascensore è pieno. Attendere che si svuoti.");
        }
    }

    public int getCodaPersone(){
        int recap = 0;
        for(Persona persona: codaPersone){
            recap++;
        }
        return recap;
    }
}
