public class ComisionPersonalizada implements EstrategiaComision {
    private final int letrasNombre;

    public ComisionPersonalizada(String primerNombre) {
        this.letrasNombre = primerNombre.trim().length();
    }

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5 + letrasNombre) / 100.0;
        return montoVenta * porcentaje;
    }
}
