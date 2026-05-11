package com.roombooking.observer;

import com.roombooking.model.Reserva;

// Commit 14 - Graziele
// Observador concreto: notificação no sistema (push)
public class NotificadorSistema implements Observador {

    @Override
    public void atualizar(Reserva reserva, String evento) {
        System.out.println("🔔 [SISTEMA] Notificação para " + reserva.getUsuario().getNome()
                + ": " + evento + " — " + reserva);
    }
}