package br.com.dio.dominios;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Devs {
    private String nome;
    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();

    public Devs(String nome){
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); // adiciona todos os conteudos do bootcamp
        bootcamp.getDevsInscritos().add(this); // inclui o dev atual na lista de inscritos do bootcamp
    }

    public void progredir(){
        Optional<Conteudos> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você Não Está Matriculado Em Nenhum Conteúdo!");
        }
    }

    public double calcularTotalXP() {
        Iterator<Conteudos> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXP();
            soma += next;
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudos> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}
