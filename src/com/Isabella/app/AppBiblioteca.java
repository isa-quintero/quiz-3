package com.Isabella.app;

import com.Isabella.domain.*;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca bibliotecaUCO = new Biblioteca();
        Libro libro = new Libro(false, "El olvido que seremos");
        Revista revista = new Revista(false, "Revista Forbes");
        Tesis tesis = new Tesis(false, "Tesis de grado Ingenieria");
        Enciclopedia enciclopedia = new Enciclopedia(false, "Enciclopedia Larousse");
        Computador computador = new Computador(false, "Computador de torre");

        bibliotecaUCO.addRecurso(libro);
        bibliotecaUCO.addRecurso(revista);
        bibliotecaUCO.addRecurso(tesis);
        bibliotecaUCO.addRecurso(enciclopedia);
        bibliotecaUCO.addRecurso(computador);

        bibliotecaUCO.prestarRecurso(libro);
        bibliotecaUCO.prestarRecurso(revista);
        bibliotecaUCO.prestarRecurso(enciclopedia);

        System.out.println("Los recursos que se encuentran prestados son: ");
        bibliotecaUCO.listarPrestados();

        bibliotecaUCO.devolverRecurso(revista);

        System.out.println("\n");
        System.out.println("Los recursos que se encuentran prestados son: ");
        bibliotecaUCO.listarPrestados();
    }
}
