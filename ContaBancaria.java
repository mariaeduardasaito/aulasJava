public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque invalido.");
            return;
        }
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$ " + valor + ".");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de deposito invalido.");
            return;
        }
        saldo += valor;
        System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
    }

    public void extrato() {
        System.out.println("----- Extrato -----");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("--------------------");
    }
}