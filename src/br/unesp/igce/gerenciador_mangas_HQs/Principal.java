/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author aluno
 */
public class Principal {

           
    
    public static void main(String[] args) {
        
        List<Manga> Manga_Lista = new ArrayList<Manga>();
        List<HQ> HQ_Lista = new ArrayList<HQ>();
        
        Gerador_De_Manga.Gerador(Manga_Lista);
        
        for (int j = 0; j < Manga_Lista.size(); j++) 
        {
            Manga Manga_recuperado = Manga_Lista.get(j);
            System.out.println(Manga_recuperado.getNome());
            for (int i = 0; i < Manga_recuperado.getFasciculos().size(); i++) 
            {
                System.out.println(Manga_recuperado.getFasciculos().get(i).getIdioma());
                System.out.println(Manga_recuperado.getFasciculos().get(i).getTipo());
                System.out.println(Manga_recuperado.getFasciculos().get(i).getVolume());
                System.out.println("\n");
            }
        }
        
       Gerador_De_HQs.Gerador(HQ_Lista);
        
        for (int j = 0; j < HQ_Lista.size(); j++) 
        {
            HQ HQ_recuperado = HQ_Lista.get(j);
            System.out.println(HQ_recuperado.getNome());
            for (int i = 0; i <HQ_recuperado.getFasciculos().size(); i++) 
            {
                System.out.println(HQ_recuperado.getFasciculos().get(i).getEdicao());
                System.out.println(HQ_recuperado.getFasciculos().get(i).getIdioma());
                System.out.println("\n");
            }
        }
    }
}
