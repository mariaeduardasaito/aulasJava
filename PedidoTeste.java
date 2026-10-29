public class PedidoTeste {
    public static void main(String[] args) {

        Pedido pedidoUm = new Pedido("Eliane ", 100, 0.10);

        System.out.println("Informações do pedido: \n");
        System.out.printf("%s %s \n", "Nome do cliente ", pedidoUm.getCliente());

        System.out.printf("%s %2.2f \n", "Total ", pedidoUm.total());

        pedidoUm.setValorPedido(250); // configura o novo valor do pedido
        pedidoUm.setTaxaServico(0.15); // configura a nova taxa de serviço

        System.out.println(pedidoUm);
        System.out.printf("%s %2.2f \n", "Total ", pedidoUm.total());

        PedidoDelivery pedidoDois = new PedidoDelivery("Marcelo ", 200, 0.10, 12);

        System.out.println("Informações do pedido: \n");
        System.out.printf("%s %s \n", "Nome do cliente ", pedidoDois.getCliente());

        System.out.printf("%s %2.2f \n", "taxa de entrega ", pedidoDois.getTaxaEntrega());
        System.out.printf("%s %2.2f \n", "Total ", pedidoDois.total());

        pedidoDois.setTaxaEntrega(18);

        System.out.println("\n Exibe dados atualizados do pedido com o método toString " + pedidoDois);
        System.out.printf("%s %2.2f \n", "Total ", pedidoDois.total());
    }
}