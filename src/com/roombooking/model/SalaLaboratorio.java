package com.roombooking.model;

// Commit 4 - Ana Clara
public class SalaLaboratorio extends Sala {
    private String areaConhecimento;

    public SalaLaboratorio(String id, String nome, int capacidade, String localizacao, String areaConhecimento) {
        super(id, nome, capacidade, localizacao);
        this.areaConhecimento = areaConhecimento;
    }

    public String getAreaConhecimento() { return areaConhecimento; }

    @Override
    public String getTipo() { return "Laboratório (" + areaConhecimento + ")"; }
}