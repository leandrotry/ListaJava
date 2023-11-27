package LogicaQuestoes.Principais;

import LogicaQuestoes.Dominio.Exercicio1;

import java.util.Scanner;

public class Exercicio1Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Exercicio1 exercicio1 = new Exercicio1();

        System.out.println("Informe o valor do trabalho de laboratório: ");
        exercicio1.setTrabalhoDeLaboratorio(sc.nextDouble());
        System.out.println("Informe o valor da avaliação semestral: ");
        exercicio1.setAvaliacaoSemestral(sc.nextDouble());
        System.out.println("Informe o valor do exame final: ");
        exercicio1.setExameFinal(sc.nextDouble());
        exercicio1.imprimir();
        exercicio1.testaNota();
    }
}
