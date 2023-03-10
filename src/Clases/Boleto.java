/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author EDU
 */
public class Boleto {
    
    private String Id_boleto;
    private String Id_sala;
    private String Cedula_Cliente;
    private String Titulo_pelicula;
    private String Id_empleado;
    private String hora_ini_pelicula;
    private int num_asiento;
    private String nombre_cine;
    private String Id_funcion;
    private String tipo_genero;
    private String fecha_compra;
    private String hora_compra;

    public Boleto(String Id_boleto, String Id_sala, String Cedula_Cliente, String Titulo_pelicula, String Id_empleado, String hora_ini_pelicula, int num_asiento, String nombre_cine, String Id_funcion, String tipo_genero, String fecha_compra, String hora_compra) {
        this.Id_boleto = Id_boleto;
        this.Id_sala = Id_sala;
        this.Cedula_Cliente = Cedula_Cliente;
        this.Titulo_pelicula = Titulo_pelicula;
        this.Id_empleado = Id_empleado;
        this.hora_ini_pelicula = hora_ini_pelicula;
        this.num_asiento = num_asiento;
        this.nombre_cine = nombre_cine;
        this.Id_funcion = Id_funcion;
        this.tipo_genero = tipo_genero;
        this.fecha_compra = fecha_compra;
        this.hora_compra = hora_compra;
    }

    
    public Boleto() {
    }

    public String getId_boleto() {
        return Id_boleto;
    }

    public void setId_boleto(String Id_boleto) {
        this.Id_boleto = Id_boleto;
    }

    public String getId_sala() {
        return Id_sala;
    }

    public void setId_sala(String Id_sala) {
        this.Id_sala = Id_sala;
    }

    public String getCedula_Cliente() {
        return Cedula_Cliente;
    }

    public void setCedula_Cliente(String Cedula_Cliente) {
        this.Cedula_Cliente = Cedula_Cliente;
    }

    public String getTitulo_pelicula() {
        return Titulo_pelicula;
    }

    public void setTitulo_pelicula(String Titulo_pelicula) {
        this.Titulo_pelicula = Titulo_pelicula;
    }

    public String getId_empleado() {
        return Id_empleado;
    }

    public void setId_empleado(String Id_empleado) {
        this.Id_empleado = Id_empleado;
    }

    public String getHora_ini_pelicula() {
        return hora_ini_pelicula;
    }

    public void setHora_ini_pelicula(String hora_ini_pelicula) {
        this.hora_ini_pelicula = hora_ini_pelicula;
    }

    public int getNum_asiento() {
        return num_asiento;
    }

    public void setNum_asiento(int num_asiento) {
        this.num_asiento = num_asiento;
    }

    public String getNombre_cine() {
        return nombre_cine;
    }

    public void setNombre_cine(String nombre_cine) {
        this.nombre_cine = nombre_cine;
    }

    public String getId_funcion() {
        return Id_funcion;
    }

    public void setId_funcion(String Id_funcion) {
        this.Id_funcion = Id_funcion;
    }

    public String getTipo_genero() {
        return tipo_genero;
    }

    public void setTipo_genero(String tipo_genero) {
        this.tipo_genero = tipo_genero;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getHora_compra() {
        return hora_compra;
    }

    public void setHora_compra(String hora_compra) {
        this.hora_compra = hora_compra;
    }

    @Override
    public String toString() {
        return "Boleto{" + "Id_boleto=" + Id_boleto + ", Id_sala=" + Id_sala + ", Cedula_Cliente=" + Cedula_Cliente + ", Titulo_pelicula=" + Titulo_pelicula + ", Id_empleado=" + Id_empleado + ", hora_ini_pelicula=" + hora_ini_pelicula + ", num_asiento=" + num_asiento + ", nombre_cine=" + nombre_cine + ", Id_funcion=" + Id_funcion + ", tipo_genero=" + tipo_genero + ", fecha_compra=" + fecha_compra + ", hora_compra=" + hora_compra + '}';
    }
    
    

    
}
