package listaExercicio.q03;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();
        int opt;

        do {
            System.out.println("\nDigite de 1 a 4 pra escolher a opção que deseja!");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Exibir Detalhes");
            System.out.println("3 - Calcular o valor total do estoque");
            System.out.println("4 - sair");
            System.out.print("Digite sua opção: ");

            opt = sc2.nextInt();
            if (opt == 1) {
                System.out.println("Digite o nome do produto: ");
                String nome = sc1.nextLine();
                System.out.println("Digite o preço do produto: ");
                double preco = sc2.nextDouble();
                System.out.println("Digite o quantidade do produto: ");
                int quantidade = sc2.nextInt();
                p.setNome(nome);
                p.setPreco(preco);
                p.setQuantidade(quantidade);
            } else if (opt == 2) {
                System.out.println(p.exibirDetalhes());
            } else if (opt == 3) {
                System.out.printf(p.calcularValorTotal());
            } else if(opt == 4){
                continue;
            }
            else{
                System.out.println("A opção que você digitou não é valida, tente novamente!");
            }
        }while(opt != 4);

        sc1.close();
        sc2.close();
    }
}
