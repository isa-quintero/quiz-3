package com.Isabella.domain;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;

    private List<Recurso> recursosDisponibles;

    private List<Recurso> recursosPrestados;

    public Biblioteca() {
        this.recursosPrestados = new ArrayList<>();
        this.recursosDisponibles = new ArrayList<>();
    }

    public void addRecurso(Recurso recursoAIngresar) {
        boolean recursoExiste = recursosDisponibles.stream().filter(r -> r.getNombre() == recursoAIngresar.getNombre()).findAny().isPresent();

        if (!recursoExiste){
            this.recursosDisponibles.add(recursoAIngresar);
        } else{
            System.out.println("El recurso ya existe en la biblioteca.");
        }

    }
    public boolean prestarRecurso(Prestable prestable){
        prestable.prestar();
        this.recursosPrestados.add((Recurso) prestable);
        return true;
    }
    public boolean devolverRecurso(Prestable prestable){
        prestable.devolver();
        this.recursosPrestados.remove(prestable);
        return true;
    }
    public void listarPrestados(){
        recursosDisponibles.stream().filter(r -> r.isPrestado() == true).forEach(System.out::println);
    }

}
