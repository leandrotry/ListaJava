package LogicaQuestoes.Dominio;

import java.util.Scanner;

public class Exercicio2 {
    private double valor;
    private double quantidade;
    private int valorEmCentavos;
    private double[] notasMoedas = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
    private int[] quantidadeNotasMoedas = new int[notasMoedas.length];

    public void setValor(double valor) {
        this.valor = valor;
    }

    private void calcularNotas() {
        valorEmCentavos = (int) (valor * 100);
        int i;
        for (i = 0; i < this.notasMoedas.length; i += 1) {
            this.quantidade = this.valorEmCentavos / (int) (this.notasMoedas[i] * 100);
            this.quantidadeNotasMoedas[i] = (int) this.quantidade;
            this.valorEmCentavos -= this.quantidade * (int) (this.notasMoedas[i] * 100);

        }
    }

    public void imprimir() {
        calcularNotas();
        for (int i = 0; i < notasMoedas.length; i++) {
            if (i >= 6 && this.quantidadeNotasMoedas[i] > 0)
                System.out.println(this.quantidadeNotasMoedas[i] + " moeda(s) de " + this.notasMoedas[i]);
            else if (this.quantidadeNotasMoedas[i] > 0)
                System.out.println(this.quantidadeNotasMoedas[i] + " nota(s) de " + this.notasMoedas[i]);
        }
    }
}
