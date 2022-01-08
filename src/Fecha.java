import java.util.Objects;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /*public Fecha(int d, int m, int a)
    {
        dia = d;
        mes = m;
        anio = a;
    }*/

    //Constructor fecha que acepte el formato dd/mm/aaaa
    public Fecha(String s)
    {
        //Buscamos la primera ocurrencia de '/'
        int pos1 = s.indexOf('/');

        //Buscamos la ultima ocurrencia de '/'
        int pos2 = s.indexOf('/');

        //Procesamos el dia
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        //Procesamos el mes
        String sMes = s.substring(pos1+1, pos2);
        mes = Integer.parseInt(sMes);

        //Procesamos el anio
        String sAnio = s.substring(pos2+1);
        anio = Integer.parseInt(sAnio);

    }

    public Fecha(){

    }

    //Metodo equals
    public boolean equals(Object o)
    {
        Fecha otraFecha = (Fecha)o;
        return (dia==otraFecha.dia)
                && (mes==otraFecha.mes)
                && (anio==otraFecha.anio);
    }

    //Sobreescribimos el metodo toString
    public String toString()
    {
        //Retorno la presentacion de fecha que quiero
        return dia+"/"+mes+"/"+anio;
    }

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
