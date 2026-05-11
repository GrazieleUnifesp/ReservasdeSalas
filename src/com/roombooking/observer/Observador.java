package com.roombooking.observer;

import com.roombooking.model.Reserva;

// Commit 13 - Graziele
// Interface Observer — suporte a push (recebe dado direto) e pull (busca dado)
public interface Observador {
    // Push: o sujeito já envia o dado atualizado
    void atualizar(Reserva reserva, String evento);

    // Pull: o observador pode consultar dados via sujeito se necessário
    default void atualizarPull(Notificavel sujeito) {
        // Implementação padrão vazia — observadores que usam pull sobrescrevem
    }
}