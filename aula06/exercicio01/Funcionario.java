package exercicio01;

public class Funcionario {
    private String nome;
    private int horas;
    private double valor;
    private double salario = 0;

    public Funcionario (String nome, int horas, double valor){
        this.nome = nome;
        this.horas = horas;
        this.valor = valor;
    }

    public double salarioFinal(){
        salario = horas *valor;
        return salario;
    }

    public String exibirDados(){
        return "Nome: " + nome + "\nHoras trabalhadas: " + horas + "\nValor hora: " + valor + "\nSalário final é: R$" + salarioFinal();
    }

    public double getSalario(){
        return salario;
    }

    public int getHora(){
        return horas;
    }

    public double getValor(){
        return valor;
    }

    public void setSalario (double salario){
        if (salario > 0){
            this.salario = salario;
        }
    }
}