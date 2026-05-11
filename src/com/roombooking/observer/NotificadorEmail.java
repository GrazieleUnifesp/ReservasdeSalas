package com.roombooking.observer;

import com.roombooking.model.Reserva;

// Commit 14 - Graziele
// Observador concreto: simula envio de e-mail (push)
public class NotificadorEmail implements Observador {

    @Override
    public void atualizar(Reserva reserva, String evento) {
        System.out.println("📧 [EMAIL] Para: " + reserva.getUsuario().getEmail()
                + " | Evento: " + evento
                + " | Reserva: " + reserva.getId()
                + " | Sala: " + reserva.getSala().getNome());
    }
}