package aula01.q03;

public class Main {
    static void main() {
        System.out.println("Questão 3");
        double nota1 = 34.00, nota2 = 35.00, nota3 = 10.00, media = 0;
        media = nota1 + nota2 + nota3 / 3;

        if(media >= 70 && media <= 100)
            System.out.println("Aprovado!");
        else if(media < 70 && media > 40)
            System.out.println("Final!");
        else if(media < 40 && media >= 0)
            System.out.println("Reprovado!");
        else
            System.out.println("A nota está com problemas");
    }
}
