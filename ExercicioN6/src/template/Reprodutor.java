/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package template;

/**
 *
 * @author Lincoln
 */
public class Reprodutor {
    
    private String arquivo;
    private String legenda;
    private Codec codec;
    
    public void carregarArquivo(String arquivo){
        this.arquivo = arquivo;
    }
    
    public void carregarLegenda(String legenda){
        this.legenda = legenda;
    }
    
    public void reproduzirVideo(){
        System.out.println("Reproduzindo");
    }
    
    public void localizarCodec(){
        if(arquivo.equals("mp3")){
            codec = new mp3Codec();
        }
        if(arquivo.equals("mp4")){
            codec = new mp4Codec();
        }
        if(arquivo.equals("avi")){
            codec = new aviCodec();
        }
    }
    
    public void finalizarReproducao(){
        System.out.println("Reprodução finalizada");
    }
}
