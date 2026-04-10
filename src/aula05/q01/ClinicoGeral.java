package aula05.q01;


public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalhandoNoHospital, boolean atendeEmCasa) {
        super(trabalhandoNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println("Preparando receita");
    }
}