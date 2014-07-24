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
public class CabinePassageiro extends ComponenteImpl{
    
    private int capacidade;
    
    public CabinePassageiro(int capacidade){
        this.capacidade = capacidade;
    }
    
    public CabinePassageiro createBote(CabinePassageiro cabinePassageiro,int valor){
        if(cabinePassageiro == null){
            cabinePassageiro = new CabinePassageiro(valor);
            return cabinePassageiro;
        }else{
            return (CabinePassageiro) cabinePassageiro.clone();
        }
    }
    
}
