package aula08.q01;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Escolha qual tipo de conta deseja criar; Para sair digite 0");
            System.out.println("1 - Conta poupança\n2 - Conta Empresarial\n3 - Conta Corrente");
            opc = sc2.nextInt();

            if( opc == 1) {
                System.out.println("Conta poupança criada");

            }else if(opc == 2){
                System.out.println("Conta Empresarial criada");
            }else if(opc == 3){
                System.out.println("Conta corrente criada");
            }else if(opc > 3 && opc < 0){
                System.out.println("Opção inválida tente novamente");
            }
        }while (opc != 0);

        sc1.close();
        sc2.close();
    }
}
