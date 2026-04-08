package aula02.q02;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String nome;
        int matricula;
        double salarioBruto, salarioLiquido, descontoInss = 0.15;
        System.out.println("Digite sua matrícula: ");
        matricula = sc1.nextInt();

        System.out.println("Digite seu nome: ");
        nome = sc2.nextLine();

        System.out.println("Digite seu salário bruto: ");
        salarioBruto = sc1.nextDouble();

        salarioLiquido = salarioBruto * descontoInss;

        System.out.printf("Matrícula: %d\nNome Completo: %s\nSalário Bruto: %.2f\nDedução INSS: %.2f\nSalário Líquido: %.2f", matricula, nome, salarioBruto, descontoInss, salarioLiquido);
    }
}
