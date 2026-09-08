public class Pintura extends ObjetoColecionavel {
    private int anoCriacao;

    public Pintura(String nome, int idade, int anoCriacao) {
        super(nome, idade);
        this.setAnoCriacao(anoCriacao);
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public void calcularIdade(int anoAtual) {
        this.setIdade(anoAtual - this.anoCriacao);
    }

    @Override
    public String toString() {
        return super.toString() + " criada em " + this.anoCriacao;
    }
}
