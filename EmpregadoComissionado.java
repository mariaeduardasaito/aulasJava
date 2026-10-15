public class EmpregadoComissionado extends Object {

    private String nome;
    private double vendasBrutas;
    private double comissao; // porcentagem da comissão

    public EmpregadoComissionado(String nome, double vendasBrutas, double comissao) {
        this.nome = nome;
        this.vendasBrutas = vendasBrutas;
        setComissao(comissao); // valida e armazena a taxa de comissão
    } // fim do construtor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVendasBrutas() {
          return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        if (comissao > 0.0 && comissao < 0.2) {
            this.comissao = comissao;
        } else {
            this.comissao = 0.0;
        }
    }

    public double ganhos() {
        return vendasBrutas * comissao;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: %.2f\n%s: %.2f",
                "empregado comissionado", getNome(),
                "vendas brutas", getVendasBrutas(),
                "taxa de comissao", getComissao());
    } // fim do método toString
}