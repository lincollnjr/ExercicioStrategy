/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Lincoln
 */
public class Cruzeiro extends ComponenteImpl {
    
    private ArrayList<Motor> listMotores;
    private ArrayList<Bote> listBote;
    private ArrayList<CabinePassageiro> listCabinesPassageiro;
    private CabineComandante cabineComandante;

    /**
     * @return the listMotores
     */
    public ArrayList<Motor> getListMotores() {
        return listMotores;
    }

    /**
     * @param listMotores the listMotores to set
     */
    public void setListMotores(ArrayList<Motor> listMotores) {
        this.listMotores = listMotores;
    }

    /**
     * @return the listBote
     */
    public ArrayList<Bote> getListBote() {
        return listBote;
    }

    /**
     * @param listBote the listBote to set
     */
    public void setListBote(ArrayList<Bote> listBote) {
        this.listBote = listBote;
    }

    /**
     * @return the listCabinesPassageiro
     */
    public ArrayList<CabinePassageiro> getListCabinesPassageiro() {
        return listCabinesPassageiro;
    }

    /**
     * @param listCabinesPassageiro the listCabinesPassageiro to set
     */
    public void setListCabinesPassageiro(ArrayList<CabinePassageiro> listCabinesPassageiro) {
        this.listCabinesPassageiro = listCabinesPassageiro;
    }

    /**
     * @return the cabineComandante
     */
    public CabineComandante getCabineComandante() {
        return cabineComandante;
    }

    /**
     * @param cabineComandante the cabineComandante to set
     */
    public void setCabineComandante(CabineComandante cabineComandante) {
        this.cabineComandante = cabineComandante;
    }
       
}
