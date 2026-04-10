package aula01.q02;

public class Main {
    static void main() {
        System.out.println("Questão 2");
        int num1 = 20;
        int num2 = 40;
        String texto;
        if(num1 > num2){
            texto = num1 + " é maior "+ num2;
        }else if (num1 == num2){
            texto = num1 + " é igual " + num2;
        }else {
            texto = num1+ " é menor "+num2;
        }
        System.out.println(texto);

    }
}
