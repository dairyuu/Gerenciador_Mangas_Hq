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
public class Comparador_Volumes_Hq implements Comparator<Fasciculo_HQ>{

    @Override
    public int compare(Fasciculo_HQ t, Fasciculo_HQ t1) {
        if (t.getEdicao()< t1.getEdicao()) return -1;  
        else if (t.getEdicao()> t1.getEdicao()) return +1;  
        else return 0;
    }
    
    
}
