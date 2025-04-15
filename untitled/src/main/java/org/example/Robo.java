package org.example;

public class Robo implements Movimentando, Reciclando {
    @Override
    public void mover(){
        System.out.println("O robo esta se movendo.");
    }

    @Override
    public void reciclar(){
        System.out.println("O robo esta reciclando material.");
    }
}
