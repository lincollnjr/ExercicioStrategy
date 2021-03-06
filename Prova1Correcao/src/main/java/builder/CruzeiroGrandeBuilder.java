/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

import java.util.ArrayList;
import model.Bote;
import model.CabinePassageiro;
import model.Motor;

/**
 *
 * @author Lincoln
 */
public class CruzeiroGrandeBuilder extends CruzeiroBuilder {

    @Override
    public ArrayList<Bote> buildBotes() {
        Bote componente = null;
        ArrayList<Bote> listComponentes = new ArrayList<>();
        for(int contador = 0; contador < 500; contador++){
            componente = componente.createBote(componente, 4); 
            listComponentes.set(contador, componente);
        }    
        return listComponentes;
    }

    @Override
    public ArrayList<Motor> buildMotores() {

        Motor componente = null;
        ArrayList<Motor> listComponentes = new ArrayList<>();
        for(int contador = 0; contador < 2; contador++){
            componente = componente.createBote(componente, 7000);            
            listComponentes.set(contador, componente );
        }    
        return listComponentes;
    
    }

    @Override
    public ArrayList<CabinePassageiro> buildCabinesPassageiro() {

        CabinePassageiro componente = null;
        ArrayList<CabinePassageiro> listComponentes = new ArrayList<>();
        for(int contador = 0; contador < 1000; contador++){
            componente = componente.createBote(componente, 5);            
            listComponentes.set(contador, componente );
        }    
        return listComponentes;       
    
    }
    
    
    
}
