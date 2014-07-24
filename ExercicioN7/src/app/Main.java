/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import interprete_e_cadeiaderesponsabilidade.AvaliadorDirecional;
import interprete_e_cadeiaderesponsabilidade.Cidade;

/**
 *
 * @author Lincoln
 */
public class Main {
    public static void main(String[] args) {
        AvaliadorDirecional avaliador = new AvaliadorDirecional();
        
        Cidade cidade = avaliador.avaliar("vitoria serra pedrocanario norte");
        System.out.println(cidade.getNome());
    }
}
