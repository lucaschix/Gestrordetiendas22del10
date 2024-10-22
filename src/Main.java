import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan Pérez", 1, "Vendedor");
        Empleado empleado2 = new Empleado("Ana Gómez", 2, "Gerente");

        // Crear productos
        Producto producto1 = new Producto(101, "Laptop", 800, "Electrónica", 10);
        Producto producto2 = new Producto(102, "Teléfono", 500, "Electrónica", 5);

        // Crear clientes
        Cliente cliente1 = new Cliente("Carlos Ruiz", 1001);
        Cliente cliente2 = new Cliente("Lucía Salazar", 1002);

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

        Tienda tienda = new Tienda("ElectroShop", "Calle 123", 9, 21, empleados, productos, clientes);

        // Probar métodos de Tienda
        tienda.agregarEmpleado(new Empleado("Pedro González", 3, "Cajero"));
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
        tienda.buscarClientepornumerodeCliente(1002);

        // Crear una compra
        List<Producto> productosComprados = new ArrayList<>();
        productosComprados.add(producto2);
        Compra compra1 = new Compra(1, new Date(), 500, "Tarjeta de crédito", productosComprados);

        // Agregar compra al cliente
        cliente2.agregarCompras(compra1, tienda, 102);
        cliente2.mostrarHistorialDeCompras();

        // Crear ciudad y agregar tienda
        Ciudad ciudad = new Ciudad("Metropolis", 12345);
        ciudad.crearTienda(tienda);

        // Crear región y agregar ciudad
        Region region = new Region("Región Central");
        region.crearCiudad(ciudad);

        // Crear territorio y agregar región
        Territorio territorio = new Territorio();
        territorio.crearRegiones(region, "Región Central");

        // Buscar tiendas por región
        territorio.buscarTiendasPorRegion("Región Central");

        // Modificar atributos de la tienda
        ciudad.modificarTienda("ElectroShop", "ElectroShop Nueva", "Avenida 456", 10, 20);

        // Eliminar tienda
        ciudad.eliminarTienda(tienda);
    }
}
