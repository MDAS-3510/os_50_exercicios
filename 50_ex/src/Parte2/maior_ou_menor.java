package Parte2;

public class maior_ou_menor {
    public int numero1;
    public int numero2;


    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    


    public void maior_ou_menor(){
        if(this.numero1 > this.numero2){
            System.out.println("Numero 1 e maior que o 2: " + this.numero1 + " > " + this.numero2);
        } else if (this.numero1 < this.numero2){
            System.out.println("Numero 2 e maior que o 1: " + this.numero2 + " > " + this.numero1);
        } else {
            System.out.println("Os numeros sao iguais: " + this.numero1 + " = " + this.numero2);
        }
    }

}
