import java.util.List;

public class Region {

	private String Nombre;
	public List<Ciudad> ciudades;

	public String getNombre() {
		// TODO - implement Region.getNombre
		throw new UnsupportedOperationException();
	}

	public void setNombre(String Nombre) {
		// TODO - implement Region.setNombre
		throw new UnsupportedOperationException();
	}

	public List<Ciudad> getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public void crearCiudad(Ciudad nameciudad){
		ciudades.add(nameciudad);
		System.out.println("Region "+getNombre()+" agregada");
	}
	public void eliminarCiudad(Ciudad nameciudad){
		ciudades.remove(nameciudad);
		System.out.println("Region "+getNombre()+" eliminada");
	}

	public void modificarCiudad(String nombreActual, String nuevoNombre, int nuevoCodigopostal) {
		for (Ciudad ciudad : ciudades) {
			if (ciudad.getNombre().equals(nombreActual)) {
				ciudad.setNombre(nuevoNombre);
				ciudad.setCodigoPostal(nuevoCodigopostal);
				System.out.println("Región " + nombreActual + " modificada a " + nuevoNombre+" codigo postal cambiado a: "+nuevoCodigopostal);
				return;
			}
		}
		System.out.println("No se encontró la región " + nombreActual);
	}

}