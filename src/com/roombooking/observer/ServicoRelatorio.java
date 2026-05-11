package com.roombooking.observer;

import com.roombooking.model.Reserva;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

// Commit 15 - Graziele
// Observador de relatório diário — usa estratégia pull para buscar estado completo (RF-05)
public class ServicoRelatorio implements Observador {

    @Override
    public void atualizar(Reserva reserva, String evento) {
        // Push: apenas registra o evento pontual
        System.out.println("📋 [RELATÓRIO] Evento registrado: " + evento + " | Reserva: " + reserva.getId());
    }

    @Override
    public void atualizarPull(Notificavel sujeito) {
        // Pull: busca todas as reservas do sujeito e gera relatório do dia
        List<Reserva> todas = sujeito.getReservasAtuais();
        LocalDate hoje = LocalDate.now();

        List<Reserva> doDia = todas.stream()
                .filter(r -> r.getInicio().toLocalDate().equals(hoje))
                .filter(r -> r.getStatus() == Reserva.Status.CONFIRMADA)
                .collect(Collectors.toList());

        System.out.println("\n========== 📅 RELATÓRIO DIÁRIO — " + hoje + " ==========");
        if (doDia.isEmpty()) {
            System.out.println("  Nenhuma reserva confirmada para hoje.");
        } else {
            doDia.forEach(r -> System.out.println("  • " + r));
        }
        System.out.println("==================================================\n");
    }
}