public class Conta_Bancaria {
    private double saldo;

    public Conta_Bancaria() {
        this.saldo = 0.0;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para adicionar ao saldo.");
        }
    }

    public String verificarSaldo() {
        return "Saldo atual: " + saldo;
    }

    public void transferirSaldo(Conta_Bancaria destino, double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            saldo -= valor;
            destino.adicionarSaldo(valor);
            System.out.println("Transferência realizada com sucesso.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }
}
