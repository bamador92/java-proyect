public class TestNumero {
    public static void main(String[] args) {
        //Sumamos utilizando el metodo estatico
        double d = Numero.sumar(2,3);
        System.out.println(d);

        //Definimos un numero con valor 5 y luego
        //Sumamos 4 con el metodo sumar de instancia
        Numero n1 = new Numero(5);
        n1.sumar(4);

        //Salida: 9
        System.out.println(n1);

        //Sumamos concatenando invocaciones al metodo sumar
        n1.sumar(4).sumar(6).sumar(8).sumar(1);
        System.out.println(n1); //Salida 28
    }
}
