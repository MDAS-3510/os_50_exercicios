package Parte7;

public class Aluno {
    private String nome;
    private String ra;
    private double media;

    public Aluno(String nome, String ra, double media) {
        this.nome = nome;
        this.ra = ra;
        this.setMedia(media); 
    }


    public Aluno(String nome, String ra) {
        this(nome, ra, 0.0);
    }

    public Aluno() {
        this("Nome não informado", "000000", 0.0);
    }

    public String verificarSituacao() {
        return (this.media >= 6.0) ? "Aprovado" : "Reprovado";
    }


    @Override
    public String toString() {
        return String.format("Aluno{nome='%s', ra='%s', media=%.2f, situação='%s'}",
                nome, ra, media, verificarSituacao());
    }

    public void exibir() {
        System.out.println(this); 
    }
    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = (nome != null && !nome.trim().isEmpty()) ? nome : "Aluno Sem Nome";
    }

    public String getRa() {return ra;}

    public void setRa(String ra) {this.ra = ra;}

    public double getMedia() {return media;}

    public void setMedia(double media) {
        if (media >= 0 && media <= 10) {
            this.media = media;
        } else {
            System.out.println("Média inválida! Deve ser entre 0 e 10.");
            this.media = 0.0;
        }
    }
}

