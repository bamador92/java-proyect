
public class TestFechaDetallada {
    public static void main(String[] args)
    {

        FechaDetallada f1 = new FechaDetallada("14/02/1992");
        FechaDetallada f2 = new FechaDetallada(14, 02, 1992);
        FechaDetallada f3 = new FechaDetallada();

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

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
