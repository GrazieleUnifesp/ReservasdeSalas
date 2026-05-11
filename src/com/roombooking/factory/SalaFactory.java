package com.roombooking.factory;

import com.roombooking.model.Sala;

// Commit 5 - Graziele
// Interface do padrão Factory Method
public interface SalaFactory {
    Sala criarSala(String id, String nome, int capacidade, String localizacao);
}