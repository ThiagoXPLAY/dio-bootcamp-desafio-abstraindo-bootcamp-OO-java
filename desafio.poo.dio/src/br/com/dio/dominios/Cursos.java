package br.com.dio.dominios;

public class Cursos extends Conteudos {
    private String titulo;
    private int cargaHoraria;

    @Override
    public double calcularXP(){
        return XP_PADRAO * cargaHoraria;
    }

    public Cursos(String titulo, int cargaHoraria){
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    
}
