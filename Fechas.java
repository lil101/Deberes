/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber;

/**
 *
 * @author RamiroA
 */
public class Fechas {
    private int dia;
    private int mes;
    private int año;

    public Fechas() {
    }

    public Fechas(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public boolean Fechacorrecto(){
        boolean fecha;
        return fecha=true;
    }
    public boolean esBisiesto(){
        boolean año;
        return año=true;
    }
    public void diaSiguiente(){
        
    }
}
