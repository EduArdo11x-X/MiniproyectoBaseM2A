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
public class Empleado {
    
    private String Ced_empleado;
    private String Id_Empleado;
    private String Area_Empleado;
    private int hora_inicio;
    private int min_inicio;
    private int hora_fin;
    private int min_fin;
    private String Horario_inicio;
    private String Horario_fin;
    private String horas_sem;

    public Empleado(String Ced_empleado, String Id_Empleado, String Area_Empleado, int hora_inicio, int min_inicio, int hora_fin, int min_fin, String Horario_inicio, String Horario_fin, String horas_sem) {
        this.Ced_empleado = Ced_empleado;
        this.Id_Empleado = Id_Empleado;
        this.Area_Empleado = Area_Empleado;
        this.hora_inicio = hora_inicio;
        this.min_inicio = min_inicio;
        this.hora_fin = hora_fin;
        this.min_fin = min_fin;
        this.Horario_inicio = Horario_inicio;
        this.Horario_fin = Horario_fin;
        this.horas_sem = horas_sem;
    }

    public String getCed_empleado() {
        return Ced_empleado;
    }

    public void setCed_empleado(String Ced_empleado) {
        this.Ced_empleado = Ced_empleado;
    }

    public String getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(String Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    public String getArea_Empleado() {
        return Area_Empleado;
    }

    public void setArea_Empleado(String Area_Empleado) {
        this.Area_Empleado = Area_Empleado;
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

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }

    public int getMin_fin() {
        return min_fin;
    }

    public void setMin_fin(int min_fin) {
        this.min_fin = min_fin;
    }

    public String getHorario_inicio() {
        return Horario_inicio;
    }

    public void setHorario_inicio(String Horario_inicio) {
        this.Horario_inicio = Horario_inicio;
    }

    public String getHorario_fin() {
        return Horario_fin;
    }

    public void setHorario_fin(String Horario_fin) {
        this.Horario_fin = Horario_fin;
    }

    public String getHoras_sem() {
        return horas_sem;
    }

    public void setHoras_sem(String horas_sem) {
        this.horas_sem = horas_sem;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Ced_empleado=" + Ced_empleado + ", Id_Empleado=" + Id_Empleado + ", Area_Empleado=" + Area_Empleado + ", hora_inicio=" + hora_inicio + ", min_inicio=" + min_inicio + ", hora_fin=" + hora_fin + ", min_fin=" + min_fin + ", Horario_inicio=" + Horario_inicio + ", Horario_fin=" + Horario_fin + ", horas_sem=" + horas_sem + '}';
    }

    

    
    
    
    
}
