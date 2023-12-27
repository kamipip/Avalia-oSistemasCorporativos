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
        // Implementar a lógica
        return acomodacaoRepository.save(acomodacao);
    }

    public Acomodacao atualizarAcomodacao(Long id, Acomodacao acomodacao) {
        
        if (acomodacaoRepository.existsById(id)) {
            // Implementar a lógica 
            acomodacao.setId(id);
            return acomodacaoRepository.save(acomodacao);
        }
        return null; 
    }

    public void excluirAcomodacao(Long id) {
        acomodacaoRepository.deleteById(id);
    }
}
