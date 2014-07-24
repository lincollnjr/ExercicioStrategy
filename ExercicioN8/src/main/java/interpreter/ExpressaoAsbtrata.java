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
public abstract class ExpressaoAsbtrata implements Expressao{
    
    protected String caracter;
    protected Expressao proximaExpressao;
    
    public abstract double interpret(Stack<String> pilha, String caracter);
    
    public Expressao proximaExpressao(){
        return this.proximaExpressao;
    }
    
}
