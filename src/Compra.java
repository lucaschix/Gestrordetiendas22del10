import java.util.Date;
import java.util.List;

public class Compra {

	private int numeroCompra;
	private Date fechaCompra;
	private int total;
	private String medioPago;
	private List<Producto> productoscomprados;


	public int getNumeroCompra() {
		return this.numeroCompra;
	}
	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public Date getFechaCompra() {
		return this.fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getTotal() {
		return this.total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMedioPago() {
		return this.medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public List<Producto> getProductoscomprados() {
		return this.productoscomprados;
	}
	public void setProductoscomprados(List<Producto> productoscomprados) {
		this.productoscomprados = productoscomprados;
	}



}