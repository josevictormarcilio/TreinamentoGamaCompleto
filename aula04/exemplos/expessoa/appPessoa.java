package exemplos.expessoa;

public class appPessoa {
    public static void main(String[] args) {

        /*
        //declara uma variável do tipo pessoa
        Pessoa pessoa1;

        //cria um objeto do tipo pessoa
        pessoa1 = new Pessoa();
        */

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "José ";
        pessoa2.nome = "Victor";

        pessoa1.apresentar();
        pessoa2.apresentar();

    }
}