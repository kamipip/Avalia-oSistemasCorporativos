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
        // Implementar a lógica de validação
        return anfitriaoRepository.save(anfitriao);
    }

    public Anfitriao atualizarAnfitriao(Long id, Anfitriao anfitriao) {
        if (anfitriaoRepository.existsById(id)) {
            // Implementar a lógica de validação 
            anfitriao.setId(id);
            return anfitriaoRepository.save(anfitriao);
        }
        return null; 
    }

    public void excluirAnfitriao(Long id) {
        anfitriaoRepository.deleteById(id);
    }
}
