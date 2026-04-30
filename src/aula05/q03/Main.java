package aula05.q03;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        sc1.useLocale(Locale.forLanguageTag("pt-BR"));

        Aluno a = new Aluno("lucca", 123123, 19);
        Professor p = new Professor("Prof_lucca",18, 1500.00);

        //exibição pelo toString
        System.out.println("Informações do Professor:");
        System.out.println(p);

        System.out.println("Informações do Aluno:");
        System.out.println(a);
        p.setCargo(CARGOS.Professor);
        System.out.println(p.getCargo());

        sc1.close();
        sc2.close();
    }

}
