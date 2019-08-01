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
public class Ejecut {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println(" Si tiene de 30 años en adelante se le dara un plus");
        entrada.nextInt();
        empleados objeto=new empleados();
        double respuesta=objeto.Plus(300, 300);
        System.out.println(respuesta);
        
    }
    
}
