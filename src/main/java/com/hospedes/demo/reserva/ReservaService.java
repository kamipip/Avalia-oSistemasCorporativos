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
        // Implementar a lógica
        return reservaRepository.save(reserva);
    }

    public Reserva atualizarReserva(Long id, Reserva reserva) {
        
        if (reservaRepository.existsById(id)) {
            // Implementar a lógica 
            reserva.setId(id);
            return reservaRepository.save(reserva);
        }
        return null; 
    }

    public void excluirReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
