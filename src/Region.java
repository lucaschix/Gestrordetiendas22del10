import java.util.ArrayList;
import java.util.List;

public class Region {
	private String nombre; // Cambié Nombre a nombre para seguir una convención de nombres
	public List<Ciudad> ciudades;

	// Constructor que inicializa el nombre y la lista de ciudades
	public Region(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<>(); // Inicializa la lista de ciudades
	}

	public String getNombre() {
		return this.nombre; // Retorna el nombre de la región
	}

	public void setNombre(String nombre) {
		this.nombre = nombre; // Asigna un nuevo nombre a la región
	}

	public List<Ciudad> getCiudades() {
		return this.ciudades; // Retorna la lista de ciudades
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades; // Asigna una nueva lista de ciudades
	}

	public void crearCiudad(Ciudad nameciudad) {
		ciudades.add(nameciudad);
		System.out.println("Ciudad " + nameciudad.getNombre() + " agregada a la región " + getNombre());
	}

	public void eliminarCiudad(Ciudad nameciudad) {
		ciudades.remove(nameciudad);
		System.out.println("Ciudad " + nameciudad.getNombre() + " eliminada de la región " + getNombre());
	}

	public void modificarCiudad(String nombreActual, String nuevoNombre, int nuevoCodigopostal) {
		for (Ciudad ciudad : ciudades) {
			if (ciudad.getNombre().equals(nombreActual)) {
				ciudad.setNombre(nuevoNombre);
				ciudad.setCodigoPostal(nuevoCodigopostal);
				System.out.println("Ciudad " + nombreActual + " modificada a " + nuevoNombre + " con código postal cambiado a: " + nuevoCodigopostal);
				return;
			}
		}
		System.out.println("No se encontró la ciudad " + nombreActual);
	}
}
