package br.com.dio.dominios;

public class Cursos extends Conteudos {
    private int cargaHoraria;

    @Override
    public double calcularXP(){
        return XP_PADRAO * cargaHoraria;
    }

    public Cursos(String titulo, String descricao, int cargaHoraria){
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
