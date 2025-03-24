public class Persona {
    private int id;
    private int pianoDestinazione;
    private int pianoCorrentePersona;

    public Persona(int id, int pianoDestinazione, int pianoCorrentePersona){  
        this.id = id;
        this.pianoDestinazione = pianoDestinazione;
    }

    public void saliSuAscensore(Ascensore ascensore, Persona personaDaAggiungere){
        if(pianoCorrentePersona == ascensore.getPianoCorrente() && ascensore.getStatusPorte() == true){
            ascensore.aggiungiPersona(personaDaAggiungere);
        }
        else{
            System.out.println("Ciao");
        }
    }

    /*public void scendiDaAscensore(Ascensore a){
    
    }*/

    public String toString(){
        String recap = "L'id è: " + this.id + "\n" + "La sua destinazione è: " + this.pianoDestinazione;
        return recap;
    }

    public int getPianoDestinazione() {  
        return pianoDestinazione;
    }

    public void settPianoDestinazione(int Destinazione) {  
        this.pianoDestinazione = Destinazione;
    }

    
}
