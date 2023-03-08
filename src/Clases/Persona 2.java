/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HP
 */
public class Persona {
    
    private String cedula;
    private String nombre;
    private String direccion;
    private String edad;
    private String fecha_nacimiento;

    public Persona(String cedula, String nombre, String direccion, String edad, String fecha_nacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Persona() {
        super();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
    
    
    
    
    

    
    
}
