package aula05.q01;

public class Cirurgiao extends Medico {

    public Cirurgiao(boolean trabalhandoNoHospital){
        super(trabalhandoNoHospital);
    }
    public void fazerIncisao(){
        System.out.println("Fazendo incisão...");
    }


    @Override
    public void tratarPaciente() {
        System.out.println("Tratamento cirúrgico...");
    }

}