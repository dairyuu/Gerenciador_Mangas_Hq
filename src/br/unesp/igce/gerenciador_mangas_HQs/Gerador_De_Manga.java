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
public class Gerador_De_Manga {
    
    static private String[] nomes_mangas = {
      "Naruto",
      "Bleach",
      "One Piece",
      "Vampire Knight",
      "xxxHolic",
      "Honey&Clover",
      "Welcome NHK",
      "Elfen Lied",
      "Card Captor Sakura",
      "Bakuman",
      "Black Lagoon",
      "Ichigo 100%",
      "Soul Eater",
      "Black Lagon",
      "Fairy Tail",
      "Rosario + Vampire",
      "D. Gray Man",
      "Chobits",
      "Maid-Sama",
      "Galism",
      "Onegai Teacher",
      "Onegai twins",
      "Love Hina",
      "Fruits Basket",
      "Angel Sanctuary",
      "Death Note",
      "Rurouni Kenshin",
      "Negima",
      "CDZ-Lost Canvas",
      "Dark Metro",
      "Kimi Ni Todoke"
    };
    
    public static void Gerador(List<Manga> Manga_Lista){
        
        Random g = new Random();
    
        for (int j = 0; j < 5; j++) 
        {
            int numero = g.nextInt(nomes_mangas.length);
            String nome = nomes_mangas[numero];
            Manga Novo_Manga = new Manga(nome);
            Manga_Lista.add(Novo_Manga);
            for (int i = 0; i < 3; i++) 
            {
                Fasciculo_Manga manga = new Fasciculo_Manga();
                manga.setIdioma(g.nextInt(4));
                manga.setTipo(g.nextInt(2));
                manga.setVolume(g.nextInt(100));
                Novo_Manga.Criar_Volumes(manga);
            }
        }
    }
    
}
