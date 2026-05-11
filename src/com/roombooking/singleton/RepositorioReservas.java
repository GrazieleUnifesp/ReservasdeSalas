package com.roombooking.singleton;

import com.roombooking.model.Reserva;
import com.roombooking.model.Sala;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Commit 8 - Graziele
// Singleton thread-safe usando Bill Pugh pattern
public class RepositorioReservas {

    private final List<Reserva> reservas = new ArrayList<>();

    private RepositorioReservas() {}

    private static class Holder {
        private static final RepositorioReservas INSTANCE = new RepositorioReservas();
    }

    public static RepositorioReservas getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized void adicionar(Reserva reserva) {
        reservas.add(reserva);
    }

    public synchronized void remover(Reserva reserva) {
        reservas.remove(reserva);
    }

    public synchronized List<Reserva> todas() {
        return new ArrayList<>(reservas);
    }

    public synchronized List<Reserva> porSalaEData(Sala sala, LocalDate data) {
        return reservas.stream()
                .filter(r -> r.getSala().getId().equals(sala.getId()))
                .filter(r -> r.getInicio().toLocalDate().equals(data))
                .filter(r -> r.getStatus() == Reserva.Status.CONFIRMADA)
                .collect(Collectors.toList());
    }
}