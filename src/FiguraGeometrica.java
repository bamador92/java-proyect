public abstract class FiguraGeometrica {

    private String nombre;

    //metodo abstracto
    public abstract double area();

    //agregamos un constructor
    public FiguraGeometrica(String nom)
    {
        nombre = nom;
    }

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
