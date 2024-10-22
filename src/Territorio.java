import java.util.List;

public class Territorio {

	private String nombre;
	private List<Region> regiones;

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

	public void agregarRegion(String nombre) {
		// TODO - implement Territorio.agregarRegion
		throw new UnsupportedOperationException();
	}

	public void modificarRegion(int id, String nombre) {
		// TODO - implement Territorio.modificarRegion
		throw new UnsupportedOperationException();
	}

	public void eliminarRegion(int id) {
		// TODO - implement Territorio.eliminarRegion
		throw new UnsupportedOperationException();
	}

	public List<Region> consultarRegiones() {
		// TODO - implement Territorio.consultarRegiones
		throw new UnsupportedOperationException();
	}
	public void crearregiones(Region  nameregion){
		regiones.add(nameregion);
		System.out.println("Region "+getNombre()+" agregada");
	}
	public void eliminarRegion(Region nameregion){
		regiones.remove(nameregion);
		System.out.println("Region "+getNombre()+" eliminada");
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

}