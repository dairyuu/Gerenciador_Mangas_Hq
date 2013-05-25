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
public class Comparador_Hq implements Comparator<HQ>{

    @Override
    public int compare(HQ t, HQ t1) {
        return t.getNome().compareToIgnoreCase(t1.getNome());
    }
    
    
}
