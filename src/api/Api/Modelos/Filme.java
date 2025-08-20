package api.Api.Modelos;
import api.Api.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String titulo, int anoDeLancamento){
        super(titulo, anoDeLancamento);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {

        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " ("
                + this.getAnoDeLancamento() + ") ";
    }
}