public class Circulo {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
