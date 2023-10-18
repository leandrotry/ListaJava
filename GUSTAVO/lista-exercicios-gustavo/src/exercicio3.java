import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double percurso;
        char tipo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de quilometros que deseja viajar");
        percurso = scanner.nextInt();
        System.out.println("Informe o tipo de carro que deseja utilizar A|B|C");
        tipo = scanner.next().charAt(0);

        System.out.println(tipo + percurso);

    }
}
