package com.hospedes.demo.acomodacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcomodacaoRepository extends JpaRepository<Acomodacao, Long> {
    //adicionar métodos 
}
