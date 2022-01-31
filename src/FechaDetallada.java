public class FechaDetallada extends Fecha
{
    private static String meses[] = {"Enero"
            ,"Febrero"
            ,"Marzo"
            ,"Abril"
            ,"Mayo"
            ,"Junio"
            ,"Julio"
            ,"Agosto"
            ,"Septiembre"
            ,"Octubre"
            ,"Noviembre"
            ,"Diciembre"};

    public FechaDetallada(int dia, int mes, int anio){
        super(dia, mes, anio);
    }

    public FechaDetallada(String s) {
        super(s);
    }

    public FechaDetallada() {

    }

    public String toString()
    {
        int m = getMes() - 1;
        return getDia()+" de "+meses[m]+" de "+getAnio();
    }

}
