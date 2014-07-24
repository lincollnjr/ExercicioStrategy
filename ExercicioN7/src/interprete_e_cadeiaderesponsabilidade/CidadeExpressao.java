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
public class CidadeExpressao implements Expressao {
    
    private Cidade cidade;
    
    public CidadeExpressao(Cidade cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public Cidade interpretar(String token) {
        return cidade;
    }

   
    
}
