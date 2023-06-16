package br.com.alura.screenmatch.utils;

import br.com.alura.screenmatch.models.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscritorArquivo {
    public void escreverFilmes(List<Titulo> titulos) throws IOException {
        Gson gson = getGson();
        FileWriter escrita = new FileWriter("filmes.txt");
        escrita.write(gson.toJson(titulos));
        escrita.close();
    }

    private static Gson getGson() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        return gson;
    }
}

