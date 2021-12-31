import java.util.Scanner;

public class Funciones {
     public static double factorial(int n)
     {
          //Calcular el factorial de n
          double r = 1;
          for(int i=2; i<=n; i++)
          {
               r = r * i;
          }
          return r;
     }

     //Determina si n es un numero primo o no
     public static boolean esPrimo(int n){
          int i=2;
          while (n%i != 0 && i<n )
          {
               i++;
          }

          //si i es igual a n entonces: i==n es true
          return i == n;
     }

     public static void main(String[] args) {
          //Para ingresar los datos por teclado
          Scanner scanner = new Scanner(System.in);

          //El usuario ingresa un valor
          System.out.println("Ingrese un valor: ");
          int n = scanner.nextInt();

          //Calculamos el factorial
          double f = factorial(n);
          System.out.println("Factorial de "+n+": "+f);

          //Determinamos si es un numero primo o no
          boolean p = esPrimo(n);

          //if en linea
          String mssg = p? " es ": " no es ";
          System.out.println(n+mssg+"primo");

          scanner.close();
     }
}
