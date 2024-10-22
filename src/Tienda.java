import java.util.List;

public class Tienda {

	private String nombre;
	private String direccion;
	private int horarioApertura;
	private int horarioCierre;
	private List<Empleado> empleados;
	private List<Producto> productos;

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

}
