/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class HQ {
    private String nome;
    private static ArrayList<Fasciculo_HQ> Fasciculos = new ArrayList<Fasciculo_HQ>();
    
    HQ(String nome){
        this.nome = nome;
    }
    
    public void Criar_Volumes(Fasciculo_HQ HQ){
            Fasciculos.add(HQ);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Fasciculo_HQ> getFasciculos() {
        return Fasciculos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setFasciculos(ArrayList<Fasciculo_HQ> Fasciculos) {
        HQ.Fasciculos = Fasciculos;
    }
    
       
    
}
