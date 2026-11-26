public class Carrito {

    private static final double IVA = 0.21;
    private double subtotal = 0;

    public void añadirProducto(Producto producto) {
        subtotal += producto.getPrecio();
    }

    public double totalConIva() {
        return subtotal * (1 + IVA);
    }

    public void mostrarTicket() {
        System.out.printf("Subtotal: %.2f €%n", subtotal);
        System.out.printf("Total con IVA: %.2f €%n",
                totalConIva());
    }
}