package Parte1;

public class conversao {
    public double celsius;
    public double fahrenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void converterParaFahrenheit() {
        fahrenheit = (this.celsius * 9/5) + 32;
        System.out.println(this.celsius + " graus Celsius equivalem a " + this.fahrenheit + " graus Fahrenheit.");
    }

}
