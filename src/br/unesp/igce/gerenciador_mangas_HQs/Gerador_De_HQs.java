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
             
    public static void Gerador(List<HQ> HQ_Lista ) {
        Random rand = new Random();
        
        for (int i = 0; i < 5; i++) {
            int escolhido = rand.nextInt(nomes_HQs.length);
            HQ Novo_Hq = new HQ(nomes_HQs[escolhido]);
            HQ_Lista.add(Novo_Hq);
            for (int j = 0; j < 3; j++) {
                Fasciculo_HQ Fasciculo = new Fasciculo_HQ();
                Fasciculo.setEdicao(rand.nextInt(100));
                Fasciculo.setIdioma(rand.nextInt(4));
                Novo_Hq.criarVolumes(Fasciculo);
            }
            
        }
    }

    
}
