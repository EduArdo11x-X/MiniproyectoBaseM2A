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
public class Funcion {
    
    private String Id_funcion;
    private String fecha_funcion;
    private String formato;
    private String  hora;

    public Funcion(String Id_funcion, String fecha_funcion, String formato, String hora) {
        this.Id_funcion = Id_funcion;
        this.fecha_funcion = fecha_funcion;
        this.formato = formato;
        this.hora = hora;
    }

    public Funcion() {
    }
    
    
    
    /**
     * @return the Id_funcion
     */
    public String getId_funcion() {
        return Id_funcion;
    }

    /**
     * @param Id_funcion the Id_funcion to set
     */
    public void setId_funcion(String Id_funcion) {
        this.Id_funcion = Id_funcion;
    }

    /**
     * @return the fecha_funcion
     */
    public String getFecha_funcion() {
        return fecha_funcion;
    }

    /**
     * @param fecha_funcion the fecha_funcion to set
     */
    public void setFecha_funcion(String fecha_funcion) {
        this.fecha_funcion = fecha_funcion;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Funcion{" + "Id_funcion=" + Id_funcion + ", fecha_funcion=" + fecha_funcion + ", formato=" + formato + ", hora=" + hora + '}';
    }
    
    
    
    
}
