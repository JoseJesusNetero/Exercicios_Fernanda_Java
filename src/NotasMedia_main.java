class Main {
  public static void main(String[] args) {
    
    Aluno aluno = new Aluno(8.5, 7.0, 6.5);

        // Calculando e exibindo a média
        double media = aluno.calcularMedia();
        System.out.println("Média do aluno: " + media);

        // Verificando a situação do aluno
        aluno.verificarSituacao();
    }

  }

