/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interprete_e_cadeiaderesponsabilidade;

import java.util.List;

/**
 *
 * @author Lincoln
 */
public class MaisOesteExpressao extends ExpressaoAbstrata {
    
    private List<Expressao> listExpressao;
    
    public MaisOesteExpressao(List<Expressao> listExpressao) {
        this.listExpressao = listExpressao;
        this.proximaDirecao = null;
        this.direcao = "oeste";
    }
    
    
    public Cidade interpretar(String token) {
        if(token.equals(direcao)){
            Cidade resultado = new Cidade("Nada", -999.9, -999.9);
            for (Expressao atualExpressao : listExpressao) {
                Cidade cidadeAtual = atualExpressao.interpretar(token);
                if (cidadeAtual.getLongitude()>
                        resultado.getLongitude()) {
                    resultado = cidadeAtual;
                }
            }
            return resultado;
        }else{
            return null;
            
        }   
        
    }   
    

    /**
     * @return the expressao
     */
    public List<Expressao> getExpressao() {
        return listExpressao;
    }
    
}
