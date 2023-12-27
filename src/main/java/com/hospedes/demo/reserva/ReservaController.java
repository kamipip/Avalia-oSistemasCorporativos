package com.hospedes.demo.reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public ResponseEntity<List<Reserva>> listarReserva() {
        List<Reserva> reservas = reservaService.listarReservas();
        return new ResponseEntity<>(reservas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reserva> obterReservaPorId(@PathVariable Long id) {
        Reserva reserva = reservaService.obterReservaPorId(id);
        return new ResponseEntity<>(reserva, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reserva> criarReserva(@Valid @RequestBody Reserva reserva) {
        Reserva novaReserva = reservaService.criarReserva(reserva);
        return new ResponseEntity<>(novaReserva, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reserva> atualizarReserva(@PathVariable Long id, @Valid @RequestBody Reserva reserva) {
        Reserva reservaAtualizada = reservaService.atualizarReserva(id, reserva);
        return new ResponseEntity<>(reservaAtualizada, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirReserva(@PathVariable Long id) {
        reservaService.excluirReserva(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
