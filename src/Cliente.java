import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private int numeroCliente;
	private List<Compra> compras;

	// Constructor que inicializa el nombre, el número de cliente y la lista de compras
	public Cliente(String nombre, int numeroCliente) {
		this.nombre = nombre;
		this.numeroCliente = numeroCliente;
		this.compras = new ArrayList<>(); // Inicializa la lista de compras
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCliente() {
		return this.numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public void agregarCompras(Compra compra, Tienda tienda, int codigo) {
		compras.add(compra);
		System.out.println("Compra agregada ... Detalles de la compra\n Total: " + compra.getTotal() +
				" Medio de pago: " + compra.getMedioPago() +
				" Productos comprados: " + compra.getProductoscomprados());
		tienda.quitarProductosporCodigo(codigo);
	}

	public void mostrarHistorialDeCompras() {
		for (Compra compra : compras) {
			if (compra.getProductoscomprados() != null) {
				System.out.println("Compras pasadas, fecha de compra: " + compra.getFechaCompra() +
						", Total: " + compra.getTotal() +
						", Número de compra: " + compra.getNumeroCompra());
			}
		}
	}
}
