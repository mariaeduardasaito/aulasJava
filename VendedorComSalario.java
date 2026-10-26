public class VendedorComSalario extends Vendedor {

    private double salarioFixo;

    public VendedorComSalario(
            String nome,
            double vendasBrutas,
            double comissao,
            double salarioFixo) {

        super(nome, vendasBrutas, comissao);
        setSalarioFixo(salarioFixo);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double ganhos() {
        return getSalarioFixo() + super.ganhos();
    }

    @Override
    public String toString() {

        return String.format(
                "%s %s\n%s: %.2f",
                "Dados do vendedor:",
                super.toString(),
                "Salario fixo",
                getSalarioFixo());
    }
}