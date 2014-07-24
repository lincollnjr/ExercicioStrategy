/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import template.Reprodutor;

/**
 *
 * @author Lincoln
 */
public class Main {
    
    public static void main(String[] args) {
        Reprodutor reprodutor = new Reprodutor();
        reprodutor.carregarArquivo("mp3");
        reprodutor.carregarLegenda("Legenda...");
        reprodutor.reproduzirVideo();
        reprodutor.finalizarReproducao();
    }
    
}
