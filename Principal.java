public class Principal {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Joao Silva", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria Souza", 500.0);

        ContaEspecial conta3 = new ContaEspecial("Carlos Pereira", 300.0, 500.0);
        ContaEspecial conta4 = new ContaEspecial("Ana Lima", 0.0, 1000.0);

        System.out.println("======== Movimentacoes ContaBancaria ========");
        conta1.depositar(200.0);
        conta1.sacar(150.0);
        conta1.sacar(5000.0); 

        conta2.depositar(100.0);
        conta2.sacar(700.0); 

        System.out.println();
        System.out.println("======== Movimentacoes ContaEspecial ========");
        conta3.depositar(100.0);
        conta3.sacar(600.0);  
        conta3.sacar(1000.0);

        conta4.sacar(800.0);  
        conta4.depositar(50.0);

        System.out.println();
        System.out.println("======== Extratos ========");
        conta1.extrato();
        conta2.extrato();
        conta3.extrato();
        conta4.extrato();
    }
}