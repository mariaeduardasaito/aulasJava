public class Pedido extends Object {

    private String cliente;
    private double valorPedido;
    private double taxaServico; // porcentagem da taxa de serviço

    public Pedido(String cliente, double valorPedido, double taxaServico) {
        this.cliente = cliente;
        this.valorPedido = valorPedido;
        setTaxaServico(taxaServico); // valida e armazena a taxa de serviço
    } // fim do construtor

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        if (taxaServico > 0.0 && taxaServico < 0.2) {
            this.taxaServico = taxaServico;
        } else {
            this.taxaServico = 0.0;
        }
    }

    public double total() {
        return valorPedido + (valorPedido * taxaServico);
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: %.2f\n%s: %.2f",
                "pedido do cliente", getCliente(),
                "valor do pedido", getValorPedido(),
                "taxa de servico", getTaxaServico());
    } // fim do método toString
}