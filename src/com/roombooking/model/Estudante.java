package com.roombooking.model;

// Commit 3 - Graziele
public class Estudante extends Usuario {
    private String matricula;

    public Estudante(String id, String nome, String email, String matricula) {
        super(id, nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }

    @Override
    public String getTipo() { return "Estudante"; }
}