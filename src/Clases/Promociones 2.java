/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author user
 */
public class Promociones {
    
    private String Cod_promociones;
    private String Fecha_ini_promocion;
    private double Precio;
    private String Tipo_promocion;
    private int Dias_vigencia_prom;

    public Promociones(String Cod_promociones, String Fecha_ini_promocion, double Precio, String Tipo_promocion, int Dias_vigencia_prom) {
        this.Cod_promociones = Cod_promociones;
        this.Fecha_ini_promocion = Fecha_ini_promocion;
        this.Precio = Precio;
        this.Tipo_promocion = Tipo_promocion;
        this.Dias_vigencia_prom = Dias_vigencia_prom;
    }

    public Promociones() {
    }

    public String getCod_promociones() {
        return Cod_promociones;
    }

    public void setCod_promociones(String Cod_promociones) {
        this.Cod_promociones = Cod_promociones;
    }

    public String getFecha_ini_promocion() {
        return Fecha_ini_promocion;
    }

    public void setFecha_ini_promocion(String Fecha_ini_promocion) {
        this.Fecha_ini_promocion = Fecha_ini_promocion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getTipo_promocion() {
        return Tipo_promocion;
    }

    public void setTipo_promocion(String Tipo_promocion) {
        this.Tipo_promocion = Tipo_promocion;
    }

    public int getDias_vigencia_prom() {
        return Dias_vigencia_prom;
    }

    public void setDias_vigencia_prom(int Dias_vigencia_prom) {
        this.Dias_vigencia_prom = Dias_vigencia_prom;
    }

    @Override
    public String toString() {
        return "Promociones{" + "Cod_promociones=" + Cod_promociones + ", Fecha_ini_promocion=" + Fecha_ini_promocion + ", Precio=" + Precio + ", Tipo_promocion=" + Tipo_promocion + ", Dias_vigencia_prom=" + Dias_vigencia_prom + '}';
    }
    
    
}
