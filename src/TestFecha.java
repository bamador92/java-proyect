public class TestFecha {
    public static void main(String[] args) {
        //creamos una fecha y le agregamos
        //valores a sus atributos
        Fecha f = new Fecha("dd/mm/aaaa");

        //imprimimos el dia
        System.out.println("Dia = "+f.getDia());

        //Imprimimos el mes
        System.out.println("Mes = "+f.getMes());

        //Imprimimos el anio
        System.out.println("Año = "+f.getAnio());

        //Imprimimos toda las fechas
        System.out.println(f);


        // test para saber si 2 fechas son iguales
        Fecha f1 = new Fecha("02/10/1970");

        Fecha f2 = new Fecha("02/10/1970");

        if (f1.equals(f2))
        {
            System.out.println("Son iguales");
        }

    }
}
