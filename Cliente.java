
/**
 *  Representa a un cliente que hace un pedido 
 *  @author Gaizka Lumbreras Huarte
 */
public class Cliente
{
    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;

    /**
     * Constructor  
     */
    public Cliente(String nombre, String direccion, String ciudad, String provincia)    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    /**
     * accesor para el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * accesor para la dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * accesor para la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * accesor para la provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * representación textual del cliente
     */
    public String toString() {
        String cadenaFormateada = String.format("%10s","NOMBRE","%-10s", nombre,
                "%10s","DIRECCION","%-10s", direccion,
                "%10s","CIUDAD","%-10s", ciudad,
                "%10s","PROVINCIA","%-10s", provincia);
        return cadenaFormateada;       
    }

    /**
     *  
     */
    public void print() {
        System.out.println(this.toString());
    }

}
