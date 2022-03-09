public final class TestEstatico {

    //variable de instancia
    private int a = 0;

    //metodo de instancia
    public void unMetodo()
    {
        System.out.println("este es unMetodo()");
    }

    // metodo de clase (estatico)
    public static void main(String[] args)
    {
        TestEstatico t = new TestEstatico();


        //Accedemos a la variable a y al metodo unMetodo
        System.out.println("a vale " + t.a);
        t.unMetodo();
    }
}
