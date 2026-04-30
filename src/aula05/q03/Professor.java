package aula05.q03;

public final class Professor extends Pessoa implements Remuneravel{
    public CARGOS cargo;
    private double salario;
    private String especialidade;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public CARGOS getCargo() {
        return cargo;
    }

    @Override
    public void aplicarBonus() {
        salario = 300 * 40 * 0.15;
    }

    @Override
    public void calcularSalario() {
        salario = 300 * 40;
    }

    public void setCargo(CARGOS cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public void quemSouEu() {
        System.out.println("Sou o professor");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ensinar");
    }

    public void responsabilidade() {
        System.out.println("Ensinar");
    }


    public String toSring(){
        return super.toString() + ", Especialidade: " + especialidade;
    }

// get e set
}
