public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque invalido.");
            return;
        }
        double disponivel = getSaldo() + limite;
        if (valor <= disponivel) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso (uso de limite se necessario).");
        } else {
            System.out.println("Saldo + limite insuficientes para o saque de R$ " + valor + ".");
        }
    }

   
    @Override
    public void extrato() {
        super.extrato();
        System.out.println("Limite de credito adicional: R$ " + limite);
        System.out.println("--------------------");
    }
}