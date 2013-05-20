/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import Geradores.Gerador_De_Manga;
import Geradores.Gerador_De_HQs;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Principal {

           
    
    public static void main(String[] args) {
        
        List<Manga> Manga_Lista = new ArrayList<Manga>();
        List<HQ> HQ_Lista = new ArrayList<HQ>();
        SavePoint save = new SavePoint();
        
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
        
        String pesquisa =  JOptionPane.showInputDialog("Qual nome do manga para se pesquisar:");
        //Rotina para pesquisa
        int i = 0;
        boolean have = false;
        while((i < Manga_Lista.size()) && (have == false)){
            Manga manga_recuperado = Manga_Lista.get(i);
            if(manga_recuperado.getNome().equals(pesquisa)){
                have = true;
                break;
            }
            i++;
        }
        //fim rotina para pesquisa
        if(have){
            Manga Manga_recuperado = Manga_Lista.get(i);
            Manga_recuperado.escrever();
        }
        
        String pesquisa2 =  JOptionPane.showInputDialog("Qual o nome do Hq a pesquisar:");
        //Rotina para pesquisa
        int i2 = 0;
        boolean have2 = false;
        while((i2 < HQ_Lista.size()) && (have2 == false)){
            HQ HQ_recuperado = HQ_Lista.get(i2);
            if(HQ_recuperado.getNome().equals(pesquisa2)){
                have2 = true;
                break;
            }
            i2++;
        }
        //fim rotina para pesquisa
        if(have2){
            HQ HQ_recuperado = HQ_Lista.get(i2);
            HQ_recuperado.escrever();
        }
        
        save.SaveManga(Manga_Lista);
        save.SaveHQ(HQ_Lista);
        
        List<Manga> Manga_Lista2;
        List<HQ> HQ_Lista2;
        
        HQ_Lista2 = save.ReadHQ();
        Manga_Lista2 = save.ReadManga();
        
        for (int j = 0; j < Manga_Lista2.size(); j++) 
        {
            Manga Manga_recuperado = Manga_Lista2.get(j);
            System.out.println(Manga_recuperado.getNome());
            for (i = 0; i < Manga_recuperado.getFasciculos().size(); i++) 
            {
                System.out.println(Manga_recuperado.getFasciculos().get(i).getIdioma());
                System.out.println(Manga_recuperado.getFasciculos().get(i).getTipo());
                System.out.println(Manga_recuperado.getFasciculos().get(i).getVolume());
                System.out.println("\n");
            }
        }
        
        for (int j = 0; j < HQ_Lista2.size(); j++) 
        {
            HQ HQ_recuperado = HQ_Lista2.get(j);
            System.out.println(HQ_recuperado.getNome());
            for (i = 0; i <HQ_recuperado.getFasciculos().size(); i++) 
            {
                System.out.println(HQ_recuperado.getFasciculos().get(i).getEdicao());
                System.out.println(HQ_recuperado.getFasciculos().get(i).getIdioma());
                System.out.println("\n");
            }
        }
        
    }
}
