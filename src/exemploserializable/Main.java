package exemploserializable;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        Metodos metodo = new Metodos();
        
        try {         
            metodo.escribeFichero("personaje.dat");
            metodo.engadeFicheiro("personaje.dat");
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        metodo.lerFicheiro("personaje.dat");
    }
    
}
