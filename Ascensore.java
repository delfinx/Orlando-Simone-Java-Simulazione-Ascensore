import java.util.ArrayList;

public class Ascensore {
    private int pianoCorrente;
    private int capienzaMassima;
    private ArrayList<Persona> personeDentro = new ArrayList<>();
    private boolean porteAperte;

    public Ascensore(int pianoCorrente, int capienzaMassima, ArrayList<Persona> personaDentro){ //però se creo una persona nuova ma le crea in automatico nelle persone dentro
        this.pianoCorrente = pianoCorrente;
        this.capienzaMassima = capienzaMassima; //facciamo che sia 8
        this.personeDentro = personaDentro;
            }

    public void apriPorte(){
        porteAperte = true;
    }

    public void chiudiPorte(){
        porteAperte = false;
    }

    public boolean getStatusPorte(){
        return porteAperte;
    }

    public void aggiungiPersona(Persona p){
        if(personeDentro.size() < capienzaMassima && getStatusPorte() == true){
            personeDentro.add(p);
        }
    }

    public void rimuoviPersoneArrivate(Persona p){
        for (int i = 0; i < personeDentro.size(); i++) {
            p = personeDentro.get(i);
            
            if (p.getPianoDestinazione() == pianoCorrente && porteAperte == true) {
                personeDentro.remove(i);
                i--; 
            }
        }
    }

    public void salita(){
        if(pianoCorrente < 8){
            pianoCorrente++;
        }
        else{
            System.out.println("Piano massimo raggiunto");
        }
    }

    public void discesa(){
        if(pianoCorrente > 0){
            pianoCorrente--;
        }
        else{
            System.out.println("Piano terra raggiunto");
        }
        
    }

    public int getNumeroPersone() {
        return personeDentro.size();
    }

    @Override
    public String toString(){
        String recap = "";
        for(Persona persona: personeDentro){
            recap = "Piano corrente: " + pianoCorrente + "\n" + "Capienza massima: " + capienzaMassima + "\n" + "Persone dentro: " + personeDentro.size(); //dopo rimuovepersone deve rimuovere la persona ma nn lo fa
        }
        return recap;
    }

    public int getPianoCorrente(){
        return pianoCorrente;
    }

    public void decidiDirezione(Piano piano){
        if(piano.getCodaPersone() >= 3 && getNumeroPersone() <= 3){
            pianoCorrente = 8;
        }
        else{
            pianoCorrente = 0;
        }
    }
    
}
