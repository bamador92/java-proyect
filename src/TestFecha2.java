import java.util.Scanner;

public class TestFecha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //El usuario ingresa los datos de una fecha
        System.out.println("Ingrese primer fecha (dia, mes y año): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();

        //Instanciamos un objeto de la clase fecha
        Fecha f1 = new Fecha("dd/mm/aaaa");

        //El usuario ingresa los datos de la segunda fecha
        System.out.println("Ingrese segunda fecha (dia, mes y año): ");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        anio = scanner.nextInt();

        //Instanciamos un objeto de la clase fecha
        Fecha f2 = new Fecha("dd/mm/aaaa");

        //mostramos las fechas por consola
        System.out.println("primer fecha = " + f1);
        System.out.println("segunda fecha = " + f2);

        //Comparamos las fechas
        if( f1.equals(f2) )
        {
            System.out.println("Son iguales! ");
        }
        else
        {
            System.out.println(" Son distintas..... ");
        }

    }
}
