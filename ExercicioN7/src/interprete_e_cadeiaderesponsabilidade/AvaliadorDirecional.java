/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interprete_e_cadeiaderesponsabilidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Lincoln
 */
public class AvaliadorDirecional {
    
    private Map<String, Cidade> cities;
    private String ultimaPalavra;
    private Expressao interpretador;
    
    public AvaliadorDirecional() {
        cities = new HashMap<String, Cidade>();
        
        cities.put("vitoria",
                new Cidade("Vitoria", 54.62, -5.93));
        cities.put("pedrocanario",
                new Cidade("Pedro Canario", 57.15, -2.15));
        cities.put("serra",
                new Cidade("Serra", 52.42, -1.92));
        cities.put("colatina",
                new Cidade("Colatina", 53.33, -6.25));
        cities.put("vilavelha",
                new Cidade("Vila Velha", 55.92, -3.02));
        
        
    }
    
    public Cidade avaliar(String route) {
        // Define the syntax tree
        Stack<Expressao> expressionStack = new Stack<Expressao>();
        
        // Parse each token in route string
        for (String token : route.split(" ")) {
            // Is token a recognised city?
            if (cities.containsKey(token)) {
                Cidade city = cities.get(token);
                expressionStack.push(new CidadeExpressao(city));
            }
            
            ultimaPalavra = token;
        }
        
        
        interpretador = new MaisNorteExpressao(loadExpressions(expressionStack));
        return interpretador.interpretar(ultimaPalavra);
    }
    
    private List<Expressao> loadExpressions(Stack<Expressao> expressionStack) {
        List<Expressao> expressions =
                new ArrayList<Expressao>();
        while(! expressionStack.empty()) {
            expressions.add(expressionStack.pop());
        }
        return expressions;
    }
    
}

