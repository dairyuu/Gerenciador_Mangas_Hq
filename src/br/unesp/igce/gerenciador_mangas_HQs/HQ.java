/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class HQ {
    private String nome;
    private  List<Fasciculo_HQ> Fasciculos = new ArrayList<Fasciculo_HQ>();
    
    HQ(String nome){
        this.nome = nome;
    }
    
    public void criarVolumes(Fasciculo_HQ hq){
            Fasciculos.add(hq);
    }

    public String getNome() {
        return nome;
    }

    public  List<Fasciculo_HQ> getFasciculos() {
        return Fasciculos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFasciculos(List<Fasciculo_HQ> Fasciculos) {
        this.Fasciculos = Fasciculos;
    }




    
       
    
}
