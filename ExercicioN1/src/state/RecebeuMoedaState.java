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
public class RecebeuMoedaState implements GomaSetupState{
    
    private GomaSetup gomaSetup;
    
    public RecebeuMoedaState(GomaSetup gomaSetup){
        this.gomaSetup = gomaSetup;
    }
    
    @Override
    public void nextState() {
        
    }

    @Override
    public void selectState() {
        this.getInstructions();
        this.nextState();
    }

    @Override
    public void getInstructions() {
        System.out.println("Acabou as gomas!");
    }
    
}
