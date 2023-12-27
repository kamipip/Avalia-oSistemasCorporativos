package com.hospedes.demo.acomodacao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class Acomodacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String localizacao;
    private String numero_registro;
    
    @Min(value = 1, message = "A capacidade deve ser pelo menos 1")
    private String quartos_disponiveis;
    private String anfitriao;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getNumeroRegistro() {
        return numero_registro;
    }

    public String getQuartosDisponiveis() {
        return quartos_disponiveis;
    }

    public String getAnfitriao() {
        return anfitriao;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numero_registro = numeroRegistro;
    }

    public void setQuartosDisponiveis(String quartosDisponiveis) {
        this.quartos_disponiveis = quartosDisponiveis;
    }

    public void setAnfitriao(String anfitriao) {
        this.anfitriao = anfitriao;
    }
}
