import java.util.ArrayList;
import java.util.List;

public class Territorio {

	private String nombre;
	private List<Region> regiones;

	// Constructor para inicializar la lista de regiones
	public Territorio() {
		this.regiones = new ArrayList<>(); // Inicializa la lista de regiones
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Region> getRegiones() {
		return this.regiones;
	}

	public void setRegiones(List<Region> regiones) {
		this.regiones = regiones;
	}

	public void crearRegiones(Region nameregion, String nombre) {
		regiones.add(nameregion);
		System.out.println("Región " + nameregion.getNombre() + " agregada al territorio " + getNombre());
	}

	public void eliminarRegion(Region nameregion) {
		regiones.remove(nameregion);
		System.out.println("Región " + nameregion.getNombre() + " eliminada del territorio " + getNombre());
	}

	public void modificarRegion(String nombreActual, String nuevoNombre) {
		for (Region region : regiones) {
			if (region.getNombre().equals(nombreActual)) {
				region.setNombre(nuevoNombre);
				System.out.println("Región " + nombreActual + " modificada a " + nuevoNombre);
				return;
			}
		}
		System.out.println("No se encontró la región con el nombre " + nombreActual);
	}

	public void buscarTiendasPorRegion(String nombreRegion) {
		for (Region region : regiones) {
			if (region.getNombre().equals(nombreRegion)) {
				System.out.println("Tiendas en la región " + nombreRegion + ":");
				for (Ciudad ciudad : region.getCiudades()) {
					List<Tienda> tiendas = ciudad.getTiendas();
					if (!tiendas.isEmpty()) {
						System.out.println("  Ciudad: " + ciudad.getNombre());
						for (Tienda tienda : tiendas) {
							System.out.println("    - " + tienda.getNombre());
						}
					} else {
						System.out.println("  No hay tiendas en la ciudad " + ciudad.getNombre());
					}
				}
				return;
			}
		}
		System.out.println("No se encontró la región con el nombre " + nombreRegion);
	}
}
