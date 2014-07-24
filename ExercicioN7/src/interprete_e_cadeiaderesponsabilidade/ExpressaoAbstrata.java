/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interprete_e_cadeiaderesponsabilidade;

/**
 *
 * @author Lincoln
 */
public abstract class ExpressaoAbstrata implements Expressao {
    
    protected String direcao;
    protected ExpressaoAbstrata proximaDirecao;
    
    public abstract Cidade interpretar(String token);
    
    public void proximaDirecao(String token){
        this.proximaDirecao.interpretar(token);
    }
    
}
