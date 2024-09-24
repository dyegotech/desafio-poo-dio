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

        c1.setTitulo("Java Básico");
        c1.setDescricao("Java Backend para iniciantes");
        c1.setCargaHoraria(10);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria em Java");
        m1.setDescricao("Java para inciantes");
        m1.setData(LocalDate.now());

        // System.out.println(c1);
        // System.out.println(m1);

        // System.out.println(m1.calcularXP());
        // System.out.println(c1.calcularXP());

        Set<Conteudo> conteudos1 = new LinkedHashSet<>();

        conteudos1.add(m1);
        conteudos1.add(c1);

        Bootcamp bootcampoJava = new Bootcamp("Java Bootcamp", "Java Backend + Mentoria", conteudos1);

        // System.out.println(bootcampoJava);
        
        Dev dyego = new Dev();
        dyego.setNome("Dyego");
        dyego.inscreverBootcamp(bootcampoJava);
        
        Dev maria = new Dev();
        maria.setNome("Maria");
        maria.inscreverBootcamp(bootcampoJava);
        
        // System.out.println(bootcampoJava.getDevsInscritos()); 
        
        System.out.println("inscritos maria: " + maria.getConteudosInscritos());
        System.out.println("*******************\n");
        System.out.println("concluídos maria: " + maria.getConteudosConcluidos());
        System.out.println("*******************\n");
        
        System.out.println(maria.calcularTotalXp());
        maria.progredir(null);
        maria.progredir(null);
        System.out.println("inscritos maria: " + maria.getConteudosInscritos());
        System.out.println("*******************\n");
        System.out.println("concluídos maria: " + maria.getConteudosConcluidos());
        System.out.println("inscritos maria: " + maria.getConteudosInscritos());
        System.out.println(maria.calcularTotalXp());
        

        
        // maria.inscreverBootcamp(bootcampoJava);
        // System.out.println(dyego.getConteudosInscritos());

        // System.out.println(bootcampoJava);

    }
}
