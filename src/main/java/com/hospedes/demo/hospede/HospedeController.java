package com.hospedes.demo.hospede;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/hospedes")
public class HospedeController {

    @Autowired
    private HospedeService hospedeService;

    @GetMapping
    public ResponseEntity<List<Hospede>> listarHospedes() {
        List<Hospede> hospedes = hospedeService.listarHospedes();
        return new ResponseEntity<>(hospedes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hospede> obterHospedePorId(@PathVariable Long id) {
        Hospede hospede = hospedeService.obterHospedePorId(id);
        return new ResponseEntity<>(hospede, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Hospede> criarHospede(@Valid @RequestBody Hospede hospede) {
        Hospede novoHospede = hospedeService.criarHospede(hospede);
        return new ResponseEntity<>(novoHospede, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hospede> atualizarHospede(@PathVariable Long id, @Valid @RequestBody Hospede hospede) {
        Hospede hospedeAtualizado = hospedeService.atualizarHospede(id, hospede);
        return new ResponseEntity<>(hospedeAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirHospede(@PathVariable Long id) {
        hospedeService.excluirHospede(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
