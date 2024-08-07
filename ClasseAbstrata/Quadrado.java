public class quadrado extends Figura {
    private double lado;

    public quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}