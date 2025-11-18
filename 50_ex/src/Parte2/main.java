package Parte2;

public class main {
    public static void main(String[] args) {
        bissexto bi = new bissexto();

        bi.setAno(2024);
        bi.bis();
        bi.setAno(1900);
        bi.bis();
        bi.setAno(2000);
        bi.bis();
        bi.setAno(1578);
        bi.bis();
    }

}
