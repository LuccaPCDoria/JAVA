package aula08.q01;

abstract public class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.printf("O valor de %f foi despositado com sucesso!", valor);
        }else{
            System.out.printf("O valor de %f não pode ser depositado!", valor);
        }
    };
    public void sacar(double valor){
        if (valor > 0 && valor < saldo){
            saldo -= valor;
            System.out.printf("O valor de %f foi sacado com sucesso!", valor);
        }else{
            System.out.printf("O valor de %f não pode ser sacado!", valor);
        }
    }
    public abstract void exibirTipoConta();
}
