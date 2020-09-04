package exercicio01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Jose", 40, 10);
        Senior s1 = new Senior("Carlos", 40, 20, 10);

        System.out.println(func1.exibirDados());
        System.out.println(s1.exibirDados());
    }
}