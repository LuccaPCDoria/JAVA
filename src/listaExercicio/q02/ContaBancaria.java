package listaExercicio.q02;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo = 0.0;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;


    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String depositar(double valor) {
        this.saldo += valor;
        return String.format("Operação de deposito efetuada com sucesso!");
    }
    public String sacar(double valor) {
        if (this.saldo > 0.0 ){
            this.saldo -= valor;
            return String.format("Operação de saque efetuada com sucesso!\nO valor sacado foi: %.2f", valor);
        }else{
            return "Operação de saque efetuada falhou!\nO saldo está zerado";
        }
    }
    public String transferir(ContaBancaria destino,double valor) {
        if (this.saldo > 0.0){
            this.saldo -= valor;
            destino.saldo += valor;
            return String.format("Operação de transferencia efetuada com sucesso!\nO valor transferido para a conta de %s foi: %.2f", destino.titular, valor);
        }else{
            return "Operação de saque efetuada falhou!\nO saldo está zerado";
        }
    }

}
