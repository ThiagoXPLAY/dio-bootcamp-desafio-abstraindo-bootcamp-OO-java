package br.com.dio.dominios;

public abstract class Conteudos{
    protected static final double XP_PADRAO = 10d;
    
    private String titulo;
    private String Descricao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    
}