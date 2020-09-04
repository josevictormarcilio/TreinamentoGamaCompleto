package exemplo01;

public class Gerente extends Funcionario {
    private int nfuncionario;
    private double bonus;

    public Gerente(String nome, double salario, int nfuncionario) {
        super(nome, salario); //chama o construtor da Superclasse (Funcionario)
        this.nfuncionario = nfuncionario;
    }

    public int getNfuncionario(){
        return nfuncionario;
    }

    public void setNfuncionario(int nfuncionario){
        if (nfuncionario >= 0) {
            this.nfuncionario = nfuncionario;
        }
    }

    //override - mesmo método vai fazer coisas diferentes
    @Override
    public String imprimir(){
        //forma 1:
        //acesso diretamente um dado protected e um método público e uma variável local
        //return "Funcionario: " + nome + "Salário: "+ getSalario() + " Número de funcionário " + nfuncionario;
        //forma 2:
        //utilizar o método da classe base e adicionar o que form diferente
        return super.imprimir() + " Número de funcionário " + nfuncionario + " Bonús para esse mês: " + bonus;
    }

        public void aumentarSalario (double perc){

        //super.aumentarSalario(perc + 0.2);

        //solução 2
        //bous para o mês do aumento
        bonus = getSalario() * 0.2;
        super.aumentarSalario(perc);
    }
}