
/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente, LineaPedido linea1, LineaPedido linea2) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.linea1 = linea1;
        this.linea2 = linea2; 
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva() {
        double precioProducto1 = linea1.getProducto().getPrecio() * linea1.getCantidad();
        double precioProducto2 = linea2.getProducto().getPrecio() * linea2.getCantidad();
        return precioProducto1 + precioProducto2;
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() {
        return getImporteAntesIva() * IVA;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() {
        return getImporteAntesIva() + getIva();
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String cadenaFormateada = String.format("FECHA PEDIDO: %s \n", fecha.toString(),
        "DATOS DEL CLIENTE \n %s", cliente.toString(),
        "\n", "**** Artículos en el pedido ****", "\n", "%s", linea1.toString(),
        "\n", "%s", linea2.toString(),
        "\n", "**** A pagar ****", "\n",
        "%20s %-8.2f", "\n", "IMPORTE SIN IVA: ", getImporteAntesIva(),
        "%20s %-8.2f", "\n", "IVA: ", getIva(),
        "%20s %-8.2f", "\n", "IMPORTE TOTAL: ", getImporteTotal());
        return cadenaFormateada; 
    }

    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) {
        return fecha.antesQue(otro.getFecha());
    }

    /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() {
        Pedido pedAct = new Pedido(fecha, cliente, linea1, linea2);
        return pedAct;
    }

}
