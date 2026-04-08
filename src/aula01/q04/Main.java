package aula01.q04;

public class Main {
    static void main() {
        System.out.println("Questão 4!");

        double salario = 1500.00;
        double desconto;
        String textoDesconto;
        if (salario > 2500)
            textoDesconto = "de 20%";
        else if(salario > 1500 && salario <= 2500)
            textoDesconto = "de 10%";
        else if(salario > 900 && salario <= 1500)
            textoDesconto = "de 5%";
        else if(salario <= 900)
            textoDesconto = "isento";
        else
            textoDesconto = "desconto não calculado";

        System.out.printf("Seu salário de %f e o desconto é %s.\n",salario,textoDesconto);
    }
}
