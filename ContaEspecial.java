public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {

        if (valor > 0 && valor <= getSaldo() + limite) {

            alterarSaldo(-valor);

            System.out.println("Saque realizado: R$ " + valor);

            if (getSaldo() < 0) {
                System.out.println(
                    "Foi utilizado R$ " + Math.abs(getSaldo())
                    + " do limite especial."
                );
            }

        } else {
            System.out.println("Saldo e limite insuficientes.");
        }
    }

    @Override
    public void extrato() {
        System.out.println("\n===== EXTRATO CONTA ESPECIAL =====");
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Limite: R$ " + limite);
        System.out.println(
            "Disponível: R$ " + (getSaldo() + limite)
        );
        System.out.println("===================================");
    }

    public double getLimite() {
        return limite;
    }
}