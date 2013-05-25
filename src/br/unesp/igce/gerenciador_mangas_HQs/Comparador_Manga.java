/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.util.Comparator;

    
/**
 *
 * @author Sanchez
 */
public class Comparador_Manga implements Comparator<Fasciculo_Manga>{

    @Override
    public int compare(Fasciculo_Manga t, Fasciculo_Manga t1) {
        if (t.getVolume() < t1.getVolume()) return -1;  
        else if (t.getVolume() > t1.getVolume()) return +1;  
        else return 0;
    }
}  
