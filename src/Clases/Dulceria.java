/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Dulceria {
    
    private String Cod_Dulceria;
    private String Combos;
    private String Bebidas;
    private String Dulces;

    public Dulceria(String Cod_Dulceria, String Combos, String Bebidas, String Dulces) {
        this.Cod_Dulceria = Cod_Dulceria;
        this.Combos = Combos;
        this.Bebidas = Bebidas;
        this.Dulces = Dulces;
    }

    

    public Dulceria() {
    }

    public String getCod_Dulceria() {
        return Cod_Dulceria;
    }

    public void setCod_Dulceria(String Cod_Dulceria) {
        this.Cod_Dulceria = Cod_Dulceria;
    }

    public String getCombos() {
        return Combos;
    }

    public void setCombos(String Combos) {
        this.Combos = Combos;
    }

    public String getBebidas() {
        return Bebidas;
    }

    public void setBebidas(String Bebidas) {
        this.Bebidas = Bebidas;
    }

    public String getDulces() {
        return Dulces;
    }

    public void setDulces(String Dulces) {
        this.Dulces = Dulces;
    }

    @Override
    public String toString() {
        return "Dulceria{" + "Cod_Dulceria=" + Cod_Dulceria + ", Combos=" + Combos + ", Bebidas=" + Bebidas + ", Dulces=" + Dulces + '}';
    }
    
    

    
    
}
