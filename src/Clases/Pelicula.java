/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.db4o.ObjectContainer;

/**
 *
 * @author Lenovo
 */
public class Pelicula {
    
    private String Cod_Pelicula;
    private String titulo_pelicula;
    private String Actores;
    private String Duracion;
    private String Categoria;
    private String Anio_estreno;
    private String Idioma;
    private String Clasificacion;
    private String Directores;

    public Pelicula(String Cod_Pelicula, String titulo_pelicula, String Actores, String Duracion, String Categoria, String Anio_estreno, String Idioma, String Clasificacion, String Directores) {
        this.Cod_Pelicula = Cod_Pelicula;
        this.titulo_pelicula = titulo_pelicula;
        this.Actores = Actores;
        this.Duracion = Duracion;
        this.Categoria = Categoria;
        this.Anio_estreno = Anio_estreno;
        this.Idioma = Idioma;
        this.Clasificacion = Clasificacion;
        this.Directores = Directores;
    }

    public Pelicula() {
        
    }

    public String getCod_Pelicula() {
        return Cod_Pelicula;
    }

    public void setCod_Pelicula(String Cod_Pelicula) {
        this.Cod_Pelicula = Cod_Pelicula;
    }

    public String getTitulo_pelicula() {
        return titulo_pelicula;
    }

    public void setTitulo_pelicula(String titulo_pelicula) {
        this.titulo_pelicula = titulo_pelicula;
    }

    public String getActores() {
        return Actores;
    }

    public void setActores(String Actores) {
        this.Actores = Actores;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getAnio_estreno() {
        return Anio_estreno;
    }

    public void setAnio_estreno(String Anio_estreno) {
        this.Anio_estreno = Anio_estreno;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getDirectores() {
        return Directores;
    }

    public void setDirectores(String Directores) {
        this.Directores = Directores;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Cod_Pelicula=" + Cod_Pelicula + ", titulo_pelicula=" + titulo_pelicula + ", Actores=" + Actores + ", Duracion=" + Duracion + ", Categoria=" + Categoria + ", Anio_estreno=" + Anio_estreno + ", Idioma=" + Idioma + ", Clasificacion=" + Clasificacion + ", Directores=" + Directores + '}';
    }

    public int Comprobar_Peliculas(ObjectContainer basep, String IDAux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    

}