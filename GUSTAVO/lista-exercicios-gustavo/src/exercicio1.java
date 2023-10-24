import java.sql.SQLOutput;
import java.util.Scanner;


/*A nota final de um estudante do curso ADS é calculada a partir de três notas atribuídas,
respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. A
média das três notas mencionadas obedece aos pesos a seguir:
Nota Peso
Trabalho de laboratório 2
Avaliação semestral 3
Exame final 5

Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito obtido
pelo aluno segundo a tabela abaixo:

Média Ponderada Conceito
8,0 – 10,0 A
7,0 – 7,9 B
6,0 – 6,9 C
5,0 – 5,9 D
0,0 – 4,9 E*/


public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double trabalhoDeLaboratorio, avaliacaoSemestral, exameFinal, mediaPonderada;
        int trabalhoPeso, avaliacaoPeso, examePeso;

        trabalhoPeso = 2;
        avaliacaoPeso = 3;
        examePeso = 5;

        System.out.println("Informe o valor do trabalho de laboratório: ");
        trabalhoDeLaboratorio = sc.nextDouble();
        System.out.println("Informe o valor da avaliação semestral: ");
        avaliacaoSemestral = sc.nextDouble();
        System.out.println("Informe o valor do exame final: ");
        exameFinal = sc.nextDouble();

        mediaPonderada = ((trabalhoPeso * trabalhoDeLaboratorio) + (avaliacaoPeso * avaliacaoSemestral) + (examePeso * exameFinal)) / (trabalhoPeso + avaliacaoPeso + examePeso);


        if (mediaPonderada >= 8){
            System.out.println("Conceito: A");
        }else if (mediaPonderada <= 7.9 && mediaPonderada >= 7){
            System.out.println("Conceito: B");
        } else if (mediaPonderada <= 6.9 && mediaPonderada >= 6){
            System.out.println("Conceito: C");
        } else if (mediaPonderada <= 5.9 && mediaPonderada >= 5){
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: E");
        }

        System.out.println(mediaPonderada);
    }
}