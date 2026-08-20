public class Principal {

    public static void main(String[] args) {

        ContaBancaria conta1 =
                new ContaBancaria("Maria", 1000.00);

        ContaEspecial conta2 =
                new ContaEspecial("Duda", 500.00, 1000.00);


        System.out.println("CONTA BANCÁRIA");

        conta1.depositar(500.00);

        conta1.sacar(300.00);

        conta1.sacar(1500.00);

        conta1.extrato();

        System.out.println("\nCONTA ESPECIAL");

        conta2.depositar(200.00);

        conta2.sacar(500.00);

        conta2.sacar(800.00);

        conta2.extrato();
    }
}