package Parte2;

public class positivo_ou_negativo {
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void positivo_ou_negattivo(){
        if(this.numero > 0){
            System.out.println("esse numero e positivo: " + this.numero);
        } else {
            System.out.println("esse numero e negativo: " + this.numero);
        }
    }
}
