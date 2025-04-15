package org.example;

public class Piloto implements EquipeF1{
    private String nome;

    public Piloto(String nome){
        this.nome = nome;
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " está pilotando o carro na pista.");
    }

    @Override
    public void mostrarStatus(){
        System.out.println(nome + " Esta focado na pista");
    }
}
