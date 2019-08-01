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
public class Libro {

    public String ISBN;
    public String Titulo;
    public String Autor;
    public int nºpaginas;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNºpaginas() {
        return nºpaginas;
    }

    public void setNºpaginas(int nºpaginas) {
        this.nºpaginas = nºpaginas;
    }

    public String toString(int paginas) {
        String msj;
        return msj = ("“El libro con ISBN creado por el autor tiene páginas");
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Libro objeto = new Libro();
        System.out.println(" Ingrese el numero de paginas ");
        objeto.setNºpaginas(500);
        System.out.println(objeto);
        Libro obje = new Libro();
        obje.setNºpaginas(700);
        System.out.println(obje);
        int npaginas = 1000;
        if (npaginas >= 700 && npaginas <700) {
            System.out.println(" Este libro tiene mas paginas ");
        } else {
            System.out.println(" El otro libro tiene mas paginas ");
        }
    }

}
