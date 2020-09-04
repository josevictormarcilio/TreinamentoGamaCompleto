package exemplos.exebook;

import java.util.Scanner;

public class AppEbook {
    public static void main(String[] args) {
        /* 
        Ebook ebook = new Ebook("O nome do livro", "José", 1036, 70);

        System.out.println(ebook.avancarPagina()); 
        System.out.println(ebook.retrocederPagina()); 
        System.out.println(ebook.exibirPagina()); 
        System.out.println(ebook.mostrarCapa());
        System.out.println(ebook.irParaPagina());   
        */

        Scanner entrada = new Scanner(System.in);
        String titulo, autor;
        int totalPaginas, paginaAtual;

        System.out.println("Digite o título do livro: ");
        titulo = entrada.nextLine();
        System.out.println("Digite o nome do autor: ");    
        autor = entrada.nextLine();
        System.out.println("Digite o total de páginas: ");
        totalPaginas = entrada.nextInt();
        System.out.println("Digite a página atual: ");
        paginaAtual = entrada.nextInt();

        Ebook ebook = new Ebook(titulo, autor, totalPaginas, paginaAtual);

        ebook.avancarPagina();
        System.out.println("Página avançada, a página atual é: " + ebook.exibirPagina()); 
        ebook.retrocederPagina();
        System.out.println("Voltou uma página, a página atual é: " + ebook.exibirPagina()); 
        System.out.println(ebook.exibirPagina()); 
        System.out.println(ebook.mostrarCapa());
        ebook.irParaPagina(paginaAtual);
        System.out.println("Você foi para a página " + ebook.exibirPagina());  

        ebook.getTitulo();
        ebook.setTitulo(titulo);

        entrada.close();

    }
}