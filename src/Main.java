import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Jorge Diaz", 1, "Cajero");
        Empleado empleado2 = new Empleado("Gabriela Peñailillo", 2, "Presidenta");

        // Crear productos
        Producto producto1 = new Producto(101, "Coca-cola", 800, "Frituras", 10);
        Producto producto2 = new Producto(102, "Papas Fritas", 500, "Bebidas", 5);

        // Crear clientes
        Cliente cliente1 = new Cliente("Oscar Aguayo", 1003);
        Cliente cliente2 = new Cliente("Carlos Cares", 1043);

        // Crear una tienda
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);

        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        Tienda tienda = new Tienda("Lider", "Calle 123", 9, 21, empleados, productos, clientes);

        // Probar métodos de Tienda
        tienda.agregarEmpleado(new Empleado("Ariel Soto", 33, "Dueño"));
        tienda.eliminarEmpleado(empleado1);
        tienda.buscarEmpleadoPorID(2);

        tienda.añadirProducto(new Producto(103, "Tablet", 300, "Electrónica", 15));
        tienda.eliminarProducto(producto1);
        tienda.quitarProductosporCodigo(102);
        tienda.agregarProductosporCodigo(102);
        tienda.consultarProductos();
        tienda.inventarioDeunProducto(102);

        tienda.añadirCliente(new Cliente("María López", 1003));
        tienda.eliminarCliente(cliente1);
        tienda.buscarClientepornumerodeCliente(1003);

        // Crear una compra
        List<Producto> productosComprados = new ArrayList<>();
        productosComprados.add(producto2);
        Compra compra1 = new Compra(1, new Date(), 500, "Tarjeta de crédito", productosComprados);

        // Agregar compra al cliente
        cliente2.agregarCompras(compra1, tienda, 102);
        cliente2.mostrarHistorialDeCompras();

        // Crear ciudad y agregar tienda
        Ciudad ciudad = new Ciudad("Temuco", 3312);
        ciudad.crearTienda(tienda);

        // Crear región y agregar ciudad
        Region region = new Region("Región de la Araucania");
        region.crearCiudad(ciudad);

        // Crear territorio y agregar región
        Territorio territorio = new Territorio();
        territorio.crearRegiones(region, "Territorio centro-sur");

        // Buscar tiendas por región
        territorio.buscarTiendasPorRegion("Región de la Araucania");

        // Modificar atributos de la tienda
        ciudad.modificarTienda("Lider", "Jumbo", "Santa Rosa 3312", 10, 20);

        // Eliminar tienda
        ciudad.eliminarTienda(tienda);
    }
}
