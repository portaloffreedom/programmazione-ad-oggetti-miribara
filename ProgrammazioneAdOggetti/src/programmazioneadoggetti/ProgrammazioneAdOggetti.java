/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programmazioneadoggetti;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Main
 * @author miriam
 */
public class ProgrammazioneAdOggetti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ProgrammazioneAdOggetti.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Impossibile impostare il look and feel");
        }
        
        FinestraPrincipale finestra = new FinestraPrincipale();
    }
}
