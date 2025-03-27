
import java.util.Scanner;

class  Matematica_main {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Cria um objeto Calculadora com os números fornecidos
        Matematica calc = new Matematica(num1, num2);

        // Solicita ao usuário que escolha uma operação
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        // Executa a operação escolhida usando switch case
        switch (opcao) {
            case 1:
                System.out.println("Resultado da soma: " + calc.soma());
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calc.subtracao());
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + calc.multiplicacao());
                break;
            case 4:
                System.out.println("Resultado da divisão: " + calc.divisao());
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close(); // Fecha o scanner
    }
}
