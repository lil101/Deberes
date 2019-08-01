/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber;

import java.util.Scanner;

/**
 *
 * @author RamiroA
 */
public class Fracciones {

    private int num;
    private int den;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public void mostrar() {
        System.out.println(num + "/" + den);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fracciones objeto = new Fracciones();
        System.out.println(" Ingres el numerador");
        objeto.setNum(entrada.nextInt());
        System.out.println(" Ingrese denominador");
        objeto.setDen(entrada.nextInt());
        objeto.mostrar();

    }
}
