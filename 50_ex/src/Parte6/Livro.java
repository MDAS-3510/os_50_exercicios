package Parte6;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false;
    }
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro já estava na biblioteca.");
        }
    }
    public void exibirInformacoes() {
        System.out.println("======================================");
        System.out.printf("  Título: %s%n", titulo);
        System.out.printf("  Autor: %s%n", autor);
        System.out.printf("  Ano: %d | Páginas: %d%n", anoPublicacao, numeroPaginas);
        System.out.printf("  Status: %s%n", emprestado ? "Emprestado" : "Disponível");
        System.out.println("======================================\n");
    }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isEmprestado() { return emprestado; }
}
