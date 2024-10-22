import java.util.List;

public class Ciudad {

	private String Nombre;
	private int codigoPostal;
	private List<Tienda> tiendas;

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

	public void crearTienda(Tienda  nametienda){
		tiendas.add(nametienda);
		System.out.println("Region "+getNombre()+" agregada");
	}
	public void eliminarTienda(Tienda nametienda){
		tiendas.remove(nametienda);
		System.out.println("Region "+getNombre()+" eliminada");
	}

	public void modificarTienda(String nombreActual, String nuevoNombre, String nuevaDireccion, int nuevoHApertura,int nuevoHCierre) {
		for (Tienda tienda : tiendas) {
			if (tienda.getNombre().equals(nombreActual)) {
				tienda.setNombre(nuevoNombre);
				tienda.setDireccion(nuevaDireccion);
				tienda.sethorarioApertura(nuevoHApertura);
				tienda.sethorarioCierre(nuevoHCierre);
				System.out.println("Región " + nombreActual + " modificada a " + nuevoNombre+ "mueva direccion: "+nuevaDireccion+" nuevo horario de atencion de "+nuevoHApertura+" a "+nuevoHCierre);
				return;
			}
		}
		System.out.println("No se encontró la tienda que buscas puede que este en otra ciudad o region con el nombre " + nombreActual);
	}


}