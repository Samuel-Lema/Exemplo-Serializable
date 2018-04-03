package exemploserializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Metodos {

    public void escribeFichero(String ficheiro) throws IOException {
        
        ObjectOutputStream fich = null;
        
        try {
            fich = new ObjectOutputStream(new FileOutputStream(ficheiro));
            
            for (int i = 0; i < 2; i++) {
                
                Personaje p = new Personaje(cadea("Nome: "), enteiro("Vida: "), enteiro("Daño: "));
                fich.writeObject(p);
            }
           
            fich.close();
            
        } catch (IOException e) {
            
            if(fich != null) {
                
                fich.close();
            }    
        }
    }
    
    public void engadeFicheiro(String ficheiro) throws IOException {
        
        MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;
        
        try {
            esc = new MeuObjectOutputStream(new FileOutputStream(ficheiro,true));            
           
            for (int i = 0; i <2; i++) {
                
                Personaje p = new Personaje(cadea("Nome: "), enteiro("Vida: "), enteiro("Daño: "));
                esc.writeObject(p);
            }
           
        } catch (IOException e) {
            
            if(esc != null) {
                
                esc.close();
            }
        }
    }   
    
    public String cadea(String s){
        return JOptionPane.showInputDialog(s);
    }
    
    public int enteiro(String s){
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }
    
    public void lerFicheiro(String ficheiro){
        
        ObjectInputStream ler = null;
        Personaje aux = null;
        
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
       
            aux= (Personaje) ler.readObject();
            
            while(aux!= null) {
                 System.out.println(aux.toString());
                 aux=(Personaje) ler.readObject();
            }
        } catch (ClassNotFoundException ex) {
            
              System.out.println("erro 1" +ex.getMessage());      
                    
           } catch (IOException ex) {
            System.out.println("erro 2" +ex.getMessage());
        } finally{
            
            if(ler != null)
                try {
                    ler.close();
            } catch (IOException ex) {
                    System.out.println("erro de peche "+ex.getMessage());
            }
        }
    }
}
