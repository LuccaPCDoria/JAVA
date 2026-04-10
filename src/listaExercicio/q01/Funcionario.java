package listaExercicio.q01;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salarioBruto;


    public Funcionario(int matricula, String nome, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }
    public String exibirContracheque() {
        return String.format("Matricula: %d\nNome: %s\nSalário Bruto: %.2f\nSalário Líquido: %.2f",this.matricula, this.nome, this.salarioBruto, this.calcularSalarioLiquido());
    }

    public double calcularSalarioLiquido() {
        return (this.salarioBruto - this.calcularInss());
    }
    public double calcularInss() {
        return (this.salarioBruto * 0.15);
    }
}
