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
public class Motor extends ComponenteImpl{
    
    private int potencia;
    
    public Motor(int potencia){
        this.potencia = potencia;
    }
    
    public Motor createBote(Motor motor,int valor){
        if(motor == null){
            motor = new Motor(valor);
            return motor;
        }else{
            return (Motor) motor.clone();
        }
    }
    
}
