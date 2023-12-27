package com.hospedes.demo.reserva;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @FutureOrPresent(message = "A data de check-in deve ser no presente ou no futuro")
    private Date data_inicio;
    @Future(message = "A data de check-out deve ser no futuro")
    private Date data_fim;
    private String acomodacao_reservada;
    private String hospede;

    public Long getId() {
        return id;
    }

    public Date getDataInicio() {
        return data_inicio;
    }

    public Date getDataFim() {
        return data_fim;
    }

    public String getAcomodacaoReservada() {
        return acomodacao_reservada;
    }

    public String getHospede() {
        return hospede;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setDataInicio(Date dataInicio) {
        this.data_inicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.data_fim = dataFim;
    }

    public void setAcomodacaoReservada(String acomodacaoReservada) {
        this.acomodacao_reservada = acomodacaoReservada;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public Reserva obterReservaPorId(Long id2) {
        return null;
    }

    public List<Reserva> listarReserva() {
        return null;
    }

    public Reserva criarReserva(@Valid Reserva reserva) {
        return null;
    }

    public Reserva atualizarReserva(Long id2, @Valid Reserva reserva) {
        return null;
    }

    public void excluirReserva(Long id2) {
    }
}
