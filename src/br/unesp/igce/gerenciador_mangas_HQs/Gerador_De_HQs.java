/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.util.List;
import java.util.Random;

/**
 *
 * @author aluno
 */
public class Gerador_De_HQs {
    
             static private String[] nomes_HQs = {
      "Espetacular Homem-Aranha",
      "Demolidor",
      "X-Men",
      "A teia do aranha",
      "A noite mais densa",
      "O dia mais claro",
      "Wolverine",
      "Captão america",
      "Homem de ferro",
      "Hulk"
    };
             
    public static void Gerador(List<HQ> HQ_Lista){
        
        Random g = new Random();
        
        for (int j = 0; j < 5; j++) 
       {
            int numero = g.nextInt(nomes_HQs.length);
            String nome = nomes_HQs[numero];
            HQ Novo_HQ = new HQ(nome);
            for (int i = 0; i < 1; i++) 
            {
                Fasciculo_HQ HQ = new Fasciculo_HQ();
                HQ.setEdicao(g.nextInt(200));
                HQ.setIdioma(g.nextInt(4));
                Novo_HQ.criarVolumes(HQ);
           }
           HQ_Lista.add(Novo_HQ);
        }
    }
    
}
