package br.com.dio.dominios;

import java.time.LocalDate;

public class Mentorias extends Conteudos {
    private LocalDate data;

    @Override
    public double calcularXP(){
        return XP_PADRAO + 20d;
    }

    public Mentorias(LocalDate data){
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    
}