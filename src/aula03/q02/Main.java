package aula03.q02;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.print("Digite seu nome: ");
        a.nome = sc2.nextLine();
        System.out.print("Digite sua primeira nota: ");
        a.nota1 = sc1.nextInt();
        System.out.print("Digite sua segunda nota: ");
        a.nota2 = sc1.nextInt();
        System.out.print("Digite sua terceira nota: ");
        a.nota3 = sc1.nextInt();

        System.out.printf("O aluno foi %s E sua media foi %.2f.", a.resultadoMedia(a.calcularMedia()), a.calcularMedia());

    }
}
