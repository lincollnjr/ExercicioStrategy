/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mediador;

/**
 *
 * @author Lincoln
 */
public class ArCondicionado {
    
    private int temperatura;
    private MediadorTemperatura mediador;
    
    public ArCondicionado(MediadorTemperatura mediador){
        this.mediador = mediador;
        this.temperatura = 0;
    }
    
    public int getTemperatura(){
        return this.temperatura;
    }
    
    public void abaixarTemperatura(){
        this.temperatura--;
    }
    
    public void aumentarTemperatura(){
        this.temperatura++;
    }
}
