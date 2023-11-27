package LogicaQuestoes.Principais;

import LogicaQuestoes.Dominio.Exercicio2;

import java.util.Scanner;

public class Exercicio2Main {
    public static void main(String[] args) {
        Exercicio2 exercicio2 = new Exercicio2();
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor com duas casas decimais");

        exercicio2.setValor(input.nextDouble());
        exercicio2.imprimir();
    }
}
