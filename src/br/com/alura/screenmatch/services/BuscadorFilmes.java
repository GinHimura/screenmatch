package br.com.alura.screenmatch.services;

import br.com.alura.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.models.Titulo;
import br.com.alura.screenmatch.models.TituloOmdb;
import br.com.alura.screenmatch.utils.EscritorArquivo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscadorFilmes {
    private final HttpClient client;
    private final Gson gson;

    public BuscadorFilmes() {
        client = HttpClient.newHttpClient();
        gson = getGson();
    }

    public void buscarFilmes() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String filme = "";
        List<Titulo> titulos = new ArrayList<>();

        while (!filme.equals("sair")) {
            System.out.println("Qual filme deseja procurar?");
            filme = sc.nextLine();

            if (filme.equals("sair")) {
                break;
            }

            try {
                var url = "https://www.omdbapi.com/?t=%s&apikey=91dd4597".formatted(filme).replace(" ", "+");

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println(response.body());

                TituloOmdb titulo = gson.fromJson(response.body(), TituloOmdb.class);
                Titulo titulo1 = new Titulo(titulo);
                System.out.println(titulo);
                System.out.println(titulo1);

                titulos.add(titulo1);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        EscritorArquivo escritor = new EscritorArquivo();
        escritor.escreverFilmes(titulos);

        System.out.println("O programa finalizou corretamente!");
    }

    private static Gson getGson() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        return gson;
    }
}
