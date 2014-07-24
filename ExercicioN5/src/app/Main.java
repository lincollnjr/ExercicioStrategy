/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import mediador.ArCondicionado;
import mediador.MediadorTemperatura;
import mediador.Sensor;

/**
 *
 * @author Lincoln
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        
        
        MediadorTemperatura mediador = new MediadorTemperatura();
        mediador.registrarArCondicionado(new ArCondicionado(mediador));
        mediador.registrarSensor(new Sensor(mediador));
        mediador.atualizarTemperaturaAtual();
        mediador.estabilizarTemperatura();
        
        
        
    }
    
}
