public class TestBloqueEstatico {

    // bloque estatico
    static
    {
        System.out.println("-- Bloque estatico --");
    }

    //Constructor
    public TestBloqueEstatico(String n)
    {
        System.out.println("Constructor: " + n);
    }

    public static void main(String[] args)
    {
        new TestBloqueEstatico("Juan");
        new TestBloqueEstatico("Pedro");
        new TestBloqueEstatico("Pablo");
    }
}
