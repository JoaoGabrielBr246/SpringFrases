package br.com.alura.SpringFrases.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
