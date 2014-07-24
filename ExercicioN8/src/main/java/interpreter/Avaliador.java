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
public class Avaliador {
    
    private Stack <String> pilha;
    private Expressao expressaoInicial;
    
    public Avaliador(){
        this.pilha = new Stack<>();
        this.expressaoInicial = new ExpressaoSomar();
    }
    
    public void calcular(String caracteres){
        for(String caracter: caracteres.split(" ")){
            this.pilha.push(caracter);
        }
        
        while(!pilha.empty()){
            String caracter = pilha.pop();

            if(caracter.equals("+")||caracter.equals("-")||caracter.equals("*")||caracter.equals("/")){

                System.out.println(this.expressaoInicial.interpret(pilha,caracter));
            }
        }
        
    }
    
    
}
