package com.roombooking.factory;

import com.roombooking.model.*;

// Commit 6 - Ana Clara
public class SalaLaboratorioFactory implements SalaFactory {
    private String areaConhecimento;

    public SalaLaboratorioFactory(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    @Override
    public Sala criarSala(String id, String nome, int capacidade, String localizacao) {
        return new SalaLaboratorio(id, nome, capacidade, localizacao, areaConhecimento);
    }
}