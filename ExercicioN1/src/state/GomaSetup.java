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
public class GomaSetup {
    
    
    
    private GomaSetupState currentState;
    private GomaVendidaState gomaVendidaState;
    private GomasAcabaramState gomasAcabaramState;
    private RecebeuMoedaState recebeuMoedaState;
    private SemMoedaState semMoedaState;
    private boolean puxarAlavanca;
    private int moeda;
    
    public GomaSetup(){
        this.gomaVendidaState = new GomaVendidaState(this);
        this.gomasAcabaramState = new GomasAcabaramState(this);
        this.recebeuMoedaState = new RecebeuMoedaState(this);
        this.semMoedaState = new SemMoedaState(this);
        
        setState(semMoedaState);
    }
    
    public void setState(GomaSetupState gomaSetupState){
        this.currentState = gomaSetupState;
    }
    
    public void setMoeda(int moeda){
        this.moeda = moeda;
    }
    
    public int getMoeda(){
        return moeda; 
    }
    
    public void puxarAlavanca(){
        this.setPuxarAlavanca(true);
        currentState.selectState();
    }

    /**
     * @return the gomaVendidaState
     */
    public GomaVendidaState getGomaVendidaState() {
        return gomaVendidaState;
    }

    /**
     * @return the gomasAcabaramState
     */
    public GomasAcabaramState getGomasAcabaramState() {
        return gomasAcabaramState;
    }

    /**
     * @return the recebeuMoedaState
     */
    public RecebeuMoedaState getRecebeuMoedaState() {
        return recebeuMoedaState;
    }

    /**
     * @return the semMoedaState
     */
    public SemMoedaState getSemMoedaState() {
        return semMoedaState;
    }

    /**
     * @return the puxarAlavanca
     */
    public boolean isPuxarAlavanca() {
        return puxarAlavanca;
    }

    /**
     * @param puxarAlavanca the puxarAlavanca to set
     */
    public void setPuxarAlavanca(boolean puxarAlavanca) {
        this.puxarAlavanca = puxarAlavanca;
    }
    
}
