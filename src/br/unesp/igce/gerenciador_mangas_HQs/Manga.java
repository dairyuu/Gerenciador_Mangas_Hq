/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Guilherme Sanchez Corrêa
 */
public class Manga implements java.io.Serializable{
    private String nome;
    private List<Fasciculo_Manga> Fasciculos = new ArrayList<Fasciculo_Manga>(); 
    
    public Manga(){
        
    }
    
    public Manga(String nome){
        this.nome = nome;
    }
    
    public void criarVolumes(Fasciculo_Manga manga){
            getFasciculos().add(manga);
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
    
    public void escrever(){
        System.out.println(nome);
            for (int j = 0; j < Fasciculos.size(); j++) 
            {
                System.out.println(Fasciculos.get(j).getIdioma());
                System.out.println(Fasciculos.get(j).getTipo());
                System.out.println(Fasciculos.get(j).getVolume());
                System.out.println("\n");
            }  
        
    }
    
    public void Ordenar(){
        Collections.sort (this.Fasciculos, new Comparador_Volumes_Manga());
    }
    
}
