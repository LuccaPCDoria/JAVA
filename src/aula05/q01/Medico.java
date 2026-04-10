package aula05.q01;

public class Medico {
    protected boolean trabalhaNoHospital;

    public Medico(){

    }

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente(){
        System.out.println("Tratando paciente...");
    }
}
