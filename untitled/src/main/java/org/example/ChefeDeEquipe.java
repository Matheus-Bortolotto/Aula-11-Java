package org.example;

public class ChefeDeEquipe implements EquipeF1 {
    private String nome;

    public ChefeDeEquipe(String nome){
        this.nome = nome;
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " Está passando as informações para a equipe");
    }

    @Override
    public void mostrarStatus(){
        System.out.println(nome + " está chefiando.");
    }
}
