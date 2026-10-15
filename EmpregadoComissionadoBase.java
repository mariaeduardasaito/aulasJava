public class EmpregadoComissionadoBase extends EmpregadoComissionado {
    private double salarioBase;

    public EmpregadoComissionadoBase(String nome, double vendasBrutas, double comissao, double salarioBase) {
        super(nome, vendasBrutas, comissao);
        setSalarioBase(salarioBase); // armazena salário-base
    } // fim do construtor

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double ganhos() {
        return getSalarioBase() + super.ganhos();
    } // fim do método earnings

    // retorna a representação String
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "dados funcionario ", super.toString(), "salário base", getSalarioBase());
    } // fim do método toString
}