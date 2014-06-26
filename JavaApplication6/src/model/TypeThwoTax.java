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
public class TypeThwoTax implements TaxStrategy{

    private final double TAX = 0.075;
    
    
    @Override
    public double applyTax(Double salario) {
        return salario*TAX;
    }
    
}
