package aula04.q01;
import listaExercicio.q04.Filme;

import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();
        int opt;
        do {
            System.out.println("\nDigite de 1 a 3 pra escolher a opção que deseja!");
            System.out.println("1 - Cadastrar um produto");
            System.out.println("2 - Realizar venda");
            System.out.println("3 - Sair");
            System.out.print("Digite sua opção: ");
            opt = sc1.nextInt();

            if (opt == 1) {
                System.out.print("Digite o nome do produto: ");
                String nome = sc2.nextLine();
                System.out.print("Digite o tamanho do produto em metros: ");
                int tamanho = sc1.nextInt();
                System.out.print("Digite o peso do produto em kg: ");
                int peso = sc1.nextInt();
                System.out.print("Digite a cor do produto: ");
                String cor = sc2.nextLine();
                System.out.print("Digite o valor do produto: ");
                double valor = sc1.nextDouble();
                System.out.print("Digite a quantidade do produto em estoque: ");
                int quantidade = sc1.nextInt();
                p.setNome(nome);
                p.setTamanho(tamanho);
                p.setPeso(peso);
                p.setCor(cor);
                p.setValor(valor);
                p.setQuantidade(quantidade);
            } else if (opt == 2) {
                System.out.print("Digite a forma de pagamento:\n1 - Pix\n2 - Espécie\n3 - Transferência ou Débito\n4 - Crédito\nFormato de pagamento: ");
                int formaPagamento = sc2.nextInt();
                System.out.print("Digite o valor que deseja pagar: ");
                int valorPago = sc1.nextInt();
                System.out.print("Digite a quantidade selecionada: ");
                int quantPaga = sc1.nextInt();
                System.out.println(p.realizarVenda(valorPago, quantPaga, formaPagamento));
            }
            else if(opt == 3){
                continue;
            }
            else{
                System.out.println("A opção que você digitou não é valida, tente novamente!");
            }
        }while(opt != 3);

        sc1.close();
        sc2.close();
    }
}
