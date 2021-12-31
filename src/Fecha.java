public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    //getter para el atributo dia
    public int getDia() {
        //Retornamos el valor de la variable dia
        return dia;
    }

    //Setter para el atributo dia
    public void setDia(int d){
        //Asignamos el valor del parametro a la variable dia
        dia = d;
    }

    //getter y setter para los demas parametros

    public int getMes() { return mes; }
    public void setMes(int m) { mes = m; }
    public int getAnio() { return anio; }
    public void setAnio(int a) { anio = a; }
}
