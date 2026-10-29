public class VendedorTeste {

    public static void main(String[] args) {

        Vendedor vendedorUm = new Vendedor("Eliane", 1000, 0.10);

        System.out.println("Informacoes do vendedor:\n");

        System.out.printf("%s %s \n",
                "Nome do vendedor", vendedorUm.getNome());

        System.out.printf("%s %2.2f \n",
                "Comissao recebida", vendedorUm.ganhos());

        vendedorUm.setVendasBrutas(5000);
        vendedorUm.setComissao(0.15);

        System.out.println(vendedorUm);

        System.out.printf("%s %2.2f \n",
                "Comissao recebida", vendedorUm.ganhos());

        VendedorComSalario vendedorDois =
                new VendedorComSalario("Marcelo", 2000, 0.10, 650);

        System.out.println("\nInformacoes do vendedor:\n");

        System.out.printf("%s %s \n",
                "Nome do vendedor", vendedorDois.getNome());

        System.out.printf("%s %2.2f \n",
                "Salario fixo", vendedorDois.getSalarioFixo());

        System.out.printf("%s %2.2f \n",
                "Ganhos totais", vendedorDois.ganhos());

        vendedorDois.setSalarioFixo(750);

        System.out.println(
                "\nExibe dados atualizados do vendedor:"
                        + vendedorDois);

        System.out.printf("%s %2.2f \n",
                "Ganhos totais", vendedorDois.ganhos());
    }
}