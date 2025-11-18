package Parte2;

public class IMC {
    public double peso;
    public double altura;
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void IMC(){
        double IMC = this.peso / (Math.pow(this.altura, 2));
        System.out.printf("Seu IMC e: %.2f\n", IMC);
        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC < 24.9){
            System.out.println("Peso normal");
        } else if ( IMC >= 25 && IMC < 29.9){
            System.out.println("Sobrepeso");
        } else if ( IMC >= 30 && IMC < 34.9){
            System.out.println("Obesidade grau 1");
        } else if ( IMC >= 35 && IMC < 39.9){
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }
    }
}
