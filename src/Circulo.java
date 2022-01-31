public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double r)
    {
        super("Circulo");
        radio = r;
    }

    public double area() {
        //Retornamos "PI por radio al cuadrado"
        return Math.PI*Math.pow(radio,2);
    }
}
