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
- `TituloOmdb`: Classe que representa os dados obtidos da API do OMDB.

### Pacote `br.com.alura.screenmatch.principal`
Este pacote contém a classe `MainList`, que é a classe de entrada do programa e contém o método `main` para execução e teste das funcionalidades do projeto.
- `PrincipalComBusca`: Classe que permite a busca de títulos na API do OMDB e armazena os resultados em um arquivo JSON.

### Pacote `br.com.alura.screenmatch.service`
Este pacote contém a classe `BuscadorFilmes`, que é responsável por realizar a busca de filmes na API do OMDB.

### Pacote `br.com.alura.screenmatch.util`
Este pacote contém a classe `EscritorArquivo`, que é responsável por escrever os resultados da busca em um arquivo.

## Utilização
Para utilizar o projeto, você pode criar instâncias das classes `Filme`, `Serie` e `Episodio`, configurar seus atributos e usar a `CalculadoraDeTempo` para calcular o tempo total. O `FiltroRecomendacao` pode ser utilizado para filtrar e exibir recomendações com base na classificação dos títulos. A classe `PrincipalComBusca` permite a busca de títulos na API do OMDB e armazena os resultados em um arquivo JSON.

## Contribuição
Contribuições para o projeto são bem-vindas. Se você encontrar algum problema ou tiver alguma sugestão, sinta-se à vontade para abrir uma issue ou enviar um pull request.
