package com.roombooking.factory;

import com.roombooking.model.*;

// Commit 6 - Ana Clara
public class SalaGrupoFactory implements SalaFactory {
    @Override
    public Sala criarSala(String id, String nome, int capacidade, String localizacao) {
        return new SalaGrupo(id, nome, capacidade, localizacao);
    }
}