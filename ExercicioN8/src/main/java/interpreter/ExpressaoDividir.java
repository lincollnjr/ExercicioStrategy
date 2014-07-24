/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interpreter;

import java.util.Stack;

/**
 *
 * @author Lincoln
 */
public class ExpressaoDividir extends ExpressaoAsbtrata {
    
    public ExpressaoDividir(){
        this.proximaExpressao = null;
        this.caracter = "/";
    }
    
    public double interpret(Stack<String> pilha, String caracter){
        if(caracter.equals(this.caracter)){
            return (Integer.parseInt(pilha.pop()) + Integer.parseInt(pilha.pop()));
        }      
        return 0;
    }
    
}