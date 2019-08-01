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
public class Cuenta {
    private String Nombre;
    private String NumeroCuenta;
    private double Tipo_interes;
    private double saldo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public double getTipo_interes() {
        return Tipo_interes;
    }

    public void setTipo_interes(double Tipo_interes) {
        this.Tipo_interes = Tipo_interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public Cuenta(String Nombre, String NumeroCuenta, double Tipo_interes, double saldo) {
        this.Nombre = Nombre;
        this.NumeroCuenta = NumeroCuenta;
        this.Tipo_interes = Tipo_interes;
        this.saldo = saldo;
    }
    
public boolean Ingreso(double Aumento){
        boolean ingreso = true;
        if (Aumento < 0) {
            ingreso = false;
        } else {
            saldo = saldo + Aumento;
        }
        return ingreso;
     }
     public boolean reintegro(double Aumento) {
        boolean reintegro = true;
        if (Aumento < 0) {
            reintegro = false;
        } else if (saldo >= Aumento) {
            saldo = Aumento;
        } else {
            reintegro = false;
        }
        return reintegro;
    }
}
