package aula04.q01;

public class Produto {
    private String nome, cor;
    private double valor;
    private int codigo = 1, peso, tamanho, quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    public String realizarVenda(double valorPago, int quantidade, int formaPagamento){

        if(quantidade > this.quantidade){
            return "Estoque insuficiente!";
        }

        double total = this.valor * quantidade;

        if(formaPagamento == 1 || formaPagamento == 2 || formaPagamento == 3){

            double valorFinal = total * 0.95;

            if(valorPago >= valorFinal){
                this.quantidade -= quantidade;

                if(formaPagamento == 2 && valorPago > valorFinal){
                    double troco = valorPago - valorFinal;
                    return String.format("Pagamento OK! Troco: %.2f", troco);
                }

                return "Pagamento OK com desconto!";
            } else {
                return "Valor insuficiente!";
            }

        } else if(formaPagamento == 4){

            double parcela = total / 3;
            this.quantidade -= quantidade;

            return String.format("Pagamento em 3x de %.2f", parcela);

        } else {
            return "Forma de pagamento inválida!";
        }
    }

}
