public class Moeda extends ObjetoColecionavel {
    private int anoCunhagem;
    private int numeroDesgastes;

    public Moeda(String nome, int idade, int anoCunhagem, int numeroDesgastes) {
        super(nome, idade);
        this.anoCunhagem = anoCunhagem;
        this.numeroDesgastes = numeroDesgastes;
    }

    public int getAnoCunhagem() {
        return anoCunhagem;
    }

    public void setAnoCunhagem(int anoCunhagem) {
        this.anoCunhagem = anoCunhagem;
    }

    public int getNumeroDesgastes() {
        return numeroDesgastes;
    }

    public void setNumeroDesgastes(int numeroDesgastes) {
        this.numeroDesgastes = numeroDesgastes;
    }

    public void calcularIdade(int anoAtual) {
        this.numeroDesgastes = anoAtual - this.anoCunhagem;
        this.setIdade(this.numeroDesgastes);
    }

    @Override
    public String toString() {
        return super.toString()
                + " ano de cunhagem " + this.anoCunhagem
                + " número de desgastes " + this.numeroDesgastes;
    }
}
