/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geradores;


import java.util.List;
import java.util.Random;
import br.unesp.igce.gerenciador_mangas_HQs.Fasciculo_HQ;
import br.unesp.igce.gerenciador_mangas_HQs.HQ;


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
      "Hulk",
      "Liga da Justiça",
      "Superman",
      "Batman",
      "Superior Spider Man",
      "Aquaman",
      "Vingadores",
      "Lanterna Verde",
      "Nova",
      "X-Force",
      "Guardioes da Galaxia",
      "Kick-Ass",
      "Quarteto Fantastico",
      "Deadpool",
      "Django Livre",
      "Aranha Escarlate",
      "O espantoso Homem-Aranha"
    };
             
    public static void Gerador(List<HQ> HQ_Lista ) {
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
            int escolhido = rand.nextInt(nomes_HQs.length);
            HQ Novo_Hq = new HQ(nomes_HQs[escolhido]);
            HQ_Lista.add(Novo_Hq);
            for (int j = 0; j < 1; j++) {
                Fasciculo_HQ Fasciculo = new Fasciculo_HQ();
                Fasciculo.setEdicao(rand.nextInt(100));
                Fasciculo.setIdioma(rand.nextInt(4));
                Novo_Hq.criarVolumes(Fasciculo);
            }
            
        }
    }

    
}
