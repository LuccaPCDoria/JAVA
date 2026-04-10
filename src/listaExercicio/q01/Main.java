package listaExercicio.q01;

import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int matricula;
        String nome;
        double salario;

        System.out.print("Digite a matrícula do funcionario: ");
        matricula = sc2.nextInt();
        System.out.print("Digite o nome do funcionário: ");
        nome = sc1.nextLine();
        System.out.print("Digite o salário do funcionario: ");
        salario = sc2.nextDouble();

        Funcionario f = new Funcionario(matricula, nome,salario);

        System.out.println(f.exibirContracheque());
        sc1.close();
        sc2.close();
    }
}
