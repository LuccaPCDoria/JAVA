package aula03.q03;

import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Calculadora c = new Calculadora();
        System.out.println("Olá! Seja bem vindo a calculadora!");
        while(true){
            System.out.print("\nDigite 1 se deseja somar\nDigite 2 se deseja subtrair\nDigite 3 se deseja dividir\nDigite 4 se deseja multiplicar\nDigite 0 se deseja sair!\n-> ");
            int opt = sc1.nextInt();
            if (opt <= 4 && opt > 0){
                System.out.print("Digite o primeiro número: ");
                c.num1 = sc1.nextDouble();
                System.out.print("Digite o segundo número: ");
                c.num2 = sc1.nextDouble();
                if (opt == 1) System.out.printf("O total da adição é: %.2f", c.somar());
                else if (opt == 2) System.out.printf("O total da subtração é: %.2f", c.subtrair());
                else if (opt == 3) System.out.printf("O total da divisão é: %.2f", c.dividir());
                else System.out.printf("O total da multiplicação é: %.2f", c.multiplicar());
            } else if (opt == 0) break;
            else System.out.println("Opção invalida! tente novamente");
        }
        System.out.println("Você saiu do programa!");
    }
}
