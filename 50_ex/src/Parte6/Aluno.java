package Parte6;

public class Aluno {

    private String nome;
    private String ra;
    private double media;

    public Aluno(String nome, String ra, double media) {
        this.nome = nome;
        this.ra = ra;
        setMedia(media); 
    }


    public String verificarSituacao() {
        return (media >= 6.0) ? "Aprovado" : "Reprovado";
    }

    public void exibirInformacoes() {
        System.out.printf("Aluno: %s | RA: %s | Media: %.2f | Situacao: %s%n",
                nome, ra, media, verificarSituacao());
    }


    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRa() { return ra; }
    public void setRa(String ra) { this.ra = ra; }

    public double getMedia() { return media; }
    public void setMedia(double media) {
        if (media >= 0 && media <= 10) {
            this.media = media;
        } else {
            this.media = 0;
            System.out.println("Media inválida! Definida como 0.");
        }
    }
}
