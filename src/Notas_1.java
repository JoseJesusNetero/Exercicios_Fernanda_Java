public class Notas_1 {

    String nome;

    double nota1, nota2, nota3;

    ///////

    public Notas_1(String nome, double a, double b, double c) {
        this.nome = nome;
        this.nota1 = a;
        this.nota2 = b;
        this.nota1 = c;
    }

    ///////

    public void Media() {
        System.out.print(" Sua media e " + (nota1 + nota2 + nota3) / 3 + '\n');
    }

    ///////

    public void Situacao() {

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.00) System.out.print(" Voce passou \n");

        else if (media >= 4.00) System.out.print(" Voce esta de recuperacao  \n");

        else System.out.print(" Voce reprovou \n");


    }

}
