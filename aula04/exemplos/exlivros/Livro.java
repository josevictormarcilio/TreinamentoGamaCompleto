package exemplos.exlivros;

public class Livro {
    //atributos
    String titulo, autor;
    int paginas, anoPublicacao;

    //construtor
    Livro(String titulo, String novoAutor, int pg, int ano){
        //this - distringuir o que é parâmetro de objeto (diferencia atributo de parâmetro)
        this.titulo = titulo; 
        autor = novoAutor;
        paginas = pg;
        anoPublicacao = ano;
    }

    //metodos
    void exibirDados(){
        System.out.println(titulo+": " + autor + " - " + anoPublicacao);
    }

    int numPag(){
        return paginas;
    }
}