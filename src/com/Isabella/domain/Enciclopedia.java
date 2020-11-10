package com.Isabella.domain;

public class Enciclopedia extends Recurso implements Prestable{

    public Enciclopedia(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public void prestar() {
        this.setPrestado(true);
    }

    @Override
    public void devolver() {
        this.setPrestado(false);
    }

    @Override
    public String toString() {
        return "Enciclopedia{"+
                "Nombre = "+ this.getNombre()+
                "}";
    }

}

