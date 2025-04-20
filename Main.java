public class Main {
    public static void main(String[] args) {
        // Instancia de un cuadrado y un círculo
        Cuadrado cuadrado = new Cuadrado(5);  // Lado del cuadrado
        Circulo circulo = new Circulo(7);    // Radio del círculo

        // Cálculo de las áreas
        double areaCuadrado = cuadrado.calcularArea();
        double areaCirculo = circulo.calcularArea();

        // Diferencia de áreas
        double diferencia = areaCuadrado - areaCirculo;

        // Impresión de los resultados
        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Diferencia entre el área del cuadrado y el área del círculo: " + diferencia);
    }
}
