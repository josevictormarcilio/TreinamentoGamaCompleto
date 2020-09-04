package exemplo01;

public class Funcionario {

    protected String nome; //acessar diretamente da classe derivada
    private double salario;

    //construtor - método para inicializar o objeto funcionario
    //sem parametro() - construtor default
    /* public Funcionario (){ 
        salario = 0;

    } */

    //Overload - polimorfismo (2 formas diferentes para o mesmo método na mesma classe)
    //pelo menos 1 parametro deve ser diferente (o que diferencia é o tipo de parâmetro)
    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //para obter o valor de um atributo, dou o nome para o método iniciando com get + nome do atributo que vai retornar com uso do CamelCase
    //retorna valor do nome
    public String getNome(){
        return nome;
    }

    //para alterar o calor de um atributo, inicia o método com com set + nome do atributo com mesmo parametro
    //altera valor do nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario (Double salario){
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public String imprimir(){
        return "Funcionario: " + nome + " Salário: "+ String.format("%.2f", salario);
    }

    public void aumentarSalario (double perc){
        //salario = salario + (salario * perc);
        //salario = salario + (1 + perc);
        salario *= (1 + perc);
    }
}