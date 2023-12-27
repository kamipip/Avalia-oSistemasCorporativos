package com.hospedes.demo.anfitriao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnfitriaoRepository extends JpaRepository<Anfitriao, Long> {
    // adicionar métodos 
}
