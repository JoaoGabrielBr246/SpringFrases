package br.com.alura.SpringFrases.controller;

import br.com.alura.SpringFrases.dto.FraseDTO;
import br.com.alura.SpringFrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series")
    public List<FraseDTO> obterTodasAsFrases() {
        return servico.obterTodasAsFrases();
    }

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria() {
        return servico.obterFraseAleatoria();
    }
}
