/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package state;

/**
 *
 * @author Lincoln
 */
public class SemMoedaState implements GomaSetupState{
    
    private GomaSetup gomaSetup;
    
    public SemMoedaState(GomaSetup gomaSetup){
        this.gomaSetup = gomaSetup;
    }
    
    @Override
    public void nextState() {
        
        if(gomaSetup.getMoeda() == 1){
            gomaSetup.getGomaVendidaState().selectState();
        }else{
            System.out.println("Moeda invalida seu burro!");
    }
    }

    @Override
    public void selectState() {
        if(gomaSetup.isPuxarAlavanca()){
            this.getInstructions();
            gomaSetup.setPuxarAlavanca(false);
            this.nextState();
        }
        
        
    }

    @Override
    public void getInstructions() {
        System.out.println("Insira a moeda de 1 real e puxe a alavanca");
    }
    
}
