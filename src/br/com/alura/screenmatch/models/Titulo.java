package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb titulo) {
        this.nome = titulo.title();

        if (titulo.year().length() > 4) {
           throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 04 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(titulo.year());
        this.duracaoEmMinutos = Integer.valueOf(titulo.runtime().substring(0,2));
    }


    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    public void exibeFichaTecnica() {
        System.out.println("""
                    Nome do Filme: %s
                    Ano de Lançamento: %d
                    Duração em Minutos: %d
                    Íncluido no Plano: %b
                """.formatted(
                this.nome,
                this.anoDeLancamento,
                this.duracaoEmMinutos,
                this.incluidoNoPlano
        ));
    }

    public void avalia(int nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return """
               Titulo: %s 
               Ano de lançamento: %d 
               Duração: %d min
               """.formatted(this.getNome(), this.getAnoDeLancamento(), this.duracaoEmMinutos);
    }
}


