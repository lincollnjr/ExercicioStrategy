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
public class GomaVendidaState implements GomaSetupState {
    
    private int numeroGomas = 50;
    private GomaSetup gomaSetup;
    
    public GomaVendidaState(GomaSetup gomaSetup){
        this.gomaSetup = gomaSetup;
    }
    
    @Override
    public void nextState() {
        if(numeroGomas>0){
            numeroGomas--;
            gomaSetup.getSemMoedaState().selectState();
        }else{
            gomaSetup.getGomasAcabaramState().selectState();
        }
    }

    @Override
    public void selectState() {
        this.getInstructions();
        this.nextState();
    }

    @Override
    public void getInstructions() {
        System.out.println("Goma vendida, pegue-a no chão seu otario.");
    }
}
