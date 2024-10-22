import java.util.List;

public class Tienda {

	private String nombre;
	private String direccion;
	private int horarioApertura;
	private int horarioCierre;
	private List<Empleado> empleados;
	private List<Producto> productos;
	private List<Cliente> clientes;

	// Constructor que inicializa todos los atributos de la tienda
	public Tienda(String nombre, String direccion, int horarioApertura, int horarioCierre,
				  List<Empleado> empleados, List<Producto> productos, List<Cliente> clientes) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.empleados = empleados;
		this.productos = productos;
		this.clientes = clientes;
	}

	// Getter para nombre
	public String getNombre() {
		return this.nombre;
	}

	// Setter para nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter para dirección
	public String getDireccion() {
		return this.direccion;
	}

	// Setter para dirección
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Getter para horario de apertura
	public int getHorarioApertura() {
		return this.horarioApertura;
	}

	// Setter para horario de apertura
	public void sethorarioApertura(int horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	// Getter para horario de cierre
	public int getHorarioCierre() {
		return this.horarioCierre;
	}

	// Setter para horario de cierre
	public void sethorarioCierre(int horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

	// Getter para empleados
	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	// Setter para empleados
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	// Getter para productos
	public List<Producto> getProductos() {
		return this.productos;
	}

	// Setter para productos
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	// Método para agregar un empleado
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
		System.out.println("Empleado agregado correctamente. Sus datos son: Nombre: " + empleado.getNombre() + ", Cargo: " + empleado.getCargo() + ", ID identificador: " + empleado.getID());
	}

	public void eliminarEmpleado(Empleado nombreEmpleado) {
		empleados.remove(nombreEmpleado);
		System.out.println("Empleado " + nombreEmpleado + " eliminado");
		System.out.println(empleados);
	}

	public void buscarEmpleadoPorID(int ID) {
		for (Empleado empleado : empleados) {
			if (empleado.getID() == ID) {
				System.out.println("Cargo: " + empleado.getCargo() + ", ID: " + empleado.getID() + ", Nombre del empleado: " + empleado.getNombre());
				return; // Para salir del bucle si se encuentra
			}
		}
		System.out.println("No se encontró ningún empleado con el ID: " + ID);
	}

	public void añadirProducto(Producto producto) {
		productos.add(producto);
		System.out.println("Producto agregado correctamente");
	}

	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
		System.out.println("Producto " + producto.getCodigo() + " eliminado");
	}

	public void quitarProductosporCodigo(int codigo) {
		for (Producto producto : productos) {
			if (producto.getCodigo() == codigo) {
				if (producto.getCantidad() > 0) {
					producto.setCantidad(producto.getCantidad() - 1);
				} else {
					System.out.println("La cantidad es 0, no podemos restar productos a los cuales ya no tenemos en stock");
				}
				return; // Para salir del bucle una vez encontrado
			}
		}
	}

	public void agregarProductosporCodigo(int codigo) {
		for (Producto producto : productos) {
			if (producto.getCodigo() == codigo) {
				producto.setCantidad(producto.getCantidad() + 1);
				return; // Para salir del bucle una vez encontrado
			}
		}
	}

	public void consultarProductos() {
		for (Producto producto : productos) {
			System.out.println("- Datos del producto: \n Precio: " + producto.getPrecio() + "  Cantidad: " + producto.getCantidad() + " Categoria: " + producto.getCategoria() + " Precio: " + producto.getPrecio());
		}
	}

	public void inventarioDeunProducto(int codigo) {
		for (Producto producto : productos) {
			if (producto.getCodigo() == codigo) {
				if (producto.getCantidad() > 0) {
					System.out.println("La cantidad de " + producto.getCodigo() + " es: " + producto.getCantidad());
				} else {
					System.out.println("No hay unidades disponibles de " + producto.getCodigo());
				}
				return; // Para salir del bucle una vez encontrado
			}
		}
	}

	public void añadirCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente agregado correctamente");
	}

	public void eliminarCliente(Cliente cliente) {
		clientes.remove(cliente);
		System.out.println("Cliente " + cliente.getNombre() + " eliminado.");
	}

	public void buscarClientepornumerodeCliente(int numeroCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getNumeroCliente() == numeroCliente) {
				System.out.println("Cliente encontrado: " + cliente);
				return; // Para salir del bucle una vez encontrado
			}
		}
		System.out.println("No se encontró el cliente con el número: " + numeroCliente);
	}
}
