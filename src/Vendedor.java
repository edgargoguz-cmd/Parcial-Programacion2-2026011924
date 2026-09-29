public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("Nombre: " + nombre);
        System.out.printf("Venta total: $%.2f%n", ventasMes);
        System.out.printf("Comision: $%.2f%n", comision);
    }
}
