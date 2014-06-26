/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import model.Tax;
import model.TaxStrategy;
import model.TypeThwoTax;

/**
 *
 * @author Lincoln
 */
public class Main {
    
    
    
    public static void main(String argvs[]){
        Tax tax = new Tax();
        TaxStrategy strategy = new TypeThwoTax();
        tax.setStrategy(strategy);
        tax.getTaxValue(1234.00);
    }
    
    
}
