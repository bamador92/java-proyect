public class TestFecha {
    public static void main(String[] args) {
        //creamos una fecha y le agregamos
        //valores a sus atributos
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);

        //imprimimos el dia
        System.out.println("Dia = "+f.getDia());

        //Imprimimos el mes
        System.out.println("Mes = "+f.getMes());

        //Imprimimos el anio
        System.out.println("Año = "+f.getAnio());

        //Imprimimos toda las fechas
        System.out.println(f);
    }
}
