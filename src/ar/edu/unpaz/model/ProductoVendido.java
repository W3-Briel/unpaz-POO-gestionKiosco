package ar.edu.unpaz.model;

public class ProductoVendido {
    private String nombre;
    private Double precioUnitario;
    private int cantidadVendida;
	public ProductoVendido(String nombre, double precioUnitario, int cantidadVendida) {
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantidadVendida = cantidadVendida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCantidadVendida() {
		return cantidadVendida;
	}
	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}
    
    
}
