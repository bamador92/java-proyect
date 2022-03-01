public abstract class FiguraGeometrica {

    private String nombre;

    //metodo abstracto
    public abstract double area();

    public static double prom(FiguraGeometrica arr[])
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i].area();
        }
        return sum / arr.length;
    }

    //agregamos un constructor
    public FiguraGeometrica(String nom)
    {
        nombre = nom;
    }

    //ahora en el toString tambien mostramos el nombre
    public String toString() {
        return nombre + " (area = " + area()+") ";
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
