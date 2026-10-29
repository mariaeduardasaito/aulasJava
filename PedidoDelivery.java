public class PedidoDelivery extends Pedido {
    private double taxaEntrega;

    public PedidoDelivery(String cliente, double valorPedido, double taxaServico, double taxaEntrega) {
        super(cliente, valorPedido, taxaServico);
        setTaxaEntrega(taxaEntrega); // armazena taxa de entrega
    } // fim do construtor

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double total() {
        return getTaxaEntrega() + super.total();
    } // fim do método total

    // retorna a representação String
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "dados do pedido ", super.toString(), "taxa de entrega", getTaxaEntrega());
    } // fim do método toString
}