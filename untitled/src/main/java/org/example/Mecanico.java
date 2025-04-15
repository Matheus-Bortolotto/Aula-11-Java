package org.example;

public class Mecanico implements EquipeF1 {
    private String nome;

    public Mecanico(String nome){
        this.nome = nome;
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " Está preparando as novas peças do carro");
    }

    @Override
    public void mostrarStatus(){
        System.out.println(nome + " está arrumando o carro.");
    }
}
