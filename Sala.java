package com.roombooking.model;

// Commit 3 - Graziele
public abstract class Sala {
    private String id;
    private String nome;
    private int capacidade;
    private String localizacao;

    public Sala(String id, String nome, int capacidade, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public int getCapacidade() { return capacidade; }
    public String getLocalizacao() { return localizacao; }

    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + " — " + nome + " | Cap: " + capacidade + " | Local: " + localizacao;
    }
}