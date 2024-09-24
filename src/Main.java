import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso c1 = new Curso();

        c1.setTitulo("Java Básico");
        c1.setDescricao("Java Backend para iniciantes");
        c1.setCargaHoraria(200);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria em Java");
        m1.setDescricao("Java para inciantes");
        m1.setData(LocalDate.now());

        System.out.println(c1);
        System.out.println(m1);

        System.out.println(m1.calcularXP());
        System.out.println(c1.calcularXP());
    }
}
