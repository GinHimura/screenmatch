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

### Pacote `br.com.alura.screenmatch.principal`
Este pacote contém a classe `MainList`, que é a classe de entrada do programa e contém o método `main` para execução e teste das funcionalidades do projeto.

## Utilização
Para utilizar o projeto, você pode criar instâncias das classes `Filme`, `Serie` e `Episodio`, configurar seus atributos e usar a `CalculadoraDeTempo` para calcular o tempo total. O `FiltroRecomendacao` pode ser utilizado para filtrar e exibir recomendações com base na classificação dos títulos.

## Exemplo de Uso
Aqui está um exemplo de uso do projeto:

```java
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
```

## Contribuição

Contribuições para o projeto são bem-vindas. Se você encontrar algum problema ou tiver alguma sugestão, sinta-se à vontade para abrir uma issue ou enviar um pull request.

