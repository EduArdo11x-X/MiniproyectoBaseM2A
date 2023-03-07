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
public class Cartelera {
    
    private String Cod_Cartelera;
    private String Titulo_pelicula;
    private String Fecha_estreno;
    private String Genero;
    private String Clasificacion;

    public Cartelera(String Cod_Cartelera, String Titulo_pelicula, String Fecha_estreno, String Genero, String Clasificacion) {
        this.Cod_Cartelera = Cod_Cartelera;
        this.Titulo_pelicula = Titulo_pelicula;
        this.Fecha_estreno = Fecha_estreno;
        this.Genero = Genero;
        this.Clasificacion = Clasificacion;
    }

    public Cartelera() {
    }
    
    

    public String getCod_Cartelera() {
        return Cod_Cartelera;
    }

    public void setCod_Cartelera(String Cod_Cartelera) {
        this.Cod_Cartelera = Cod_Cartelera;
    }

    public String getTitulo_pelicula() {
        return Titulo_pelicula;
    }

    public void setTitulo_pelicula(String Titulo_pelicula) {
        this.Titulo_pelicula = Titulo_pelicula;
    }

    public String getFecha_estreno() {
        return Fecha_estreno;
    }

    public void setFecha_estreno(String Fecha_estreno) {
        this.Fecha_estreno = Fecha_estreno;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    @Override
    public String toString() {
        return "Cartelera{" + "Cod_Cartelera=" + Cod_Cartelera + ", Titulo_pelicula=" + Titulo_pelicula + ", Fecha_estreno=" + Fecha_estreno + ", Genero=" + Genero + ", Clasificacion=" + Clasificacion + '}';
    }
    
    
    
}