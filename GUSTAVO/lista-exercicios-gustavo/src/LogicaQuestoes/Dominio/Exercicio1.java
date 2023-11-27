package LogicaQuestoes.Dominio;

public class Exercicio1 {
    //avaliacaoSemestral, exameFinal, mediaPonderada;
    private double trabalhoDeLaboratorio;
    private double avaliacaoSemestral;
    private double exameFinal;
    private double mediaPonderada;

    public double calcularMediaPonderada() {
        return this.mediaPonderada = (((this.trabalhoDeLaboratorio * 2) + (this.avaliacaoSemestral * 3) + (this.exameFinal * 5)) / 10);
    }

    public void imprimir() {
        System.out.println(calcularMediaPonderada());
    }

    public void testaNota() {
        if (this.mediaPonderada >= 8) {
            System.out.println("A");
        } else if (this.mediaPonderada >= 7 && this.mediaPonderada <= 7.9) {
            System.out.println("B");
        } else if (this.mediaPonderada >= 6 && this.mediaPonderada <= 6.9) {
            System.out.println("C");
        } else if (this.mediaPonderada >= 5 && this.mediaPonderada <= 5.9) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }

    public void setTrabalhoDeLaboratorio(double trabalhoDeLaboratorio) {
        this.trabalhoDeLaboratorio = trabalhoDeLaboratorio;
    }

    public double getTrabalhoDeLaboratorio() {
        return trabalhoDeLaboratorio;
    }

    public void setAvaliacaoSemestral(double avaliacaoSemestral) {
        this.avaliacaoSemestral = avaliacaoSemestral;
    }

    public double getAvaliacaoSemestral() {
        return avaliacaoSemestral;
    }

    public void setExameFinal(double exameFinal) {
        this.exameFinal = exameFinal;
    }

    public double getExameFinal() {
        return exameFinal;
    }

    public double getMediaPonderada() {
        return mediaPonderada;
    }

}
