public class Persona {
    private int id;
    private int pianoDestinazione;

    public Persona(int id, int pianoDestinazione){  
        this.id = id;
        this.pianoDestinazione = pianoDestinazione;
    }

    /*public void saliSuAscensore(Ascensore a){
        //io lo farei con extends Ascensore ma non saprei se è corretto estendere l'ascensore
    }

    public void scendiDaAscensore(Ascensore a){
    
    }*/

    public String toString(){
        String recap = this.id + "\n" + this.pianoDestinazione;
        return recap;
    }

    public int getPianoDestinazione() {  // Getter per accedere al valore
        return pianoDestinazione;
    }

    
}
