package com.roombooking.strategy;

import com.roombooking.model.Professor;
import com.roombooking.model.Reserva;
import java.util.List;

// Commit 12 - Ana Clara
// Política: professores podem sobrepor reservas de estudantes em conflito
public class PrioridadeDocente implements PoliticaDeReserva {

    @Override
    public boolean permitirReserva(Reserva novaReserva, List<Reserva> reservasExistentes) {
        boolean solicitanteEProfessor = novaReserva.getUsuario() instanceof Professor;

        for (Reserva existente : reservasExistentes) {
            if (existente.getStatus() == Reserva.Status.CONFIRMADA
                    && existente.conflitaCom(novaReserva)) {

                boolean conflitanteEProfessor = existente.getUsuario() instanceof Professor;

                if (conflitanteEProfessor) {
                    // Professor não pode sobrepor outro professor
                    System.out.println("❌ Conflito com reserva de professor [" + existente.getId() + "] — não é possível sobrepor.");
                    return false;
                }

                if (solicitanteEProfessor) {
                    // Professor sobrepõe estudante: cancela reserva conflitante
                    System.out.println("⚠️  Professor com prioridade: cancelando reserva de estudante [" + existente.getId() + "]");
                    existente.setStatus(Reserva.Status.CANCELADA);
                } else {
                    // Estudante não pode sobrepor nada
                    System.out.println("❌ Conflito detectado com reserva [" + existente.getId() + "] — política: Prioridade Docente");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String getDescricao() {
        return "Prioridade Docente — professores podem sobrepor reservas de estudantes";
    }
}