package com.roombooking.decorator;

import com.roombooking.model.Reserva;

// Commit 18 - Graziele
// Classe base do padrão Decorator para Reserva
public abstract class ReservaDecorator {
    protected Reserva reserva;

    public ReservaDecorator(Reserva reserva) {
        this.reserva = reserva;
    }

    public abstract String getDescricaoExtras();
    public abstract double getCustoExtra();

    public Reserva getReserva() { return reserva; }

    @Override
    public String toString() {
        return reserva.toString() + " | Extras: " + getDescricaoExtras()
                + " | Custo extra: R$" + getCustoExtra();
    }
}