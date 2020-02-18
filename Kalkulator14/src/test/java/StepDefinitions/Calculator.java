package StepDefinitions;

public class Calculator {
    double a, b;

    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double add() {
        return this.a + this.b;
    }

    double add(double a, double b) {
        return a + b;
    }


}
