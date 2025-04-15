package org.example;

public class Main {
    public static void main(String[] args){
//        EquipeFormula1 equipe = new EquipeFormula1();
//
//        EquipeF1 piloto = new Piloto("Hamilton");
//        EquipeF1 engenheiro = new Engenheiro("Claire");
//        EquipeF1 chefe = new ChefeDeEquipe("Matheus");
//        EquipeF1 mecanico = new Mecanico("Carlos");
//
//        equipe.adicionarMembro(piloto);
//        equipe.adicionarMembro(engenheiro);
//        equipe.adicionarMembro(chefe);
//        equipe.adicionarMembro(mecanico);
//
//        System.out.println("Operações de equipe:");
//        equipe.iniciarOperacao();
//
//        System.out.println("\nStatus dos membros:");
//        equipe.statusGeral();

        OperacoesChamado chamado1 = new ChamadoSuporte();
        chamado1.criarChamado("Problema no emial", "Não consigo acessar meu e-mail.");
        chamado1.atenderChamado();
        chamado1.fecharChamado();

        System.out.println("-------------------------------------------------------");

        OperacoesChamado chamado2 = new ChamadoTI();
        chamado2.criarChamado("Computador travando", "O pc está muito lento");
        chamado2.atenderChamado();
        chamado2.fecharChamado();
    }
}