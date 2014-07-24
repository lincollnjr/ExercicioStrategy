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
public class Sensor {
    
    private MediadorTemperatura mediadorTemperatura;
    
    public Sensor(MediadorTemperatura mediadorTemperatura){
        this.mediadorTemperatura = mediadorTemperatura;
    }
    
    public int getTemperaturaExterior(){
        return 32; //Sensores captaram
    }
    
    public int getTemperaturaInterior(){
        return 5*1; //5 alunos
    }
}
