package aula05.q01;

public class Main {
    static void main(String[] args) {
        // Clinico Geral
        ClinicoGeral cg = new ClinicoGeral(true, true);
        cg.tratarPaciente();
        cg.receitar();

        System.out.println();

        // Cirurgião
        Cirurgiao c = new Cirurgiao(true);
        c.tratarPaciente();
        c.fazerIncisao();
    }
}
