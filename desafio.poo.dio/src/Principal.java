import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.dominios.Bootcamp;
import br.com.dio.dominios.Conteudos;
import br.com.dio.dominios.Cursos;
import br.com.dio.dominios.Devs;
import br.com.dio.dominios.Mentorias;

public class Principal {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos("Curso Java","Descricao JAVA", 8);
        Cursos curso2 = new Cursos("Curso JS","Descricao JS", 4);

        Mentorias mentoria = new Mentorias("Mentoria JAVA", "Descricao Mentoria JAVA", LocalDate.now());
    
        Bootcamp bootcamp = new Bootcamp("Bootcamp JAVA", "Descricao Bootcamp JAVA");
        Set<Conteudos> lista = new LinkedHashSet<>();
        lista.add(curso1);
        lista.add(curso2);
        lista.add(mentoria);
        bootcamp.setConteudos(lista);

        Devs devThiago = new Devs("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thiago:" + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("Conteudos Inscritos Thiago:" + devThiago.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Thiago:" + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXP());

        Devs devRaquel = new Devs("Raquel");
        devRaquel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscrito Raquel:" + devRaquel.getConteudosInscritos());
        devRaquel.progredir();
        devRaquel.progredir();
        devRaquel.progredir();
        System.out.println("Conteudos Inscritos Raquel:" + devRaquel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Raquel:" + devRaquel.getConteudosConcluidos());
        System.out.println("XP: " + devRaquel.calcularTotalXP());
    }
}