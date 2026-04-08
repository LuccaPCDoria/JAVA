package aula01.q04;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String r;
        System.out.println("Digite (s) se quer cadastrar um usuário: ");
        r = sc2.next();
        while(r.equalsIgnoreCase("S")) {

            System.out.print("Digite seu nome: ");
            String nome = sc2.next();


            System.out.println("Digite sua idade: ");
            int idade = sc1.nextInt();

            System.out.println("Se quiser realizar um novo cadastro, digite (s).");
            r = sc2.next();
        }
        sc1.close();
        sc2.close();
    }
}
