package com.roombooking.strategy;

import com.roombooking.model.Reserva;
import java.util.List;

// Commit 10 - Ana Clara
// Interface Strategy para política de detecção de colisões (RF-03)
public interface PoliticaDeReserva {
    /**
     * Verifica se a nova reserva pode ser criada dado o contexto atual.
     * @param novaReserva reserva que está sendo solicitada
     * @param reservasExistentes reservas já confirmadas na mesma sala
     * @return true se a reserva é permitida, false se há conflito
     */
    boolean permitirReserva(Reserva novaReserva, List<Reserva> reservasExistentes);

    String getDescricao();
}