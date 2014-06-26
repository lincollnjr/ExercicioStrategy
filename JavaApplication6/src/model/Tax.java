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
public class Tax {
    
    private TaxStrategy strategy;

    /**
     * @return the strategy
     */
    public TaxStrategy getStrategy() {
        return strategy;
    }

    /**
     * @param strategy the strategy to set
     */
    public void setStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void getTaxValue(Double salario){        
        System.out.println(strategy.applyTax(salario));
    }
    
}
