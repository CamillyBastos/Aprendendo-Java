package flamingo.aprendendo.listapoo.dominio;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia(double nota01, double nota02) {
        return (nota01 + nota02) / 2;
    }
}
