/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import builder.CruzeiroBuilder;
import builder.CruzeiroDirector;
import builder.CruzeiroGrandeBuilder;
import builder.CruzeiroMedioBuilder;
import builder.CruzeiroPequenoBuilder;
import model.Cruzeiro;
import model.Tamanho;

/**
 *
 * @author Lincoln
 */
public class CruzeiroFabrica {
    
    private static CruzeiroFabrica instance = null;
	
	
	private CruzeiroFabrica(){}
	
	public synchronized static CruzeiroFabrica getInstante(){
		if (instance == null){
                    instance = new CruzeiroFabrica();
                }
		return instance;
	}
    
    
    public Cruzeiro getCruzeiro(Tamanho tamanho){
        CruzeiroBuilder builder = null;
        CruzeiroDirector director = new CruzeiroDirector();
        
        if(tamanho == Tamanho.GRANDE){
            builder = new CruzeiroGrandeBuilder();
        }else if(tamanho == Tamanho.MEDIO){
            builder = new CruzeiroMedioBuilder();
        }else if(tamanho == Tamanho.PEQUENO){
            builder = new CruzeiroPequenoBuilder();
        }
        
        return director.build(builder);
        
    }
    
}
