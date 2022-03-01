public class TestFigurasGeometricas {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(6, 2);
        System.out.println(rectangulo);
        Circulo circulo = new Circulo(5);
        System.out.println(circulo);
        Triangulo triangulo = new Triangulo(8,2);
        System.out.println(triangulo);

        FiguraGeometrica arr[] = { new Circulo(23)
                ,new Rectangulo(12,4)
                ,new Triangulo(2,5)};

        double prom = FiguraGeometrica.prom(arr);
        System.out.println("Promedio = " + prom);
    }
}
