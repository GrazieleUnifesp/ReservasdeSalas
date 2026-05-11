package com.roombooking.decorator;

import com.roombooking.model.Reserva;

// Commit 18 - Graziele
// Decorator concreto: adiciona equipamento multimídia à reserva
public class ComMultimidia extends ReservaDecorator {

    public ComMultimidia(Reserva reserva) {
        super(reserva);
    }

    @Override
    public String getDescricaoExtras() {
        return "Equipamento Multimídia (projetor + caixas de som)";
    }

    @Override
    public double getCustoExtra() {
        return 50.0;
    }
}