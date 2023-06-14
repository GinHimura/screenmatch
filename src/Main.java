import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Free Guy");
        filme.setAnoDeLancamento(2021);
        filme.setDuracaoEmMinutos(115);
        filme.setIncluidoNoPlano(true);
        filme.avalia(5);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("The Last of Kingdom");
        serie.setAnoDeLancamento(2015);
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
    }
}
