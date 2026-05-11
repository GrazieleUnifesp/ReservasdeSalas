package com.roombooking.observer;

import com.roombooking.model.Reserva;
import java.util.List;

// Commit 13 - Graziele
// Interface do sujeito (subject) no padrão Observer
public interface Notificavel {
    void adicionarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores(Reserva reserva, String evento);

    // Permite pull: observadores consultam estado atual do sujeito
    List<Reserva> getReservasAtuais();
}