package exemplos;
//retorno de método
public class Exemplo02 {
    public static void main(String[] args) {
        
        int resultado = soma(5, 7);
        System.out.println(resultado);
    }

    public static int soma(int a, int b){
        //scopo da variável: onde ela é valida
        //resp é uma variável LOCAL ao método soma
        int resp;

        resp = a+b;

        return resp;

    }
}