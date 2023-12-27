package com.hospedes.demo.anfitriao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/anfitrioes")
public class AnfitriaoController {

    @Autowired
    private AnfitriaoService anfitriaoService;

    @GetMapping
    public ResponseEntity<List<Anfitriao>> listarAnfitrioes() {
        List<Anfitriao> anfitrioes = anfitriaoService.listarAnfitrioes();
        return new ResponseEntity<>(anfitrioes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anfitriao> obterAnfitriaoPorId(@PathVariable Long id) {
        Anfitriao anfitriao = anfitriaoService.obterAnfitriaoPorId(id);
        return new ResponseEntity<>(anfitriao, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Anfitriao> criarAnfitriao(@Valid @RequestBody Anfitriao anfitriao) {
        Anfitriao novoAnfitriao = anfitriaoService.criarAnfitriao(anfitriao);
        return new ResponseEntity<>(novoAnfitriao, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anfitriao> atualizarAnfitriao(@PathVariable Long id, @Valid @RequestBody Anfitriao anfitriao) {
        Anfitriao anfitriaoAtualizado = anfitriaoService.atualizarAnfitriao(id, anfitriao);
        return new ResponseEntity<>(anfitriaoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirAnfitriao(@PathVariable Long id) {
        anfitriaoService.excluirAnfitriao(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
