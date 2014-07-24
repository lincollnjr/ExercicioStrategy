/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Lincoln
 */
public class Bote extends ComponenteImpl{
    
    private int capacidade;
    
    public Bote(int capacidade){
        this.capacidade = capacidade;
    }
    
    public Bote createBote(Bote bote,int valor){
        if(bote == null){
            bote = new Bote(valor);
            return bote;
        }else{
            return (Bote) bote.clone();
        }
    }
    
}
