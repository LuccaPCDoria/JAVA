package Aula09.q01;

class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
