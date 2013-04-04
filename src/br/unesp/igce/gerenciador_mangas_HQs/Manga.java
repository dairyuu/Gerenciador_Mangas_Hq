/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Sanchez Corrêa
 */
public class Manga {
    private String nome;
    private List<Fasciculo_Manga> Fasciculos = new ArrayList<Fasciculo_Manga>(); 
    
    Manga(String nome){
        this.nome = nome;
    }
    
    public void Criar_Volumes(Fasciculo_Manga manga){
            Fasciculos.add(manga);
    }

    public List<Fasciculo_Manga> getFasciculos() {
        return Fasciculos;
    }

    public String getNome() {
        return nome;
    }

    public void setFasciculos(List<Fasciculo_Manga> Fasciculos) {
        this.Fasciculos = Fasciculos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
