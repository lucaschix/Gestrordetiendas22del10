public class Empleado {

	private String nombre;
	private int ID;
	private String cargo;

	// Constructor que inicializa todos los atributos del empleado
	public Empleado(String nombre, int ID, String cargo) {
		this.nombre = nombre;
		this.ID = ID;
		this.cargo = cargo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
