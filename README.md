# ScreenMatch

## Descrição do Projeto
O projeto ScreenMatch é um sistema para cálculos e recomendações de títulos de filmes e séries. Ele inclui classes e interfaces que representam diferentes tipos de títulos, como filmes e episódios de séries, além de uma calculadora de tempo e um filtro de recomendações. 

## Estrutura do Projeto
O projeto está organizado em pacotes da seguinte forma:

### Pacote `br.com.alura.screenmatch.calculos`
Este pacote contém as classes responsáveis pelos cálculos e filtros.

- `CalculadoraDeTempo`: Classe responsável por calcular o tempo total de duração dos títulos.
- `FiltroRecomendacao`: Classe responsável por filtrar os títulos de acordo com sua classificação.

### Pacote `br.com.alura.screenmatch.models`
Este pacote contém as classes que representam os modelos de títulos.

- `Titulo`: Classe base abstrata que define os atributos e métodos comuns a todos os títulos.
- `Filme`: Classe que representa um filme e implementa a interface `Classificavel`.
- `Serie`: Classe que representa uma série e implementa a interface `Classificavel`.
- `Episodio`: Classe que representa um episódio de uma série e implementa a interface `Classificavel`.

### Pacote principal
O pacote principal contém a classe `Main`, que é a classe de entrada do programa e contém o método `main` para execução.

## Utilização
Para utilizar o projeto, você pode criar instâncias das classes `Filme`, `Serie` e `Episodio`, configurar seus atributos e usar a `CalculadoraDeTempo` para calcular o tempo total. O `FiltroRecomendacao` pode ser utilizado para filtrar e exibir recomendações com base na classificação dos títulos.

## Exemplo de Uso
Aqui está um exemplo de uso do projeto:

```java
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        // Configurar atributos do filme...

        Filme outro = new Filme();
        // Configurar atributos do outro filme...

        Serie serie = new Serie();
        // Configurar atributos da série...

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        Episodio primeiro = new Episodio();
        // Configurar atributos do episódio...

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(filme);
        filtro.filtrar(outro);
        filtro.filtrar(primeiro);
    }
}
```

## Contribuição

Contribuições para o projeto são bem-vindas. Se você encontrar algum problema ou tiver alguma sugestão, sinta-se à vontade para abrir uma issue ou enviar um pull request.


