package exemplos.exebook;

import java.util.Scanner;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook (String titulo, String autor, int totalPaginas, int paginaAtual){
        //this.titulo = titulo;
        setTitulo(titulo);
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
    }

    public void avancarPagina(){
        if (paginaAtual<totalPaginas) {
            paginaAtual++;
        }  
    }

    public void retrocederPagina(){
        if (paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public void irParaPagina(int pagina){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite para que página deseja ir: ");
        pagina = entrada.nextInt();

        entrada.close();

        if (pagina > 0 && pagina < totalPaginas) {
            paginaAtual = pagina;
        }
    }
    
    public String exibirPagina(){
        return "A página atual é: " + paginaAtual;
    }

    public String mostrarCapa(){
        return "Título: " + titulo + "\nAutor: " + autor + "\nTotal de páginas: " + totalPaginas + "\nPágina atual: " + paginaAtual;

    }

    //retona valor do atributo
    public String getTitulo(){
        return titulo;
    }

    //alterar atributo
    public void setTitulo(String novoTitulo){
        if (novoTitulo != null && novoTitulo.length() > 10) {
            titulo = novoTitulo;
        }
        
    }
}