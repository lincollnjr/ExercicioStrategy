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
public class CabineComandante extends ComponenteImpl {
    
    public CabineComandante createBote(CabineComandante cabineComandante){
        if(cabineComandante == null){
            cabineComandante = new CabineComandante();
            return cabineComandante;
        }else{
            return (CabineComandante) cabineComandante.clone();
        }
    }
    
}
