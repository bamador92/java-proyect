public class MiColeccion {

    //Agrega un elemento al final de la coleccion
    public void agregar(Object elm);

    //Inserte un elemento en la i-esima posicion
    public void insertar(Object elm, int i);

    //Retorna el i-esimo elemento de la coleccion
    public Object obtener(int i);

    //Elimina y retorna el objecto en la i-esima posicion
    public Object eliminar(int i);

    //Busca la primera ocurrencia del objecto especifico y
    //retorna la posicion donde lo encuentra o un valor
    //negativo si no encontro lo que buscaba
    public int buscar(Object elm);

    //Retorna la cantidad de elementos del conjunto
    public int cantidad();
}
