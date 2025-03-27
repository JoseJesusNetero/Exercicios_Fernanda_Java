public class Conta_Bancaria_main {
    public static void main(String[] args) {
        Conta_Bancaria conta1 = new Conta_Bancaria();
        Conta_Bancaria conta2 = new Conta_Bancaria();

        conta1.adicionarSaldo(1000.0);
        System.out.println(conta1.verificarSaldo());

        conta1.transferirSaldo(conta2, 500.0);
        System.out.println(conta1.verificarSaldo());
        System.out.println(conta2.verificarSaldo());

        conta1.transferirSaldo(conta2, 600.0); // Isso falhará por saldo insuficiente
    }
}
