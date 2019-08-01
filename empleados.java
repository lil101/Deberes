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
public class empleados {
    String nombre;
    int edad;
    double salario;
    int plus=300;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }
    
    public double Plus(double salario,double plus){
        return salario+plus;
    }
    public double comercial (){
        if(edad > 30){
            salario = salario + 300;
        }
        return salario;
    }
    public boolean repartidor(){
        if(edad < 25){
            return true;
        } else {
            return false;
        }
    }
}
