import java.util.List;

public class Region {
	private String nombre; // Cambié Nombre a nombre para seguir una convención de nombres
	public List<Ciudad> ciudades;

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
		System.out.println("Región " + getNombre() + " agregada");
	}

	public void eliminarCiudad(Ciudad nameciudad) {
		ciudades.remove(nameciudad);
		System.out.println("Región " + getNombre() + " eliminada");
	}

	public void modificarCiudad(String nombreActual, String nuevoNombre, int nuevoCodigopostal) {
		for (Ciudad ciudad : ciudades) {
			if (ciudad.getNombre().equals(nombreActual)) {
				ciudad.setNombre(nuevoNombre);
				ciudad.setCodigoPostal(nuevoCodigopostal);
				System.out.println("Región " + nombreActual + " modificada a " + nuevoNombre + " codigo postal cambiado a: " + nuevoCodigopostal);
				return;
			}
		}
		System.out.println("No se encontró la región " + nombreActual);
	}
}
