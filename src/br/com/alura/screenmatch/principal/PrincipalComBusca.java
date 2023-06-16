package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.services.BuscadorFilmes;

import java.io.IOException;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        BuscadorFilmes buscador = new BuscadorFilmes();
        buscador.buscarFilmes();
    }
}
