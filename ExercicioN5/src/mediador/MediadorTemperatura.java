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
public class MediadorTemperatura {
    
    private ArCondicionado arCondicionado;
    private Sensor sensor;
    private int temperaturaAtual;
    
    public MediadorTemperatura(){
        this.temperaturaAtual = 0;
    }
    
    public void atualizarTemperaturaAtual(){
        this.temperaturaAtual = sensor.getTemperaturaExterior() + sensor.getTemperaturaInterior();;
    }
    
    public void registrarSensor(Sensor sensor){
        this.sensor = sensor;
    }
    
    public void registrarArCondicionado(ArCondicionado arCondicionado){
        this.arCondicionado = arCondicionado;
    }
    
    public void estabilizarTemperatura(){
        if(temperaturaAtual > 25){
            while(temperaturaAtual > 25){
                System.out.println("Estabilizando...");
                arCondicionado.abaixarTemperatura();
                this.temperaturaAtual--;
            }
            System.out.println("Temperatura estabilizada");
        }else{
            while(temperaturaAtual < 25){
                System.out.println("Estabilizando...");
                arCondicionado.aumentarTemperatura();
                this.temperaturaAtual++;
            }
            System.out.println("Temperatura estabilizada");
        }
    }
}
