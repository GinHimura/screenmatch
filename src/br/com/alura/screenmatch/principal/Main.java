package br.com.alura.screenmatch.principal;


import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Free Guy", 2021);
        filme.setDuracaoEmMinutos(115);
        filme.setIncluidoNoPlano(true);
        filme.avalia(9);

        Filme outro = new Filme("John Wick", 2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);
        outro.avalia(5);

        Serie serie = new Serie("The Last of Kingdom", 2015);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(8);
        serie.setMinutosPorEpisodio(59);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: %d\n".formatted(calculadora.getTempoTotal()));

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(filme);
        filtro.filtrar(outro);
        filtro.filtrar(primeiro);

        Filme filmeTop = new Filme("Como se fosse a primeira vez", 2004);
        filmeTop.setDuracaoEmMinutos(99);
        filmeTop.setIncluidoNoPlano(true);
        filmeTop.avalia(10);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme);
        filmes.add(outro);
        filmes.add(filmeTop);

        System.out.println("Tamanho da lista %d".formatted(filmes.size()));
        System.out.println(filmes.get(0).getNome());
        System.out.println("\n" + filmes);
    }
}
