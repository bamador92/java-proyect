//Revisar

public class FechaDetallada2 extends Fecha
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


    public FechaDetallada2(String f){
    }

    public String toString()
    {
        int m = getMes() - 1;
        return getDia()+" de "+meses[m]+" de "+getAnio();
    }

}
