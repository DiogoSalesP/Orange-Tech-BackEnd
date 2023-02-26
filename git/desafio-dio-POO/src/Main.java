import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Orange Tech + BackEnd");
        bootcamp.setDescricao("Descrição Bootcamp Orange Tech + BackEnd");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiogo = new Dev();
        devDiogo.setNome("Diogo");
        devDiogo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Diogo" + devDiogo.getConteudosInscritos());
        devDiogo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Diogo" + devDiogo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Diogo" + devDiogo.getConteudosConcluidos());
        System.out.println("XP:" + devDiogo.calcularTotalXp());
        System.out.println("--------------");

        Dev devLais = new Dev();
        devLais.setNome("Lais");
        devLais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lais" + devLais.getConteudosInscritos());
        devLais.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lais" + devLais.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lais" + devLais.getConteudosConcluidos());
        System.out.println("XP:" + devLais.calcularTotalXp());
        System.out.println("--------------");



    }
}