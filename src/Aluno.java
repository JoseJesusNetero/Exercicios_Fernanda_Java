
public class Aluno {
    // Atributos privados
    private double nota1;
    private double nota2;
    private double nota3;

    // Construtor
    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Métodos get e set para cada atributo
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para verificar a situação do aluno
    public void verificarSituacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 4) {
            System.out.println("Em recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
    }
    // Método main para testar a classe
    