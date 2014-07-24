/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

import model.Cruzeiro;

/**
 *
 * @author Lincoln
 */
public class CruzeiroDirector {
    
    public Cruzeiro build(CruzeiroBuilder builder){
        Cruzeiro cruzeiro = new Cruzeiro();
        cruzeiro.setListBote(builder.buildBotes());
        cruzeiro.setListCabinesPassageiro(builder.buildCabinesPassageiro());
        cruzeiro.setListMotores(builder.buildMotores());
        cruzeiro.setCabineComandante(builder.buildCabineComandante());
        return cruzeiro;            
    }
    
}
