package com.hospedes.demo.hospede;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HospedeService {

    @Autowired
    private HospedeRepository hospedeRepository;

    public List<Hospede> listarHospedes() {
        return hospedeRepository.findAll();
    }

    public Hospede obterHospedePorId(Long id) {
        Optional<Hospede> hospede = hospedeRepository.findById(id);
        return hospede.orElse(null);
    }

    public Hospede criarHospede(Hospede hospede) {
    if (hospede.getNome() == null || hospede.getNome().isEmpty()) {
        throw new IllegalArgumentException("O nome do hóspede não pode ser nulo ou vazio.");
    }
    return hospedeRepository.save(hospede);
}

public Hospede atualizarHospede(Long id, Hospede hospede) {
    Optional<Hospede> hospedeExistente = hospedeRepository.findById(id);
    if (hospedeExistente.isPresent()) {
        Hospede hospedeAtual = hospedeExistente.get();
        if (hospede.getNome() != null && !hospede.getNome().isEmpty()) {
            hospedeAtual.setNome(hospede.getNome());
        } else {
            throw new IllegalArgumentException("O nome do hóspede não pode ser nulo ou vazio.");
        }

        return hospedeRepository.save(hospedeAtual);
    }
    return null; 
}

    public void excluirHospede(Long id) {
        hospedeRepository.deleteById(id);
    }
}
