package Parte3;

import java.util.Scanner;

public class maior_menor_10 {
    public int num;
    public int maior;
    public int menor;
    public int i;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMaior() {
        return maior;
    }

    public int getMenor() {
        return menor;
    }

    public void maior_menor_10() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o um numero: ");
        num = teclado.nextInt();
        maior = num;   
        menor = num;

        for (i = 2; i <= 10; i++) {
            System.out.print("Digite o " + i + " numero: ");
            num = teclado.nextInt();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O MAIOR número digitado foi: " + maior);
        System.out.println("O MENOR número digitado foi: " + menor);
    }
}