package listaExercicio.q04;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int opt;
        Filme f = new Filme();
        do {
            System.out.println("\nDigite de 1 a 5 pra escolher a opção que deseja!");
            System.out.println("1 - Cadastrar um título");
            System.out.println("2 - Exibir Detalhes");
            System.out.println("3 - Avaliar o título de 0 a 10");
            System.out.println("4 - Mostrar a média de avaliações");
            System.out.println("5 - sair");
            System.out.print("Digite sua opção: ");
            opt = sc1.nextInt();

            if (opt == 1) {
                System.out.println("Digite o nome do filme: ");
                String nome = sc2.nextLine();
                System.out.println("Digite o gênero do filme: ");
                String genero = sc2.nextLine();
                System.out.println("Digite o ano de lançamento do filme: ");
                int ano = sc1.nextInt();
                System.out.println("Digite a duração do filme em minutos: ");
                int duracao = sc1.nextInt();
                f.setNome(nome);
                f.setGenero(genero);
                f.setAno(ano);
                f.setDuracao(duracao);
            } else if (opt == 2) {
                System.out.println(f.exibirDetalhes());
            } else if (opt == 3) {
                if(f.getNome() != null) {
                    while (true) {
                        System.out.print("Digite uma nota de 0 a 10: ");
                        int nota = sc1.nextInt();
                        if (nota <= 10 && nota >= 0) {
                            f.avaliar(nota);
                            break;
                        } else {
                            System.out.println("Valor inválido, tente novamente!");
                        }
                    }
                }else {
                    System.out.println("Nenhum filme foi cadastrado no sistema ainda!");
                }
            }else if (opt == 4){
                System.out.println(f.calcularMediaAvaliacoes());
            }
            else if(opt == 5){
                continue;
            }
            else{
                System.out.println("A opção que você digitou não é valida, tente novamente!");
            }
        }while(opt != 5);
        sc1.close();
        sc2.close();
    }
}
