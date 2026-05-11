package com.roombooking.model;

// Commit 4 - Ana Clara
public class SalaIndividual extends Sala {
    public SalaIndividual(String id, String nome, String localizacao) {
        super(id, nome, 1, localizacao);
    }

    @Override
    public String getTipo() { return "Sala Individual"; }
}