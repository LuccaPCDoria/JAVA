package aula08.q01;

public final class ContaEmpresarial extends Conta{
    private String cnpj, nomeEmpresa;
    private double limiteCredito;

    public ContaEmpresarial(String titular, double saldo,String cnpj,String nomeEmpresa, double limiteCredito){
        super(titular, saldo);
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.limiteCredito = limiteCredito;
    }
    @Override
    public void exibirTipoConta(){
        System.out.println("Está conta é do tipo Empresarial!");
    }
}
