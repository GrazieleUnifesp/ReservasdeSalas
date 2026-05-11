package com.roombooking.model;

// Commit 3 - Graziele
public class Professor extends Usuario {
    private String departamento;

    public Professor(String id, String nome, String email, String departamento) {
        super(id, nome, email);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }

    @Override
    public String getTipo() { return "Professor"; }
}