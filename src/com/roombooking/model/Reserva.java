package com.roombooking.model;

import java.time.LocalDateTime;
import java.util.UUID;

// Commit 7 - Graziele
public class Reserva {
    public enum Status { CONFIRMADA, CANCELADA, MODIFICADA }

    private String id;
    private Sala sala;
    private Usuario usuario;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Status status;

    public Reserva(Sala sala, Usuario usuario, LocalDateTime inicio, LocalDateTime fim) {
        this.id = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.sala = sala;
        this.usuario = usuario;
        this.inicio = inicio;
        this.fim = fim;
        this.status = Status.CONFIRMADA;
    }

    public String getId() { return id; }
    public Sala getSala() { return sala; }
    public Usuario getUsuario() { return usuario; }
    public LocalDateTime getInicio() { return inicio; }
    public LocalDateTime getFim() { return fim; }
    public Status getStatus() { return status; }

    public void setInicio(LocalDateTime inicio) { this.inicio = inicio; }
    public void setFim(LocalDateTime fim) { this.fim = fim; }
    public void setStatus(Status status) { this.status = status; }

    public boolean conflitaCom(Reserva outra) {
        if (!this.sala.getId().equals(outra.sala.getId())) return false;
        return this.inicio.isBefore(outra.fim) && this.fim.isAfter(outra.inicio);
    }

    @Override
    public String toString() {
        return "[" + id + "] " + sala.getNome() + " | " + usuario.getNome()
                + " | " + inicio + " → " + fim + " | " + status;
    }
}