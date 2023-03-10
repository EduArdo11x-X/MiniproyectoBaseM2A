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
    private String hora;
    private int hora_inicio;
    private int min_inicio;

    public Funcion(String Id_funcion, String fecha_funcion, String formato, String hora, int hora_inicio, int min_inicio) {
        this.Id_funcion = Id_funcion;
        this.fecha_funcion = fecha_funcion;
        this.formato = formato;
        this.hora = hora;
        this.hora_inicio = hora_inicio;
        this.min_inicio = min_inicio;
    }

    public Funcion() {
    }
    
    

    public String getId_funcion() {
        return Id_funcion;
    }

    public void setId_funcion(String Id_funcion) {
        this.Id_funcion = Id_funcion;
    }

    public String getFecha_funcion() {
        return fecha_funcion;
    }

    public void setFecha_funcion(String fecha_funcion) {
        this.fecha_funcion = fecha_funcion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getMin_inicio() {
        return min_inicio;
    }

    public void setMin_inicio(int min_inicio) {
        this.min_inicio = min_inicio;
    }

    @Override
    public String toString() {
        return "Funcion{" + "Id_funcion=" + Id_funcion + ", fecha_funcion=" + fecha_funcion + ", formato=" + formato + ", hora=" + hora + ", hora_inicio=" + hora_inicio + ", min_inicio=" + min_inicio + '}';
    }
   

    
}
