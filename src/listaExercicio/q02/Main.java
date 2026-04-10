package listaExercicio.q02;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria(123432131, "Lucca Prisco");
        ContaBancaria cb2 = new ContaBancaria(123432142, "Prof. Fernanda");
        int opt;
        double valor;
        do {
            System.out.println("\nDigite de 1 a 4 pra escolher a opção que deseja!");
            System.out.println("1 - Consultal saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.print("Digite sua opção: ");
            opt = sc2.nextInt();
            if (opt == 1) {
                System.out.printf("O seu saldo é de: %.2f",cb.consultarSaldo());
            } else if (opt == 2) {
                System.out.print("Digite o valor que deseja depositar: ");
                valor = sc2.nextDouble();
                System.out.println(cb.depositar(valor));
            } else if (opt == 3) {
                System.out.print("Digite o valor que deseja sacar: ");
                valor = sc2.nextDouble();
                System.out.println(cb.sacar(valor));;
            } else if (opt == 4) {
                System.out.print("Digite o valor que deseja transferir: ");
                valor = sc2.nextDouble();
                System.out.println(cb.transferir(cb2, valor));;
            }
        }while(opt > 0 && opt < 5);
        System.out.println("PROGRAMA FINALIZADO!");
        System.out.printf("Saldo da outra conta: %.2f",cb2.consultarSaldo());

        sc2.close();
    }
}
