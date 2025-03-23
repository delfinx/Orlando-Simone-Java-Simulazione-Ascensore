import java.util.ArrayList;

public class Ascensore {
    private int pianoCorrente;
    private int capienzaMassima;
    private ArrayList<Persona> personeDentro = new ArrayList<>();
    private boolean porteAperte;

    public Ascensore(int pianoCorrente, int capienzaMassima, ArrayList<Persona> personeDentro){
        this.pianoCorrente = pianoCorrente;
        this.capienzaMassima = capienzaMassima; //facciamo che sia 8
        this.personeDentro = personeDentro;
    }

    public void apriPorte(){
        porteAperte = true;
    }

    public void chiudiPorte(){
        porteAperte = false;
    }

    public void aggiungiPersona(Persona p){
        if(capienzaMassima < 8 && porteAperte == true){
            personeDentro.add(p);
        }
    }

    public void rimuoviPersoneArrivate(){
        for (int i = 0; i < personeDentro.size(); i++) {
            Persona persona = personeDentro.get(i);
            
            if (persona.getPianoDestinazione() == pianoCorrente && porteAperte == true) {
                personeDentro.remove(i);
                i--; 
            }
        }
    }

    @Override
    public String toString(){
        String recap = "";
        for(Persona persona: personeDentro){
            recap += pianoCorrente + "\n" + capienzaMassima + "\n" + personeDentro.size(); //dopo rimuovepersone deve rimuovere la persona ma nn lo fa
        }
        return recap;
    }

    
}
