import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Descrição curso Java");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Descrição curso JavaScript");

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JavaScript");
        mentoria2.setDescricao("Descrição mentoria JavaScript");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);


    }
}
