package Parte2;

public class Par_OU_impar {
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void par_impar(){
        if(this.numero % 2 == 0){
            System.out.println("O numero " + this.numero + " e par.");
        } else {
            System.out.println("O numero " + this.numero + " e impar.");
        }
    }
}
