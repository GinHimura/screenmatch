package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainList {
    public static void main(String[] args) {
        Filme filme = new Filme("Free Guy", 2021);
        filme.avalia(10);
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(3);
        Serie serie = new Serie("The Last of Kingdom", 2015);
        serie.avalia(9);
        Filme filmeTop = new Filme("Como se fosse a primeira vez", 2004);
        filmeTop.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(outro);
        lista.add(serie);
        lista.add(filmeTop);

        for (Titulo item:lista) {
            System.out.println("Nome: %s".formatted(item.getNome()));
            if (item instanceof Filme filme1 && filme1.getClassificacao() > 2) {
                System.out.println(filme1);
            }
        }

        ArrayList<String> procurarPorAtor = new ArrayList<>();
        procurarPorAtor.add("Adam Sandler");
        procurarPorAtor.add("Zendaya");
        procurarPorAtor.add("Tom HolLand");
        procurarPorAtor.add("Ben Affleck");

        System.out.println(procurarPorAtor);

        Collections.sort(procurarPorAtor);

        System.out.println(procurarPorAtor);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println(lista);
    }
}
