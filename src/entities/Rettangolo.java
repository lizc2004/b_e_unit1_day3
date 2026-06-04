package entities;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getArea() {
        return base * altezza;
    }
    public double getPerimetro() {
        return 2 * (base + altezza);
    }

    @Override
    public String toString() {
        return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
    }
}

