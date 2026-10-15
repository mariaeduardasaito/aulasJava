public class EmpregadoComissionadoTeste {
    public static void main(String[] args) {

        EmpregadoComissionado empregadoUm = new EmpregadoComissionado("Eliane", 1000, 0.10);

        System.out.println("Informações do empregado: \n");
        System.out.printf("%s %s \n", "Nome do empregado", empregadoUm.getNome());

        System.out.printf("%s %2.2f \n", "Ganhos", empregadoUm.ganhos());

        empregadoUm.setVendasBrutas(5000); // configura as novas vendas brutas
        empregadoUm.setComissao(0.15); // configura a nova taxa de comissão

        System.out.println(empregadoUm);
        System.out.printf("%s %2.2f \n", "Ganhos", empregadoUm.ganhos());

        EmpregadoComissionadoBase empregadoDois = new EmpregadoComissionadoBase("Marcelo", 2000, 0.10, 650);

        System.out.println("Informações do empregado: \n");
        System.out.printf("%s %s \n", "Nome do empregado", empregadoDois.getNome());

        System.out.printf("%s %2.2f \n", "salario base ", empregadoDois.getSalarioBase());
        System.out.printf("%s %2.2f \n", "Ganhos", empregadoDois.ganhos());

        empregadoDois.setSalarioBase(750);

        System.out.println("\n Exibe dados atualizados do funcionario com o método toString" + empregadoDois);
        System.out.printf("%s %2.2f \n", "Ganhos", empregadoDois.ganhos());
    }
}