package Parte2;

public class bissexto {
    public int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void bis(){
        if(this.ano % 400 == 0){
            System.out.println( this.ano + " e bissexto" );
        } else if (this.ano % 4 == 0 && this.ano % 100 != 0){
            System.out.println( this.ano + " e bissexto");
        } else {
            System.out.println(this.ano + " Nao e bissesxto");
        }
    }
}
