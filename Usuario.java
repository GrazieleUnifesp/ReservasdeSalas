package com.roombooking.model;

// Commit 2 - Graziele
public abstract class Usuario {
    private String id;
    private String nome;
    private String email;

    public Usuario(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + " [" + nome + " | " + email + "]";
    }
}