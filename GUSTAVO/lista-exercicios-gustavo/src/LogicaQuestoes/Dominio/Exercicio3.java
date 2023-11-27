package LogicaQuestoes.Dominio;

public class Exercicio3 {
    private double salario;
    private double horasTrabalhadas;
    private double horasExtras;
    private double valorHorasExtras;
    private double valorHoraTrabalhada;
    private double salarioBase;
    private double valorTotalHorasExtras;
    private double salarioBruto;
    private double impostoDevido;
    private double salarioLiquido;

    public void imprimir(){
        System.out.println("valor da hora: R$ " + calcularValorHoraTrabalhada());
        System.out.println("valor da hora extra: R$ " + getValorHorasExtras());
        System.out.println("valor do salário base: R$ " + calcularSalarioBase());
        System.out.println("Valor total das horas extras: R$ " + calcularvalorTotalHorasExtras());
        System.out.println("Valor do salário bruto: R$ " + calcularSalarioBruto());
        System.out.println("Valor do imposto devido: R$ " + calcularImpostoDevivo());
        System.out.println("Valor do salário líquido R$ " + calcularSalarioLiquido());
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void setHorasExtras(double horasExtras){
        this.horasExtras = horasExtras;
    }
    public double getHorasExtras(){
        return horasExtras;
    }
    public double getValorHorasExtras(){
        calcularValorHoraExtra();
        return valorHorasExtras;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double calcularValorHoraTrabalhada(){
        return this.valorHoraTrabalhada = this.salario / 8;
    }
    public void calcularValorHoraExtra(){
        this.valorHorasExtras = this.salario / 4;
    }
    public double calcularSalarioBase(){
        return this.salarioBase = valorHoraTrabalhada * horasTrabalhadas;
    }
    public double calcularvalorTotalHorasExtras(){
        return this.valorTotalHorasExtras = valorHorasExtras * horasExtras;
    }
    public double calcularSalarioBruto(){
        return this.salarioBruto = salarioBase + valorTotalHorasExtras;
    }
    public double calcularImpostoDevivo(){
        return this.impostoDevido = this.salarioBruto * 0.085;
    }
    public double calcularSalarioLiquido(){
        return this.salarioLiquido = this.salarioBruto - this.impostoDevido;
    }
}
