package Parte6;

public class main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", 1949, 328);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1216);
        livro1.exibirInformacoes();
        livro1.emprestar();
        livro1.exibirInformacoes();
        livro1.devolver();
        livro1.exibirInformacoes();
      
    }

}
