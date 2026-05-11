package com.roombooking.strategy;

import com.roombooking.model.Reserva;
import java.util.List;

// Commit 11 - Ana Clara
// Política: primeiro a reservar tem prioridade (sem exceções)
public class PrimeiroAReservar implements PoliticaDeReserva {

    @Override
    public boolean permitirReserva(Reserva novaReserva, List<Reserva> reservasExistentes) {
        for (Reserva existente : reservasExistentes) {
            if (existente.getStatus() == Reserva.Status.CONFIRMADA
                    && existente.conflitaCom(novaReserva)) {
                System.out.println("❌ Conflito detectado com reserva [" + existente.getId() + "] — política: Primeiro a Reservar");
                return false;
            }
        }
        return true;
    }

    @Override
    public String getDescricao() {
        return "Primeiro a Reservar — sem prioridades por cargo";
    }
}