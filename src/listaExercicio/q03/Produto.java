package listaExercicio.q03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String exibirDetalhes() {
        if(this.nome != null){
            return String.format("Nome: %s\nPreço: %.2f\nQuantidade: %d", this.nome, this.preco, this.quantidade);
        }else{
            return "Nenhum produto foi cadastrado no sistema ainda!";
        }
    }
    public String calcularValorTotal() {
        if(this.nome != null){
            return String.format("O valor total do estoque é de: %.2f",this.preco*this.quantidade);
        }else{
            return "Nenhum produto foi cadastrado no sistema ainda!";
        }

    }

}
