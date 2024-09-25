import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso c1 = new Curso();
        c1.setTitulo("Curso Java Básico");
        c1.setDescricao("Java Backend para iniciantes");
        c1.setCargaHoraria(10);

        Curso c2 = new Curso();
        c2.setTitulo("Curso Javascript");
        c2.setDescricao("Javascript para iniciantes");
        c2.setCargaHoraria(8);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria em Java");
        m1.setDescricao("Java para inciantes");
        m1.setData(LocalDate.now());

        Mentoria m2 = new Mentoria();
        m2.setTitulo("Mentoria em PHP");
        m2.setDescricao("PHP para inciantes");
        m2.setData(LocalDate.now());

        // System.out.println(c1);
        // System.out.println(m1);

        // System.out.printf("XP Curso (%s x %s horas) = %s", c1.getXpPadrao(),
        // c1.getCargaHoraria(), c1.calcularXP());
        // System.out.printf("\nXP Mentoria (%s + 20 xp) = %s", m1.getXpPadrao(),
        // m1.calcularXP());

        // System.out.println(c1.detalhesCalculoXP());
        // System.out.println(c2.detalhesCalculoXP());
        // System.out.println(m1.detalhesCalculoXP());
        // System.out.println(m2.detalhesCalculoXP());

        Set<Conteudo> conteudos1 = new LinkedHashSet<>();

        conteudos1.add(m1);
        conteudos1.add(c1);

        Bootcamp bootcampoJava = new Bootcamp("Bootcamp Claro Spring", "Java Backend + Mentoria", conteudos1, 3);
        
        // Detalhes do Bootcamp
        System.out.println(bootcampoJava);   

        // Matrículas

        Dev dyego = new Dev();
        dyego.setNome("Dyego");
        dyego.inscreverBootcamp(bootcampoJava);

        System.out.println("vagas restantes: " + bootcampoJava.getVagasRestantes());

        Dev maria = new Dev();
        maria.setNome("Maria");
        maria.inscreverBootcamp(bootcampoJava);

        System.out.println("vagas restantes: " + bootcampoJava.getVagasRestantes());
        
        Dev jose = new Dev();
        jose.setNome("Jose");
        jose.inscreverBootcamp(bootcampoJava);

        System.out.println("vagas restantes: " + bootcampoJava.getVagasRestantes());
        
        Dev joao = new Dev();
        joao.setNome("Joao");
        joao.inscreverBootcamp(bootcampoJava);

        System.out.println("vagas restantes: " + bootcampoJava.getVagasRestantes());

        
        // Detalhes do Bootcamp
        System.out.println(bootcampoJava);    

        // System.out.println(bootcampoJava.getDevsInscritos());

        // System.out.println("inscritos maria: " + maria.getConteudosInscritos());
        // System.out.println("*******************\n");
        // System.out.println("concluídos maria: " + maria.getConteudosConcluidos());
        // System.out.println("*******************\n");

        // System.out.println(maria.calcularTotalXp());
        // maria.progredir(null);
        // maria.progredir(null);
        // System.out.println("inscritos maria: " + maria.getConteudosInscritos());
        // System.out.println("*******************\n");
        // System.out.println("concluídos maria: " + maria.getConteudosConcluidos());
        // System.out.println("inscritos maria: " + maria.getConteudosInscritos());
        // System.out.println(maria.calcularTotalXp());

        // maria.inscreverBootcamp(bootcampoJava);
        // System.out.println(dyego.getConteudosInscritos());

        // System.out.println(bootcampoJava);

        // for (Conteudo c : bootcampoJava.getConteudos()){
        // System.out.println(c.detalhesCalculoXP());
        // }

        /* Exercícios propostos */

        // XP por conteúdos
        // System.out.println("XP por conteúdos: ");
        // bootcampoJava
        // .getConteudos()
        // .stream()
        // .map(conteudo -> conteudo.detalhesCalculoXP())
        // .forEach(System.out::println);

        // Detalhes do Bootcamp
        // System.out.println(bootcampoJava);

        // System.out.println("Devs inscritos no bootcamp");
        // bootcampoJava.getDevsInscritos().stream().forEach(System.out::println);

    }
}
