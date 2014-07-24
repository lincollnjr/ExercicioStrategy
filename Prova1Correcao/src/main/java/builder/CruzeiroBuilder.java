/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

import java.util.ArrayList;
import model.Bote;
import model.CabineComandante;
import model.CabinePassageiro;
import model.Motor;

/**
 *
 * @author Lincoln
 */
public abstract class CruzeiroBuilder {
    
   
    public abstract ArrayList<Bote> buildBotes();
    
    public abstract ArrayList<Motor> buildMotores();
    
    public abstract ArrayList<CabinePassageiro> buildCabinesPassageiro();
    
    public CabineComandante buildCabineComandante(){
        return new CabineComandante();
    }
    
}
