import java.util.Scanner;

public class Empleado {
    private Scanner teclado;
    private String nombre;
    private String apellido;
    private String codigo;
    private int hsTrab;

    private void inicializador(){

        teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.next();

        System.out.println("Ingrese el apellido del empleado: ");
        apellido = teclado.next();

        System.out.println("Ingrese el codigo: ");
        codigo = teclado.next();

        System.out.println("Ingrese cantidad de horas trabajadas: ");
        hsTrab = teclado.nextInt();
    }

    public void imprimir() {
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("codigo = " + codigo);
        System.out.println("hsTrab = " + hsTrab);
    }

    public void horasExtras() {
        if (hsTrab>8) {
            System.out.println(nombre + " " + apellido + " trabajo horas extras");
        } else {
            System.out.println(nombre + " " + apellido + " trabajo horas normales");
        }
    }

    public static void main(String [] ar) {
        Empleado empleado1 = new Empleado();
        empleado1.inicializador();
        empleado1.imprimir();
        empleado1.horasExtras();
    }
}

