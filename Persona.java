public class Persona {
    private int id;
    private int pianoDestinazione;
    private int pianoCorrentePersona;

    public Persona(int id, int pianoDestinazione, int pianoCorrentePersona){  
        this.id = id;
        this.pianoDestinazione = pianoDestinazione;
        this.pianoCorrentePersona = pianoCorrentePersona;
    }

    public void saliSuAscensore(Ascensore ascensore, Persona personaDaAggiungere){
        if(pianoCorrentePersona == ascensore.getPianoCorrente() && ascensore.getStatusPorte() == true){
            ascensore.aggiungiPersona(personaDaAggiungere);
        }
    }

    public void scendiDaAscensore(Ascensore ascensore, Persona personaDaRimuovere){
        if(pianoCorrentePersona == ascensore.getPianoCorrente() && ascensore.getStatusPorte() == true){
            ascensore.rimuoviPersoneArrivate(personaDaRimuovere);
        }
    }

    public String toString(){
        String recap = "L'id è: " + this.id + "\n" + "La sua destinazione è: " + this.pianoDestinazione;
        return recap;
    }

    public int getPianoDestinazione() {  
        return pianoDestinazione;
    }

    public void setPianoDestinazione(int Destinazione) {  
        this.pianoDestinazione = Destinazione;
    }

    public int getId(){
        return id;
    }

    public int getPianoCorrente(){
        return pianoCorrentePersona;
    }
    
}
