import java.util.List;

public class Tienda {

	private String nombre;
	private String direccion;
	private int horarioApertura;
	private int horarioCierre;
	private List<Empleado> empleados;
	private List<Producto> productos;
	private List<Cliente> clientes;

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

	public List<Cliente> getCliente() {
		return this.clientes;
	}


	public void setCliente(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	// Método para agregar un empleado (debes implementarlo)
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
		System.out.println("Empleado agregado correctamente sus datos son:"+ "Nombre: " +empleado.getNombre()+"Cargo:"+empleado.getCargo()+"ID identificador: "+empleado.getID());

	}
	public void eliminarEmpleado(Empleado nombreEmpleado){
		empleados.remove(nombreEmpleado);
		System.out.println("Empleado "+nombreEmpleado+" eliminado");
		System.out.println(empleados);


	}
	public void buscarEmpleadoPorID(int ID) {

		for (Empleado empleado : empleados) {
			if (empleado.getID() == ID) {
				System.out.println("Cargo: " + empleado.getCargo() +
						", ID: " + empleado.getID() +
						", Nombre del empleado: " + empleado.getNombre());

				break;
			}else{
				System.out.println("No se encontró ningún empleado con el ID: " + ID);
			}
		}

	}
	public void  añadirProducto(Producto producto) {
		productos.add(producto);
		System.out.println("Producto agregado correctamente");

	}
	public  void eliminarProducto(Producto producto){
		productos.remove(producto);
		System.out.println("Producto " +producto.getCodigo()+" eliminado");
	}
	public void quitarProductosporCodigo(int codigo){
		for(Producto producto : productos){
			if(producto.getCodigo() == codigo ){
				if(producto.getCantidad()>0){
					producto.setCantidad(producto.getCantidad() - 1);
				}else{
					System.out.println("La cantidad es 0 no podemos restar productos a los cuales ya no tenemos en stock");
				}


			}
		}
	}

	public void agregarProductosporCodigo(int codigo){
		for(Producto producto : productos){
			if(producto.getCodigo() == codigo ){
				if(producto.getCantidad()>=0){
					producto.setCantidad(producto.getCantidad() + 1);
				}
			}
		}
	}

	public void consultarProductos(){
		for( Producto producto : productos){
			System.out.println("-Datos del producto: \n Precio" +producto.getCodigo()+"  Cantidad: "+producto.getCantidad()+" Categoria: "+producto.getCategoria()+" Precio: "+producto.getPrecio());
		}
	}

	public void inventarioDeunProducto(int codigo){
		for (Producto producto : productos){
			if(producto.getCodigo() == codigo ){
				if(producto.getCantidad()>0){
					System.out.println("La cantidad de "+producto.getCodigo()+" es: "+producto.getCantidad());
				}else{
					System.out.println("no hay productos unidades disponibles de "+producto.getCodigo());
				}
			}
		}
	}

	public void  añadirCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Producto agregado correctamente");

	}
	public  void eliminarCliente(Cliente cliente){
		clientes.remove(cliente);
		System.out.println("Producto " +cliente.getNombre()+" eliminado se porto muy mal el tipo");
	}

	public void buscarClientepornumerodeCliente(int numeroCliente){
		for(Cliente cliente : clientes){
			if(cliente.getNumeroCliente() ==numeroCliente){
				System.out.println("CLiente encontrado"+cliente);
			}
		}
	}


}
