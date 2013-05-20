/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sanchez
 */
public class SavePoint {
    
    public SavePoint(){
        
    }
    
    
    void SaveManga(List<Manga> Manga_Lista){
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/Sanchez/Desktop/facu/java/Gerenciador_Mangas_Hq/Dados/Mangas.m");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Manga_Lista);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void SaveHQ(List<HQ> HQ_Lista){
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/Sanchez/Desktop/facu/java/Gerenciador_Mangas_Hq/Dados/HQ.m");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(HQ_Lista);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    List<Manga> ReadManga(){
        
        List<Manga> Manga_Lista = new ArrayList<Manga>();
        
        try {
            FileInputStream fis = new FileInputStream("C:/Users/Sanchez/Desktop/facu/java/Gerenciador_Mangas_Hq/Dados/Mangas.m");
            ObjectInputStream oos = new ObjectInputStream(fis);
            Manga_Lista = (List<Manga>) oos.readObject();
            return Manga_Lista;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    List<HQ> ReadHQ(){
        
        List<HQ> HQ_Lista = new ArrayList<HQ>();
        
        try {
            FileInputStream fis = new FileInputStream("C:/Users/Sanchez/Desktop/facu/java/Gerenciador_Mangas_Hq/Dados/HQ.m");
            ObjectInputStream oos = new ObjectInputStream(fis);
            HQ_Lista = (List<HQ>) oos.readObject();
            return HQ_Lista;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
