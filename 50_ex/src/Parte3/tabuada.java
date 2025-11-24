package Parte3;

public class tabuada {
    public int num;
    public int i;
    public int res;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

      public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void tabuada(){
        for (i = 1; i <= 10; i++){
            res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
}
