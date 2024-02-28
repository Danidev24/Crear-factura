package appFacturas.modelo;

public class ItemFactura {
    private int cantidad;

    //itemFactura esta asociado al producto.
    private Producto producto;

    // constructor para inicializar cantidad y producto
    public ItemFactura(int cantidad, Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }


    public Producto getProducto(){
        return producto;
    }

    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public float calcularImporte(){
        return this.cantidad * this.producto.getPrecio();
    }

    @Override
    public String toString(){
        return producto.toString() + "\t"
               + cantidad + "\t"
               + calcularImporte();
    }
}
