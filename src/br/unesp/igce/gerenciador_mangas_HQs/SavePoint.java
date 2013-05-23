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
            FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"/Dados/Mangas.man");
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
            FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"/Dados/HQ.hq");
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
        
        List<Manga> Manga_Lista;
        
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/Dados/Mangas.man");
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
        
        List<HQ> HQ_Lista;
        
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/Dados/HQ.hq");
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
    
    boolean ExistManga(){
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/Dados/Mangas.man");
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    boolean ExistHQ(){
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/Dados/HQ.hq");
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
}
