public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Edgar", 1000.00);
        vendedor.cambiarEstrategia(new ComisionEstandar()); // estrategia por defecto
        vendedor.mostrarDetalle();
    }
}
