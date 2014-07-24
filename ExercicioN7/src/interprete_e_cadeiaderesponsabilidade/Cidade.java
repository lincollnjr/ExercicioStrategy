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
public class Cidade {
    
    private String nome;
    private double latitude, longitude;
    
    public Cidade(String nome, double latitude, double longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public double getLongitude() {
        return longitude;
    }
    
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (! (otherObject instanceof Cidade)) return false;
        Cidade otherCity = (Cidade) otherObject;
        return getNome().equals(otherCity.getNome());
    }
    
    public int hashCode() {
        return getNome().hashCode();
    }
    
    public String toString() {
        return getNome();
    }
    
}
