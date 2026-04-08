package aula03.q01;

public class Empregado {
    String nomeCompleto;
    int matricula;
    double salarioBruto,salarioLiquido, descontoINSS = 0.15;

    void calcularDescontoSalario(){
        salarioLiquido = salarioBruto * descontoINSS;
    }

}
