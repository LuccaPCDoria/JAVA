package aula01.q02;

public class Main {
    static void main() {
        System.out.println("Questão 2");
        int num1 = 20;
        int num2 = 40;
        String texto;
        if(num1 > num2){
            texto = "é maior";
        }else if (num1 == num2){
            texto = "é igual";
        }else {
            texto = "é menor";
        }
        System.out.println(texto);

    }
}
