package aula03.q02;

public class Aluno {
    String nome;
    double media, nota1,nota2,nota3;

    public double calcularMedia(){
        media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public String resultadoMedia(double media){
        if(media >= 70) {
            return "Aprovado!";
        }else if (media < 40) {
            return "Reprovado!";
        }else {
            return "para Final!";
        }
    }

}
