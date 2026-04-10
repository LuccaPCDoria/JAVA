package listaExercicio.q04;

import aula03.q03.Calculadora;

public class Filme {
    private String nome, genero;
    private int ano, duracao, qtdAvaliacoes;
    private double somaNotas;

    public Filme() {
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String exibirDetalhes() {
        if(this.nome != null){
            return String.format("Nome: %s\nGênero: %s\nAno de lançamento: %d\nDuração em minutos: %dm", this.nome,this.genero, this.ano, this.duracao);
        }else{
            return "Nenhum filme foi cadastrado no sistema ainda!";
        }
    }
    public void avaliar(int nota) {
        this.somaNotas += nota;
        this.qtdAvaliacoes++;
    }

    public String calcularMediaAvaliacoes() {
        if(this.nome != null){
            return String.format("A média de avaliações do filme %s é: %.1f",this.nome,(this.somaNotas/this.qtdAvaliacoes));
        }else{
            return "Nenhum filme foi cadastrado no sistema ainda!";
        }
    }
}
