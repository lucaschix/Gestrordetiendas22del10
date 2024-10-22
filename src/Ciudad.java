import java.util.ArrayList;
import java.util.List;

public class Ciudad {

	private String Nombre;
	private int codigoPostal;
	private List<Tienda> tiendas;

	// Constructor que inicializa el nombre, el código postal y la lista de tiendas
	public Ciudad(String nombre, int codigoPostal) {
		this.Nombre = nombre;
		this.codigoPostal = codigoPostal;
		this.tiendas = new ArrayList<>(); // Inicializa la lista de tiendas
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public List<Tienda> getTiendas() {
		return this.tiendas;
	}

	public void setTiendas(List<Tienda> tiendas) {
		this.tiendas = tiendas;
	}

	public void crearTienda(Tienda nametienda) {
		tiendas.add(nametienda);
		System.out.println("Tienda " + nametienda.getNombre() + " agregada a la ciudad " + getNombre());
	}

	public void eliminarTienda(Tienda nametienda) {
		tiendas.remove(nametienda);
		System.out.println("Tienda " + nametienda.getNombre() + " eliminada de la ciudad " + getNombre());
	}

	public void modificarTienda(String nombreActual, String nuevoNombre, String nuevaDireccion, int nuevoHApertura, int nuevoHCierre) {
		for (Tienda tienda : tiendas) {
			if (tienda.getNombre().equals(nombreActual)) {
				tienda.setNombre(nuevoNombre);
				tienda.setDireccion(nuevaDireccion);
				tienda.sethorarioApertura(nuevoHApertura);
				tienda.sethorarioCierre(nuevoHCierre);
				System.out.println("Tienda " + nombreActual + " modificada a " + nuevoNombre + ", nueva dirección: " + nuevaDireccion + ", nuevo horario de atención: " + nuevoHApertura + " a " + nuevoHCierre);
				return;
			}
		}
		System.out.println("No se encontró la tienda que buscas; puede que esté en otra ciudad o región con el nombre " + nombreActual);
	}
}
