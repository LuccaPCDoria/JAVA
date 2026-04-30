package aula08.q01;

public final class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo,double taxaRendimento){
        super(titular , saldo);
        this.taxaRendimento = taxaRendimento;
    }
    @Override
    public void exibirTipoConta(){
        System.out.println("Está conta é do tipo Poupança!");
    }
}
