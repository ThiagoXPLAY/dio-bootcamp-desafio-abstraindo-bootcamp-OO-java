package br.com.dio.dominios;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<devs> devsInscritos = new HashSet<>();
    private Set<conteudos> conteudos = new LinkedHashSet<>();

    public bootcamp(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<devs> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<devs> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<conteudos> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<conteudos> conteudos) {
        this.conteudos = conteudos;
    }

    
}
