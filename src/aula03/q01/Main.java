package aula03.q01;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Empregado e = new Empregado();

        System.out.print("Digite seu nome: ");
        e.nomeCompleto = sc2.nextLine();

        System.out.print("Digite sua matrícula: ");
        e.matricula = sc1.nextInt();

        System.out.print("Digite seu salário bruto: ");
        e.salarioBruto = sc1.nextDouble();

        e.calcularDescontoSalario();

        System.out.printf("\nMatricula: %d\nNome completo: %s\nSalário Bruto: %.2f\nDedução INSS: %.2f\nSalário Líquido: %.2f", e.matricula,e.nomeCompleto,e.salarioBruto,e.descontoINSS * 100,e.salarioLiquido);




        sc1.close();
        sc2.close();
    }
}
