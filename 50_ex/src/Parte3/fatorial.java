package Parte3;

public class fatorial {
    public int num;
    public int fatorial;
    public int i;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getFatorial() {
        return fatorial;
    }
    public void setFatorial(int fatorial) {
        this.fatorial = fatorial;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

    public void fatorial(){
        fatorial = 1;

        for (i =1; i <= num; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + num + " e: " + fatorial);
    }
}
