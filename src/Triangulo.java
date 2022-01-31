public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(double b, double h)
    {
        super("Triangulo");
        base = b;
        altura = h;
    }

    public double area() {
        return base * altura/2;
    }
}
