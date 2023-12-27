package com.hospedes.demo.model;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data_inicio;
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
}
