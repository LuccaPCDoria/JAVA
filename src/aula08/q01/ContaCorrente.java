package aula08.q01;

public final class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldo,double limiteChequeEspecial){
        super(titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void exibirTipoConta(){
        System.out.println("Está conta é do tipo Corrrente!");
    }
}
