import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto();
        producto1.setCodigo(1);
        producto1.setDescripcion("papas lays");
        producto1.setPrecio(100);
        producto1.setCategoria("Frituras");
        producto1.setCantidad(10);

        Producto producto2 = new Producto();
        producto2.setCodigo(2);
        producto2.setDescripcion("Coca-Cola");
        producto2.setPrecio(150);
        producto2.setCategoria("Bebidas");
        producto2.setCantidad(5);

        // Crear empleado
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Jorge Diaz");
        empleado1.setID(101);
        empleado1.setCargo("Cajero");

        // Crear cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Gabriela Peñailillo");
        cliente1.setNumeroCliente(3312);
        cliente1.setCompras(new ArrayList<>());

        // Crear compra
        Compra compra1 = new Compra();
        compra1.setNumeroCompra(1233);
        compra1.setFechaCompra(new Date());
        compra1.setTotal(20000);
        compra1.setMedioPago("Tarjeta");
        compra1.setProductoscomprados(List.of(producto1));

        // Crear tienda
        Tienda tienda1 = new Tienda();
        tienda1.setNombre("Tienda A");
        tienda1.setDireccion("Calle 1");
        tienda1.sethorarioApertura(9);
        tienda1.sethorarioCierre(21);
        tienda1.setProductos(new ArrayList<>());
        tienda1.setEmpleados(new ArrayList<>());
        tienda1.setCliente(new ArrayList<>());

        // Agregar productos a la tienda
        tienda1.añadirProducto(producto1);
        tienda1.añadirProducto(producto2);
        tienda1.añadirCliente(cliente1);
        tienda1.agregarEmpleado(empleado1);

        // Crear ciudad
        Ciudad ciudad1 = new Ciudad();
        ciudad1.setNombre("Ciudad A");
        ciudad1.setCodigoPostal(456679);
        ciudad1.setTiendas(new ArrayList<>());
        ciudad1.crearTienda(tienda1);

        // Crear región
        Region region1 = new Region();
        region1.setNombre("Región A");
        region1.setCiudades(new ArrayList<>());
        region1.crearCiudad(ciudad1);

        // Crear territorio
        Territorio territorio = new Territorio();
        territorio.setNombre("Territorio pueblo nuevo");
        territorio.crearRegiones(region1);

        // Agregar compra al cliente
        cliente1.agregarCompras(compra1, tienda1, producto1.getCodigo());

        // Mostrar historial de compras del cliente
        cliente1.mostrarHistorialDeCompras();

        // Consultar productos de la tienda
        tienda1.consultarProductos();

        // Buscar empleado por ID
        tienda1.buscarEmpleadoPorID(101);

        // Consultar inventario de un producto
        tienda1.inventarioDeunProducto(producto1.getCodigo());

        // Modificar tienda
        ciudad1.modificarTienda("Tienda A", "Tienda A Modificada", "Calle 2", 10, 22);

        // Mostrar información de la región
        System.out.println("Nombre del territorio: " + territorio.getNombre());
        for (Region region : territorio.getRegiones()) {
            System.out.println("Región: " + region.getNombre());
            for (Ciudad ciudad : region.getCiudades()) {
                System.out.println("  Ciudad: " + ciudad.getNombre());
                for (Tienda tienda : ciudad.getTiendas()) {
                    System.out.println("    Tienda: " + tienda.getNombre());
                }
            }
        }
    }
}
