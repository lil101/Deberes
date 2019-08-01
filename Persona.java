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
public class Persona {
    private String Nombre;
    private int Edad;
    private int DNI;
    private String Sexo;
    private double Peso;
    private double Altura;

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
   

    public Persona(String Nombre, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public Persona(String Nombre, int Edad, int DNI, String Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = DNI;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }
    public void Calcular(double peso, double altura) {
        double a = (peso / (Math.pow(altura, 2)));
        if (a < 20) {
            System.out.println(-1);
            if (a >= 20 && a <= 25) {
                System.out.println(0 + "esta en bajo su peso ideal");
                if (a > 25) {
                    System.out.println(1 + "tiene sobre peso");
                }
            }
        }
    }

    public boolean esMayordeedad(int edad) {

        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    
}
