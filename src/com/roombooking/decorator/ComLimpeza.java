package com.roombooking.decorator;

import com.roombooking.model.Reserva;

// Commit 19 - Graziele
// Decorator concreto: adiciona serviço de limpeza à reserva
public class ComLimpeza extends ReservaDecorator {

    public ComLimpeza(Reserva reserva) {
        super(reserva);
    }

    @Override
    public String getDescricaoExtras() {
        return "Serviço de Limpeza (antes e após o uso)";
    }

    @Override
    public double getCustoExtra() {
        return 30.0;
    }
}