package com.Isabella.domain;

public class Computador extends Recurso{
    public Computador(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public String toString() {
        return "Computador{"+
                "Nombre = "+ this.getNombre()+
                "}";
    }
}
