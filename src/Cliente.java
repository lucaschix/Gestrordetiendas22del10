import java.util.List;

public class Cliente {

	private String nombre;
	private int numeroCliente;
	private List<Compra> compras;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCliente() {
		return this.numeroCliente;
	}

	/**
	 * 
	 * @param numeroCliente
	 */
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	/**
	 * 
	 * @param compras
	 */
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

}