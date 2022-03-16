public class MiColeccion {

    private static final int CAP_INIC=10;

    private Object datos[] = null;
    private int len = 0;

    public MiColeccion()
    {
        datos = new Object[CAP_INIC];
    }

    //Retorna el i-esimo elemento de la coleccion
    public Object obtener(int i)
    {
        return datos[i];
    }

    public int cantidad()
    {
        return len;
    }

    private void verificarYAgrandar()
    {
        if( len == datos.length )
        {
            Object nuevo[] = new Object[datos.length*2];

            for(int i=0; i<datos.length; i++)
            {
                nuevo[i] = datos[i];
            }

            datos = nuevo;
            nuevo = null;
        }
    }

    //Inserte un elemento en la i-esima posicion
    public void insertar(Object elm,int i)
    {

        //Si corresponde agrandamos el array
        verificarYAgrandar();
        for(int j=len-1; j>=i; j--)
        {
            datos[j+1] = datos[j];
        }

        datos[i] = elm;
        len++;
    }

    //Busca la primera ocurrencia del objecto especifico y
    //retorna la posicion donde lo encuentra o un valor
    //negativo si no encontro lo que buscaba
    public int buscar(Object elm)
    {
        int i=0;
        while( i<len && !datos[i].equals(elm) )
        {
            i++;
        }

        return i<len?i:-1;
    }

    //Agrega un elemento al final de la coleccion
    public void agregar(Object elm)
    {
        insertar(elm, len);
    }

    //Elimina y retorna el objecto en la i-esima posicion
    public Object eliminar(int i)
    {
        Object aux = datos[i];
        for (int j=i; j<len-1; j++)
        {
            datos[j] = datos[j+1];
        }

        len--;
        return aux;
    }

    public static void main(String[] args){
        MiColeccion mc = new MiColeccion();
        mc.insertar("Pedro", 0);
        mc.insertar("Pablo", 0);
        mc.insertar("Juan", 0);

        for(int i=0; i<mc.cantidad(); i++)
        {
            String s = (String)mc.obtener(i);
            System.out.println(s);
        }
    }
}
