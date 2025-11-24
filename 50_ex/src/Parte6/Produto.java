package Parte6;

public class Produto {
    private String nome;
    private double preco;
   

 private double percentualDesconto; // em %

    public Produto(String nome, double preco, double percentualDesconto) {
        this.nome = nome;
        setPreco(preco);
        setPercentualDesconto(percentualDesconto);
    }

    public double calcularPrecoComDesconto() {
        return preco - (preco * percentualDesconto / 100);
    }

    public void exibirProduto() {
        System.out.printf("Produto: %s%n", nome);
        System.out.printf("Preço original: R$ %.2f%n", preco);
        System.out.printf("Desconto: %.0f%% → Preço final: R$ %.2f%n%n",
                percentualDesconto, calcularPrecoComDesconto());
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        this.preco = (preco > 0) ? preco : 0;
    }

    public double getPercentualDesconto() { return percentualDesconto; }
    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = (percentualDesconto >= 0 && percentualDesconto <= 100) 
            ? percentualDesconto : 0;
    }
}