package com.hospedes.demo.reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    public Reserva obterReservaPorId(Long id) {
        Optional<Reserva> reserva = reservaRepository.findById(id);
        return reserva.orElse(null);
    }

public Reserva criarReserva(Reserva reserva) {
    if (reserva.getDataInicio() == null) {
        throw new IllegalArgumentException("A data de início da reserva não pode ser nula.");
    }
    if (reserva.getDataFim() == null) {
        throw new IllegalArgumentException("A data de fim da reserva não pode ser nula.");
    }

    return reservaRepository.save(reserva);
}

public Reserva atualizarReserva(Long id, Reserva reserva) {
    Optional<Reserva> reservaExistente = reservaRepository.findById(id);
    if (reservaExistente.isPresent()) {
        Reserva reservaAtual = reservaExistente.get();
        if (reserva.getDataInicio() != null) {
            reservaAtual.setDataInicio(reserva.getDataInicio());
        } else {
            throw new IllegalArgumentException("A data de início da reserva não pode ser nula.");
        }
        if (reserva.getDataFim() != null) {
            reservaAtual.setDataFim(reserva.getDataFim());
        } else {
            throw new IllegalArgumentException("A data de fim da reserva não pode ser nula.");
        }

        return reservaRepository.save(reservaAtual);
    }
    return null; 
}


    public void excluirReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
