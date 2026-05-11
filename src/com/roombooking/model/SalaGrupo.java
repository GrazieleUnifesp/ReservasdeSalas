package com.roombooking.model;

// Commit 4 - Ana Clara
public class SalaGrupo extends Sala {
    public SalaGrupo(String id, String nome, int capacidade, String localizacao) {
        super(id, nome, capacidade, localizacao);
    }

    @Override
    public String getTipo() { return "Sala de Grupo"; }
}