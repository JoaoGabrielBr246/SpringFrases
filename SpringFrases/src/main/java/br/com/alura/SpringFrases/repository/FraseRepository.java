package br.com.alura.SpringFrases.repository;

import br.com.alura.SpringFrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    List<Frase> findByTitulo(String titulo);
}

