package api.Api.Principal;
import api.Api.calculos.CalculadoraDeTempo;
import api.Api.calculos.FiltroRecomendacao;
import api.Api.Modelos.Episodio;
import api.Api.Modelos.Filme;
import api.Api.Modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        Serie lost = new Serie("Lost", 2016);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);

        Filme filmeDoCaua = new Filme("Harry Potter", 2006);
        filmeDoCaua.avalia(10);
        filmeDoCaua.avalia(8);
        filmeDoCaua.avalia(8);
        System.out.println("Total de avaliações: " + filmeDoCaua.getTotalDeAvaliacoes());
    }
}