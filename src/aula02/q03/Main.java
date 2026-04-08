package aula02.q03;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;
        int cont = 3;
        double  nota1, nota2, nota3,nota_temp = 0, temp, media;
        System.out.print("Insira uma nota do aluno: ");
        nota1 = sc1.nextDouble();

        System.out.print("Insira uma nota do aluno: ");
        nota2 = sc1.nextDouble();

        System.out.print("Insira uma nota do aluno: ");
        nota3 = sc1.nextDouble();

        System.out.print("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): ");
        r = sc2.nextLine();
        while (r.equalsIgnoreCase("S")){
            System.out.print("Insira uma nota do aluno: ");
            temp = sc1.nextDouble();
            nota_temp += temp;
            cont++;

            System.out.print("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): ");
            r = sc2.nextLine();
        }
        media = (nota1 + nota2 + nota3 + nota_temp) / cont;

        System.out.printf("Média das notas: %.2f\n", media);
        System.out.println("Obrigado por usar o programa!");
    }
}
