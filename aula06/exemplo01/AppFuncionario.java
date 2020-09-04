package exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("Emerson", 3000); //cria objeto funcionario a partir do modelo funcionario
        Funcionario funcionario2 = new Funcionario("Ana Gabi", 2000);
        Gerente gerente1 = new Gerente("José Victor", 5000, 10); //cria objeto funcionario a partir do modelo funcionario

        System.out.println("Funcionario 1: " + funcionario1.getNome());
        
        funcionario2.aumentarSalario(0.10);
        System.out.println(funcionario2.imprimir());
        gerente1.aumentarSalario(0.1);
        System.out.println(gerente1.imprimir());

    }
}