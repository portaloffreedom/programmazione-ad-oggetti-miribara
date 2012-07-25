/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programmazioneadoggetti;

/**
 *
 * @author miriam
 */
abstract public class Casella {
    
    abstract public String getFormula();
    
    abstract public String getRisultato();
    
    static public Casella NewCasella(String testo, TabellaDati tabella){
        try {
            Casella cas = new CasellaFormula(testo,tabella);
            System.out.println("Convertita in casella formula");
            return cas;
        } catch (ConversioneNonRiuscitaException ex) {
            System.out.println("Convertita in casella di testo");
            return new CasellaTesto(testo);
        }
    }

}