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
public class Sala {
        private String sala_id;
    private String butacas_num;
    private String num_sala;

    public Sala(String sala_id, String butacas_num, String num_sala) {
        this.sala_id = sala_id;
        this.butacas_num = butacas_num;
        this.num_sala = num_sala;
    }

    public Sala() {
        super();
    }

    public String getSala_id() {
        return sala_id;
    }

    public void setSala_id(String sala_id) {
        this.sala_id = sala_id;
    }

    public String getButacas_num() {
        return butacas_num;
    }

    public void setButacas_num(String butacas_num) {
        this.butacas_num = butacas_num;
    }

    public String getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala_id=" + sala_id + ", butacas_num=" + butacas_num + ", num_sala=" + num_sala + '}';
    }
    
    

    
    
}
