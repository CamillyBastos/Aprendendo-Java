package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Ruan";
        aluno.nota1 = 5.5;
        aluno.nota2 = 7;

        System.out.printf("""
                Nome do aluno: %s
                Nota 01 do aluno: %.2f
                Nota 02 do aluno: %.2f
                Nota Final: %.2f
                """, aluno.nome, aluno.nota1 , aluno.nota2, aluno.calcularMedia(5.5, 7));

    }
}
