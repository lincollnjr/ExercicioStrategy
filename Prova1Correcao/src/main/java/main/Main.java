/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import factory.CruzeiroFabrica;
import model.Cruzeiro;
import model.Tamanho;

/**
 *
 * @author Lincoln
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cruzeiro cruzeiroGrande = CruzeiroFabrica.getInstante().getCruzeiro(Tamanho.GRANDE);
        Cruzeiro cruzeiroMedio = CruzeiroFabrica.getInstante().getCruzeiro(Tamanho.MEDIO);
        Cruzeiro cruzeiroPequeno = CruzeiroFabrica.getInstante().getCruzeiro(Tamanho.PEQUENO);
        
        
    }
    
}
