package br.com.alura.SpringFrases.dto;

public record FraseDTO( Long id,
                        String titulo,
                        String frase,
                        String personagem,
                        String poster) {
}
