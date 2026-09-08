public class GerarColecionaveis {
    public static void main(String[] args) {
        Pintura pinturaUm = new Pintura("Mona Lisa", 0, 1503);
        pinturaUm.calcularIdade(2015);
        System.out.println(pinturaUm);
        System.out.println("idade da pintura " + pinturaUm.getIdade());

        System.out.println("");

        Moeda moedaUm = new Moeda("Dracma de Prata", 0, 1910, 0);
        moedaUm.calcularIdade(2015);
        System.out.println(moedaUm);
        System.out.println("idade da moeda " + moedaUm.getIdade());
    }
}
