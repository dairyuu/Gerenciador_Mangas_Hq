/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import Telas.Tela_Principal;
import javax.swing.JFrame;


public class Principal {

           
    
    public static void main(String[] args) {

        Tela_Principal tela = new Tela_Principal();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setName("Programa para cadastro de mangas e Hqs");
        tela.setVisible(true);

    }
}
