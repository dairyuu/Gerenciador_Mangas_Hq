/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import Telas.Tela_Principal;
import java.io.File;
import javax.swing.JFrame;


public class Principal {

           
    
    public static void main(String[] args) {
        
        File diretorio = new File(System.getProperty("user.dir")+"/Dados");
        if (!diretorio.exists()) {  
            diretorio.mkdirs();
        }

        Tela_Principal tela = new Tela_Principal();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setName("Programa para cadastro de mangas e Hqs");
        tela.setLocation(450, 150);
        tela.setVisible(true);

    }
}
