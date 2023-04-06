package br.com.dio.dominios;

import java.time.LocalDate;

public class Mentorias extends Conteudos {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentorias(String titulo, String descricao, LocalDate data){
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public double calcularXP(){
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    
}