package br.com.alura.SpringFrases.service;

import br.com.alura.SpringFrases.dto.FraseDTO;
import br.com.alura.SpringFrases.model.Frase;
import br.com.alura.SpringFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public List<FraseDTO> obterTodasAsFrases() {
        List<Frase> todasAsFrases = fraseRepository.findAll();
        return converteDados(todasAsFrases);
    }

    private List<FraseDTO> converteDados(List<Frase> frases){
        return frases.stream()
                .map(f -> new FraseDTO(f.getId(), f.getTitulo(), f.getFrase(), f.getPoster(), f.getPersonagem()))
                .collect(Collectors.toList());
    }

    public FraseDTO obterFraseAleatoria() {
        List<Frase> todasAsFrases = fraseRepository.findAll();
        if (!todasAsFrases.isEmpty()) {
            int indiceAleatorio = new Random().nextInt(todasAsFrases.size());
            Frase fraseAleatoria = todasAsFrases.get(indiceAleatorio);
            return new FraseDTO(fraseAleatoria.getId(), fraseAleatoria.getTitulo(), fraseAleatoria.getFrase(), fraseAleatoria.getPersonagem(),fraseAleatoria.getPoster());
        } else {
            return null;
        }
    }
}
