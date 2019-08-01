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
public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el Nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad");
        String edad = entrada.nextLine();
        System.out.println("Ingrese el sexo");
        String sexo = entrada.nextLine();
        System.out.println("Ingrese el peso");
        String peso = entrada.nextLine();
        System.out.println("Ingrese la Altura");
        String altura = entrada.nextLine();
        System.out.println(nombre + " / " + edad + " / " + sexo + " / " + peso + " / " + altura);
        String Hombre = null;
        Persona objeto = new Persona("Ramiro", 20, Hombre);
        System.out.println(objeto);
        Persona obje = new Persona();

    }

}
