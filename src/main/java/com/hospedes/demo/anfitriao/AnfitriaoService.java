package com.hospedes.demo.anfitriao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AnfitriaoService {

    @Autowired
    private AnfitriaoRepository anfitriaoRepository;

    public List<Anfitriao> listarAnfitrioes() {
        return anfitriaoRepository.findAll();
    }

    public Anfitriao obterAnfitriaoPorId(Long id) {
        Optional<Anfitriao> anfitriao = anfitriaoRepository.findById(id);
        return anfitriao.orElse(null);
    }

public Anfitriao criarAnfitriao(Anfitriao anfitriao) {
    if (anfitriao.getNome() == null || anfitriao.getNome().isEmpty()) {
        throw new IllegalArgumentException("O nome do anfitrião não pode ser nulo ou vazio.");
    }
    return anfitriaoRepository.save(anfitriao);
}


public Anfitriao atualizarAnfitriao(Long id, Anfitriao anfitriao) {
    Optional<Anfitriao> anfitriaoExistente = anfitriaoRepository.findById(id);
    if (anfitriaoExistente.isPresent()) {
        
        Anfitriao anfitriaoAtual = anfitriaoExistente.get();
        if (anfitriao.getNome() != null && !anfitriao.getNome().isEmpty()) {
            anfitriaoAtual.setNome(anfitriao.getNome());
        } else {
            throw new IllegalArgumentException("O nome do anfitrião não pode ser nulo ou vazio.");
        }
        
        return anfitriaoRepository.save(anfitriaoAtual);
    }
    return null; 
}


    public void excluirAnfitriao(Long id) {
        anfitriaoRepository.deleteById(id);
    }
}
