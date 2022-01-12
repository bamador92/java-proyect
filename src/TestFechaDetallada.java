
public class TestFechaDetallada {
    public static void main(String[] args)
    {
        FechaDetallada f = new FechaDetallada();
        f.setDia(25);
        f.setMes(10);
        f.setAnio(2011);
        System.out.println(f);

        Fecha fec = new FechaDetallada("25/02/2017");
        Object obj = new FechaDetallada("03/12/2018");

        System.out.println("fec = " + fec);
        System.out.println("obj = " + obj);
    }

}
