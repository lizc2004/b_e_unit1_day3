import entities.Rettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(5, 6);
        Rettangolo r2 = new Rettangolo(10, 12);
        stampaDueRettangoli(r, r2);

        }
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Area e perimetro di r1: " + r1.getArea() + ", " + r1.getPerimetro());
        System.out.println("Area e perimetro di r2: " + r2.getArea() + ", " + r2.getPerimetro());
        System.out.println("Somma delle aree: " + (r1.getArea() + r2.getArea()));
        System.out.println("Somma dei perimetri: " + (r1.getPerimetro() + r2.getPerimetro()));
    }
    }


