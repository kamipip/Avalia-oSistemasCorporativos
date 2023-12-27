package com.hospedes.demo.acomodacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AcomodacaoService {

    @Autowired
    private AcomodacaoRepository acomodacaoRepository;

    public List<Acomodacao> listarAcomodacoes() {
        return acomodacaoRepository.findAll();
    }

    public Acomodacao obterAcomodacaoPorId(Long id) {
        Optional<Acomodacao> acomodacao = acomodacaoRepository.findById(id);
        return acomodacao.orElse(null);
    }

public Acomodacao criarAcomodacao(Acomodacao acomodacao) {
    if (acomodacao.getNome() == null || acomodacao.getNome().isEmpty()) {
        throw new IllegalArgumentException("O nome da acomodação não pode ser nulo ou vazio.");
    }
    if (acomodacao.getNumeroRegistro() == null || acomodacao.getNumeroRegistro().isEmpty()) {
        throw new IllegalArgumentException("O número de registro da acomodação não pode ser nulo ou vazio.");
    }

    if (acomodacao.getLocalizacao() == null || acomodacao.getLocalizacao().isEmpty()) {
        throw new IllegalArgumentException("A localização da acomodação não pode ser nula ou vazia.");
    }
    return acomodacaoRepository.save(acomodacao);
}


 public Acomodacao atualizarAcomodacao(Long id, Acomodacao acomodacao) {
    Optional<Acomodacao> acomodacaoExistente = acomodacaoRepository.findById(id);
    if (acomodacaoExistente.isPresent()) {
        Acomodacao acomodacaoAtual = acomodacaoExistente.get();
        
        if (acomodacao.getNome() != null && !acomodacao.getNome().isEmpty()) {
            acomodacaoAtual.setNome(acomodacao.getNome());
        } else {
            throw new IllegalArgumentException("O nome da acomodação não pode ser nulo ou vazio.");
        }
        return acomodacaoRepository.save(acomodacaoAtual);
    }
    return null;
}


    public void excluirAcomodacao(Long id) {
        acomodacaoRepository.deleteById(id);
    }
}
