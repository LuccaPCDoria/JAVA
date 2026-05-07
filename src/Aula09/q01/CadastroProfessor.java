package Aula09.q01;

import java.util.ArrayList;

public class CadastroProfessor {

    private ArrayList<Professor> professores = new ArrayList<>();
    //@PostMapping - CADASTRAR
    public void cadastrar(Professor p) {
        professores.add(p);
        System.out.println("Professor cadastrado: " + p.getNome());
    }
    //GetMapping - READ
    public void listar() {
        for (Professor p : professores) {
            System.out.println("Nome: " + p.getNome());
        }
    }
    //PutMapping - UPDATE
    public void atualizar(String nome, int novaIdade) {
        for(Professor p : professores) {
            // if(p.getNome)
        }
    }

}
