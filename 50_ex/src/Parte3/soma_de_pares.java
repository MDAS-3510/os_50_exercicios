package Parte3;

public class soma_de_pares {
    public int soma = 0;
    public int i;

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void soma_de_pares(){
        for (i = 1; i <= 50; i++){
            if (i % 2 == 0){
                soma += i;
            }
            
        }
        System.out.println("A soma dos pares e: " + soma);
    }
}

/*
 * 
 * public void soma_de_pares_while(){
 * 
 * while (i <= 50) { // enquanto i for menor ou igual a 50, continua repetindo
 * if (i % 2 == 0) { // se o número atual for par
 * soma = soma + i; // adiciona ele na soma (ou soma += i;)
 * }
 * i++; // aumenta i de 1 em 1 (equivalente ao i++ do for)
 * }
 * 
 * System.out.println("A soma dos pares de 1 a 50 é: " + soma);
 * }
 * }
 * 
 */
