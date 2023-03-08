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
public class Genero {
    
    private String Id_genero;
    private String Tipo_genero;

    public Genero(String Id_genero, String Tipo_genero) {
        this.Id_genero = Id_genero;
        this.Tipo_genero = Tipo_genero;
    }

    public Genero() {
    }
    
    

    /**
     * @return the Id_genero
     */
    public String getId_genero() {
        return Id_genero;
    }

    /**
     * @param Id_genero the Id_genero to set
     */
    public void setId_genero(String Id_genero) {
        this.Id_genero = Id_genero;
    }

    /**
     * @return the Tipo_genero
     */
    public String getTipo_genero() {
        return Tipo_genero;
    }

    /**
     * @param Tipo_genero the Tipo_genero to set
     */
    public void setTipo_genero(String Tipo_genero) {
        this.Tipo_genero = Tipo_genero;
    }

    @Override
    public String toString() {
        return "Genero{" + "Id_genero=" + Id_genero + ", Tipo_genero=" + Tipo_genero + '}';
    }
    
    
    
    
}
