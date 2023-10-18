import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();
        int soma = 0;
        int i = 0;
        while (i<4 ){
            System.out.print("informe o número da posicão: " + (i+1) + ": ");
            lista.add(sc.nextInt());
            i++;
        }
        for(i = 0; i < lista.size(); i++){
            soma += lista.get(i);
        }

        System.out.println("A soma dos valores é = " + soma);
    }
}
