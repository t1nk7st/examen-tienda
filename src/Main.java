public class Main {

    public static void main(String[] args) {

        Producto teclado = new Producto("Teclado", 30);
        Producto raton = new Producto("Ratón", 20);

        Carrito carrito = new Carrito();

        carrito.añadirProducto(teclado);
        carrito.añadirProducto(raton);

        carrito.mostrarTicket();

        System.out.printf("Con un 10 %% de descuento: %.2f €%n",
                carrito.totalConDescuento(10));
    }
}