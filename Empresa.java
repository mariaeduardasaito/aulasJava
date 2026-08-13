public class Empresa {
    public static void main(String[] args) {

        Funcionario funcionarioUm = new Funcionario("Carlos", 2500.00);
        System.out.println(funcionarioUm);

        Gerente gerenteUm = new Gerente(1500.00, "Ana", 5000.00);
        System.out.println(gerenteUm);

        gerenteUm.setSalario(6000.00);
        System.out.println("Novo salario do gerente: " + gerenteUm.getSalario());
    }
}