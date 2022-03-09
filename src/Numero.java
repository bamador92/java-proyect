public class Numero {

    //Atributo
    private double valor;

    public Numero sumar(double a)
    {
        valor+=a;
        return this;
    }

    //Constructor
    public Numero(double v)
    {
        valor = v;
    }

    @Override
    public String toString()
    {
        return Double.toString(valor);
    }

    public static double sumar(double a, double b)
    {
        return a+b;
    }
}
