public class Persona {

    private String nombre;
    private String dni;
    private Fecha fechaDeNacimiento;
    private int cont = 0;

    public Persona(String nombre, String dni, Fecha fecNac)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fecNac;
    }

    public String toString()
    {
        cont++;
        String ret = "";
        ret+=nombre+", ";
        ret+="DNI: "+dni+" ";
        ret+="nacido el: "+fechaDeNacimiento+" ";
        ret+="("+cont+") ";

        return ret;
    }
}
