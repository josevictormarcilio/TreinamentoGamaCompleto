package exemplos.exlivros;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Programando em Java", "JV Marcilio", 500, 2020);
        Livro novoLivro = new Livro("A vida de Jose", "José Victor", 1000, 2030);


        livro.exibirDados();
        System.out.println("Páginas: "+ livro.numPag());

        novoLivro.exibirDados();

        /* Sem construtor
        Livro livro = new Livro();

        livro.titulo = "Programando em Java";
        livro.autor = "JV Marcilio";
        livro.paginas = 500;
        livro.anoPublicacao = 2020;

        livro.exibirDados();
        System.out.println("Páginas: "+ livro.numPag());
        */
    }
}