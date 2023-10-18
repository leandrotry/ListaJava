import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Digite um número");
        number = sc.nextInt();

        System.out.println(number +" - 1 = " + (number - 1));
        System.out.println(number +" = " + (number));
        System.out.println(number +" + 1 = " + (number + 1));

    }
}