/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.gerenciador_mangas_HQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Controlador {
    
    public static void AddManga(String nome,Fasciculo_Manga novo_volume){
        try{
            List<Manga> Manga_Lista;
            SavePoint save = new SavePoint();

            if(save.ExistManga()){
                Manga_Lista = save.ReadManga();
            }else{
                Manga_Lista = new ArrayList<Manga>();
            }
            int comparar;

            int i = 0;
            boolean have = false;
            while((i < Manga_Lista.size()) && (have == false)){
                Manga manga_recuperado = Manga_Lista.get(i);
                comparar = manga_recuperado.getNome().compareToIgnoreCase(nome);
                if(comparar == 0){
                    have = true;
                    break;
                }
                i++;
            }

            boolean have2 = false;
            if(have){
                if(novo_volume.getVolume() != -1){
                for(int i2 = 0; i2< Manga_Lista.get(i).getFasciculos().size();i2++){
                    Fasciculo_Manga manga_comparar = Manga_Lista.get(i).getFasciculos().get(i2);
                    if(manga_comparar.getIdioma() == novo_volume.getIdioma())
                        if(manga_comparar.getTipo() == novo_volume.getTipo())
                            if(manga_comparar.getVolume() == novo_volume.getVolume())
                                have2 = true;
                }
                }
                if(have2 == false || novo_volume.getVolume() == -1){
                    Manga_Lista.get(i).criarVolumes(novo_volume);
                    Manga_Lista.get(i).Ordenar();
                    JOptionPane.showMessageDialog(null, "Volume adicionado com sucesso", "Volume adicionado", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Erro: Volume já existente", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                Manga novo_manga = new Manga(nome);
                novo_manga.criarVolumes(novo_volume);
                Manga_Lista.add(novo_manga);
                Collections.sort (Manga_Lista, new Comparador_Mangas());
                JOptionPane.showMessageDialog(null, "Manga criado com sucesso", "Manga Criado", JOptionPane.INFORMATION_MESSAGE);
            }

            save.SaveManga(Manga_Lista);
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog (null, "Erro: Volume Incompativel", "Erro", JOptionPane.ERROR_MESSAGE); 
       } 
    }
    
    public static void AddHq(String nome,Fasciculo_HQ novo_volume){
        try{
            List<HQ> HQ_Lista;
            SavePoint save = new SavePoint();

            if(save.ExistHQ()){
                HQ_Lista = save.ReadHQ();
            }else{
                HQ_Lista = new ArrayList<HQ>();
            }
            
            int comparar;

            int i = 0;
            boolean have = false;
            while((i < HQ_Lista.size()) && (have == false)){
                HQ HQ_recuperado = HQ_Lista.get(i);
                comparar = HQ_recuperado.getNome().compareToIgnoreCase(nome);
                if(comparar == 0){
                    have = true;
                    break;
                }
                i++;
            }
            boolean have2 = false;
            if(have){
                if(novo_volume.getEdicao() != -1){
                for(int i2 = 0;i2 < HQ_Lista.get(i).getFasciculos().size();i2++){
                    Fasciculo_HQ Hq_comparar = HQ_Lista.get(i).getFasciculos().get(i2);
                    if(Hq_comparar.getEdicao() == novo_volume.getEdicao())
                        if(Hq_comparar.getIdioma() == novo_volume.getIdioma())
                            have2 = true;
                }
                }
                if(have2 == false || novo_volume.getEdicao() == -1){
                    HQ_Lista.get(i).criarVolumes(novo_volume);
                    HQ_Lista.get(i).Ordenar();
                    JOptionPane.showMessageDialog(null, "Volume adicionado com sucesso", "Volume adicionado", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Erro: Volume já existente", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                HQ novo_Hq = new HQ(nome);
                novo_Hq.criarVolumes(novo_volume);
                HQ_Lista.add(novo_Hq);
                Collections.sort (HQ_Lista, new Comparador_Hq());
                JOptionPane.showMessageDialog(null, "HQ criado com sucesso", "HQ Criado", JOptionPane.INFORMATION_MESSAGE);
            }

            save.SaveHQ(HQ_Lista);
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog (null, "Erro: Volume Incompativel", "Erro", JOptionPane.ERROR_MESSAGE); 
       } 
    }
    
    public static void DeletarColecaoHq(String nome){
        List<HQ> HQ_Lista;
        SavePoint save = new SavePoint();
        
        if(save.ExistHQ()){
            HQ_Lista = save.ReadHQ();
        }else{
            HQ_Lista = new ArrayList<HQ>();
        }
        
        int i = 0;
        boolean have = false;
        while((i < HQ_Lista.size()) && (have == false)){
            HQ HQ_recuperado = HQ_Lista.get(i);
            int comparar = HQ_recuperado.getNome().compareToIgnoreCase(nome);
            if(comparar == 0){
                have = true;
                break;
            }
            i++;
        }
        if(have){
            HQ_Lista.remove(i);
            Collections.sort(HQ_Lista,new Comparador_Hq());
            JOptionPane.showMessageDialog(null, "HQ deletado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "HQ não existe", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        save.SaveHQ(HQ_Lista);
    }
    
    public static void DeletarColecaoManga(String nome){
        
        List<Manga> Manga_Lista;
        SavePoint save = new SavePoint();
        
        if(save.ExistManga()){
            Manga_Lista = save.ReadManga();
        }else{
            Manga_Lista = new ArrayList<Manga>();
        }
      
        int i = 0;
        boolean have = false;
        while((i < Manga_Lista.size()) && (have == false)){
            Manga manga_recuperado = Manga_Lista.get(i);
            int comparar = manga_recuperado.getNome().compareToIgnoreCase(nome);
            if(comparar == 0){
                have = true;
                break;
            }
            i++;
        }
        if(have){
            Manga_Lista.remove(i);
            Collections.sort (Manga_Lista, new Comparador_Mangas());
            JOptionPane.showMessageDialog(null, "Manga deletado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Manga não existe", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        save.SaveManga(Manga_Lista);
    }
    
    public static void DeletarVolumeManga(String nome,Fasciculo_Manga novo_volume){
        try{
            List<Manga> Manga_Lista;
            SavePoint save = new SavePoint();

            if(save.ExistManga()){
                Manga_Lista = save.ReadManga();
            }else{
                Manga_Lista = new ArrayList<Manga>();
            }
            
            int comparar;

            int i = 0;
            boolean have = false;
            while((i < Manga_Lista.size()) && (have == false)){
                Manga manga_recuperado = Manga_Lista.get(i);
                comparar = manga_recuperado.getNome().compareToIgnoreCase(nome);
                if(comparar == 0){
                    have = true;
                    break;
                }
                i++;
            }

            boolean have2 = false;
            int i2;
            if(have){
                for(i2 = 0; i2< Manga_Lista.get(i).getFasciculos().size();i2++){
                    Fasciculo_Manga Manga_Comparar = Manga_Lista.get(i).getFasciculos().get(i2);
                    if(Manga_Comparar.getIdioma() == novo_volume.getIdioma())
                        if(Manga_Comparar.getTipo() == novo_volume.getTipo())
                            if(Manga_Comparar.getVolume() == novo_volume.getVolume()){
                                have2 = true;
                                break;
                            }
                }
                if(have2 == false){
                    JOptionPane.showMessageDialog(null, "Volume Não Existe", "Erro", JOptionPane.ERROR_MESSAGE);
                }else{
                    Manga_Lista.get(i).getFasciculos().remove(i2);
                    if(Manga_Lista.get(i).getFasciculos().isEmpty()){
                        Manga_Lista.remove(i);
                    }
                    JOptionPane.showMessageDialog(null, "Volume Deletado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Manga não existe", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            save.SaveManga(Manga_Lista);
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog (null, "Erro: Volume Incompativel", "Erro", JOptionPane.ERROR_MESSAGE); 
       }
    }
    
    public static void DeletarVolumeHq(String nome,Fasciculo_HQ novo_volume){
        try{
            List<HQ> HQ_Lista;
            SavePoint save = new SavePoint();

            if(save.ExistHQ()){
                HQ_Lista = save.ReadHQ();
            }else{
                HQ_Lista = new ArrayList<HQ>();
            }

            int comparar;

            int i = 0;
            boolean have = false;
            while((i < HQ_Lista.size()) && (have == false)){
                HQ HQ_recuperado = HQ_Lista.get(i);
                comparar = HQ_recuperado.getNome().compareToIgnoreCase(nome);
                if(comparar == 0){
                    have = true;
                    break;
                }
                i++;
            }
            boolean have2 = false;
            int i2;
            if(have){
                for(i2 = 0;i2 < HQ_Lista.get(i).getFasciculos().size();i2++){
                    Fasciculo_HQ Hq_comparar = HQ_Lista.get(i).getFasciculos().get(i2);
                    if(Hq_comparar.getEdicao() == novo_volume.getEdicao())
                        if(Hq_comparar.getIdioma() == novo_volume.getIdioma()){
                            have2 = true;
                            break;
                        }
                }
                if(have2 == false){
                    JOptionPane.showMessageDialog(null, "Volume não existe", "Erro", JOptionPane.ERROR_MESSAGE);
                }else{
                    HQ_Lista.get(i).getFasciculos().remove(i2);
                    if(HQ_Lista.get(i).getFasciculos().isEmpty()){
                        HQ_Lista.remove(i);
                    }
                    JOptionPane.showMessageDialog(null, "Volume Deleteado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "HQ Inexistente", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            save.SaveHQ(HQ_Lista);
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog (null, "Erro: Volume Incompativel", "Erro", JOptionPane.ERROR_MESSAGE); 
       } 
    }

    public static DefaultListModel MostrarTodosMangas(){
        List<Manga> Manga_Lista;
        SavePoint save = new SavePoint();
        
        if(save.ExistManga()){
            Manga_Lista = save.ReadManga();
        }else{
            Manga_Lista = new ArrayList<Manga>();
        }
        
        int contador = 0;
        
        DefaultListModel lista = new DefaultListModel(); 
        for(int i=0;i<Manga_Lista.size();i++){
            String nome = Manga_Lista.get(i).getNome();
            for(int i2 =0;i2<Manga_Lista.get(i).getFasciculos().size();i2++){
                contador = contador + 1;
               int Idioma = Manga_Lista.get(i).getFasciculos().get(i2).getIdioma();
               int tipo = Manga_Lista.get(i).getFasciculos().get(i2).getTipo();
               String nome_tipo = "";
               String nome_Idioma = "";
               
               if(tipo == 0){
                   nome_tipo = "Tankobon";
               }else{
                   nome_tipo = "Meio-Tankobon";
               }
               switch(Idioma){
                   case 0:
                       nome_Idioma = "Português";
                       break;
                   case 1:
                       nome_Idioma = "Japonês";
                       break;
                   case 2:
                       nome_Idioma = "Inglês";
                       break;
                   case 3:
                       nome_Idioma = "Italiano";
                       break;
                   case 4:
                       nome_Idioma = "Espanhol";
                       break;
                   case 5:
                       nome_Idioma = "Holandês";
                       break;
                   case 6:
                       nome_Idioma = "Francês";
                       break;
               }
            
               if(Manga_Lista.get(i).getFasciculos().get(i2).getVolume() != -1){
                lista.addElement("Nome: "+nome+"     Volume: "+Integer.toString(Manga_Lista.get(i).getFasciculos().get(i2).getVolume())+"         Idioma: "+nome_Idioma + "          Tipo: "+nome_tipo);
               }else{
                   lista.addElement("Nome: "+nome+"     Volume: Especial"+"         Idioma: "+nome_Idioma + "          Tipo: "+nome_tipo);
               }
            }
        lista.addElement("");
        lista.addElement("");
        }
        lista.addElement("");
        lista.addElement("");
        lista.addElement("Total de mangas: "+ contador+"");
        return lista;
    }

    public static DefaultListModel MostrarTodosHq(){
        List<HQ> HQ_Lista;
        SavePoint save = new SavePoint();
        
        if(save.ExistHQ()){
            HQ_Lista = save.ReadHQ();
        }else{
            HQ_Lista = new ArrayList<HQ>();
        }
        
         DefaultListModel lista = new DefaultListModel(); 
        for(int i=0;i<HQ_Lista.size();i++){
            String nome = HQ_Lista.get(i).getNome();
            for(int i2 =0;i2<HQ_Lista.get(i).getFasciculos().size();i2++){
               int Idioma = HQ_Lista.get(i).getFasciculos().get(i2).getIdioma();
               String nome_Idioma = "";

               switch(Idioma){
                   case 0:
                       nome_Idioma = "Português";
                       break;
                   case 1:
                       nome_Idioma = "Japonês";
                       break;
                   case 2:
                       nome_Idioma = "Inglês";
                       break;
                   case 3:
                       nome_Idioma = "Italiano";
                       break;
                   case 4:
                       nome_Idioma = "Espanhol";
                       break;
                   case 5:
                       nome_Idioma = "Holandês";
                       break;
                   case 6:
                       nome_Idioma = "Francês";
                       break;
               }
            if(HQ_Lista.get(i).getFasciculos().get(i2).getEdicao() != -1){   
            lista.addElement("Nome: "+nome+"     Volume: "+Integer.toString(HQ_Lista.get(i).getFasciculos().get(i2).getEdicao())+"         Idioma: "+nome_Idioma);
            }else{
             lista.addElement("Nome: "+nome+"     Volume: Especial"+"         Idioma: "+nome_Idioma);   
            }
            }
        lista.addElement("");
        lista.addElement("");
        }
        return lista;
    }

    public static DefaultListModel PesquisarManga(String nome){
        List<Manga> Manga_Lista;
        SavePoint save = new SavePoint();
        
        if(save.ExistManga()){
            Manga_Lista = save.ReadManga();
        }else{
            Manga_Lista = new ArrayList<Manga>();
        }
        
        int i = 0;
        int[] contador = new int[Manga_Lista.size()];
        int indice = 0;
        boolean have = false;
        while((i < Manga_Lista.size())){
            Manga manga_recuperado = Manga_Lista.get(i);
            //int comparar = manga_recuperado.getNome().compareToIgnoreCase(nome);
            int comparar = manga_recuperado.getNome().toLowerCase().indexOf(nome.toLowerCase());
            if(comparar != -1){
                have = true;
                contador[indice] = i;
                indice += 1;
            }
            i++;
        }
        
        if(have){
           DefaultListModel lista = new DefaultListModel();
           for(int j = 0;j < indice;j++){
           for(int i2=0;i2<Manga_Lista.get(contador[j]).getFasciculos().size();i2++){
               int Idioma = Manga_Lista.get(contador[j]).getFasciculos().get(i2).getIdioma();
               int tipo = Manga_Lista.get(contador[j]).getFasciculos().get(i2).getTipo();
               String nome_tipo = "";
               String nome_Idioma = "";
               
               if(tipo == 0){
                   nome_tipo = "Tankobon";
               }else{
                   nome_tipo = "Meio-Tankobon";
               }
               switch(Idioma){
                   case 0:
                       nome_Idioma = "Portugu�s";
                       break;
                   case 1:
                       nome_Idioma = "Japon�s";
                       break;
                   case 2:
                       nome_Idioma = "Ingl�s";
                       break;
                   case 3:
                       nome_Idioma = "Italiano";
                       break;
                   case 4:
                       nome_Idioma = "Espanhol";
                       break;
                   case 5:
                       nome_Idioma = "Holandes";
                       break;
                   case 6:
                       nome_Idioma = "Franc�s";
                       break;
               }
               
             if(Manga_Lista.get(contador[j]).getFasciculos().get(i2).getVolume() != -1){
                lista.addElement("Nome: "+Manga_Lista.get(contador[j]).getNome()+"     Volume: "+Integer.toString(Manga_Lista.get(contador[j]).getFasciculos().get(i2).getVolume())+"         Idioma: "+nome_Idioma + "          Tipo: "+nome_tipo);
               }else{
                   lista.addElement("Nome: "+Manga_Lista.get(contador[j]).getNome()+"     Volume: Especial"+"         Idioma: "+nome_Idioma + "          Tipo: "+nome_tipo);
               }
           }
           lista.addElement("");
           lista.addElement("");
        }
           return lista;
        }else{
            JOptionPane.showMessageDialog(null, "Manga n?o existe na base de dados", "Manga inexistente", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public static DefaultListModel PesquisarHq(String nome){
        List<HQ> HQ_Lista;
        SavePoint save = new SavePoint();
        
        if(save.ExistHQ()){
            HQ_Lista = save.ReadHQ();
        }else{
            HQ_Lista = new ArrayList<HQ>();
        }
        
        int i = 0;
        int[] contador = new int[HQ_Lista.size()];
        int indice = 0;
        boolean have = false;
        while((i < HQ_Lista.size())){
            HQ HQ_recuperado = HQ_Lista.get(i);
            int comparar = HQ_recuperado.getNome().toLowerCase().indexOf(nome.toLowerCase());
            if(comparar != -1){
                have = true;
                contador[indice] = i;
                indice += 1;
            }
            i++;
        }
        
        if(have){
           DefaultListModel lista = new DefaultListModel(); 
           for(int j = 0;j<indice;j++){
           for(int i2=0;i2<HQ_Lista.get(contador[j]).getFasciculos().size();i2++){
               int Idioma = HQ_Lista.get(contador[j]).getFasciculos().get(i2).getIdioma();
               String nome_Idioma = "";
               
               switch(Idioma){
                   case 0:
                       nome_Idioma = "Portugu�s";
                       break;
                   case 1:
                       nome_Idioma = "Japon�s";
                       break;
                   case 2:
                       nome_Idioma = "Ingl�s";
                       break;
                   case 3:
                       nome_Idioma = "Italiano";
                       break;
                   case 4:
                       nome_Idioma = "Espanhol";
                       break;
                   case 5:
                       nome_Idioma = "Holand�s";
                       break;
                   case 6:
                       nome_Idioma = "Franc�s";
                       break;
               }
               
             if(HQ_Lista.get(contador[j]).getFasciculos().get(i2).getEdicao()!= -1){
                lista.addElement("Nome: "+HQ_Lista.get(contador[j]).getNome()+"     Volume: "+Integer.toString(HQ_Lista.get(contador[j]).getFasciculos().get(i2).getEdicao())+"         Idioma: ");
               }else{
                   lista.addElement("Nome: "+HQ_Lista.get(contador[j]).getNome()+"     Volume: Especial"+"         Idioma: "+nome_Idioma);
               }
           }
           lista.addElement("");
           lista.addElement("");
        }
           return lista;
        }else{
            JOptionPane.showMessageDialog(null, "HQ n?o existe na base de dados", "HQ inexistente", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public static Fasciculo_Manga PesquisarMangaUpdate(String nome,Fasciculo_Manga novo_volume){
        try{
            List<Manga> Manga_Lista;
            SavePoint save = new SavePoint();

            if(save.ExistManga()){
                Manga_Lista = save.ReadManga();
            }else{
                Manga_Lista = new ArrayList<Manga>();
            }
            
            int comparar;

            int i = 0;
            boolean have = false;
            while((i < Manga_Lista.size()) && (have == false)){
                Manga manga_recuperado = Manga_Lista.get(i);
                comparar = manga_recuperado.getNome().compareToIgnoreCase(nome);
                if(comparar == 0){
                    have = true;
                    break;
                }
                i++;
            }

            boolean have2 = false;
            int i2;
            if(have){
                for(i2 = 0; i2< Manga_Lista.get(i).getFasciculos().size();i2++){
                    Fasciculo_Manga Manga_Comparar = Manga_Lista.get(i).getFasciculos().get(i2);
                    if(Manga_Comparar.getIdioma() == novo_volume.getIdioma())
                        if(Manga_Comparar.getTipo() == novo_volume.getTipo())
                            if(Manga_Comparar.getVolume() == novo_volume.getVolume()){
                                have2 = true;
                                break;
                            }
                }
                if(have2 == false){
                    JOptionPane.showMessageDialog(null, "Volume Nao Existe", "Erro", JOptionPane.ERROR_MESSAGE);
                }else{
                    return Manga_Lista.get(i).getFasciculos().get(i2);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Manga n?o existe", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog (null, "Erro: Volume Incompativel", "Erro", JOptionPane.ERROR_MESSAGE); 
       }
        return null;
    }
    
    public static Fasciculo_HQ PesquisarHqUpdate(String nome, Fasciculo_HQ novo_volume){
        try{
            List<HQ> HQ_Lista;
            SavePoint save = new SavePoint();

            if(save.ExistHQ()){
                HQ_Lista = save.ReadHQ();
            }else{
                HQ_Lista = new ArrayList<HQ>();
            }

            int comparar;

            int i = 0;
            boolean have = false;
            while((i < HQ_Lista.size()) && (have == false)){
                HQ HQ_recuperado = HQ_Lista.get(i);
                comparar = HQ_recuperado.getNome().compareToIgnoreCase(nome);
                if(comparar == 0){
                    have = true;
                    break;
                }
                i++;
            }
            boolean have2 = false;
            int i2;
            if(have){
                for(i2 = 0;i2 < HQ_Lista.get(i).getFasciculos().size();i2++){
                    Fasciculo_HQ Hq_comparar = HQ_Lista.get(i).getFasciculos().get(i2);
                    if(Hq_comparar.getEdicao() == novo_volume.getEdicao())
                        if(Hq_comparar.getIdioma() == novo_volume.getIdioma()){
                            have2 = true;
                            break;
                        }
                }
                if(have2 == false){
                    JOptionPane.showMessageDialog(null, "Volume n?o existe", "Erro", JOptionPane.ERROR_MESSAGE);
                }else{
                    return HQ_Lista.get(i).getFasciculos().get(i2);
                }
            }else{
                JOptionPane.showMessageDialog(null, "HQ Inexistente", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog (null, "Erro: Volume Incompativel", "Erro", JOptionPane.ERROR_MESSAGE); 
       } 
        return null;
    }
}
