package exercicio01;

public class Senior extends Funcionario{
    private double bonus;

    public Senior (String nome, int horas, double valor, double bonus) {
        super(nome, horas, valor); 
        this.bonus = bonus;
    }

    @Override
    public double salarioFinal(){
        double valorBonus = bonus * (getHora()/10);
        setSalario(getHora() * getValor() + valorBonus);
        return getSalario();
    }
}