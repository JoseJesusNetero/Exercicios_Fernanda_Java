public class Matematica {
    // Atributos privados
    private double num1;
    private double num2;

    // Construtor
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Metodo para somar os dois numeroa
    public double soma() {
        return num1 + num2;
    }

    // Método para subtrair o maior número pelo menor
    public double subtracao() {
        return (num1 > num2) ? num1 - num2 : num2 - num1;
    }

    // Método para multiplicar os dois números
    public double multiplicacao() {
        return num1 * num2;
    }

    // Método para dividir os dois números, verificando se o divisor é zero
    public double divisao() {
        
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0.0 ;
        }
        
        return num1 / num2;
    }


    // Métodos get e set para cada atributo
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    }
