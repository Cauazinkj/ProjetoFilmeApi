package api.Api.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import api.Api.Modelos.Filme;
import api.Api.Modelos.Serie;
import api.Api.Modelos.Titulo;

public class PrincipalComLista {
    public static void main(String[] args) {
        Serie lost = new Serie("Lost", 2016);
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoCaua = new Filme("Harry Potter", 2006);

        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        lista.add(filmeDoCaua);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        ArrayList<String> buscaArtistas = new ArrayList<>();
        buscaArtistas.add("Cauã de Paula");
        buscaArtistas.add("Ana Luisa");

        Collections.sort(buscaArtistas);

        for (String artista : buscaArtistas) {
            System.out.println(artista);
        }

        Collections.sort(lista);

        for (Titulo titulo : lista) {
            System.out.println(titulo);
        }

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
