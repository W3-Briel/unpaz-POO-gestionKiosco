package ar.edu.unpaz.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import ar.edu.unpaz.model.ProductoVendido;
import ar.edu.unpaz.repo.ILectura;

public class ProductosService implements IProductosDatos{
	private ILectura productos;
	
	public ProductosService(ILectura repoProducto) {
		this.productos = repoProducto;
	}
	
	public List<ProductoVendido> getProductos() {
		try {
			return productos.leerProductos();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Error e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public Map<String, Double> totalPorProducto() {
		Map<String, Double> totalXproduct = new HashMap<String, Double>();
		this.getProductos().forEach(p -> totalXproduct.put(p.getNombre(), (double) p.getCantidadVendida()));
		
		return totalXproduct;
	}

	@Override
	public double totalRecaudado() {
		return this.getProductos().stream()
				.mapToDouble(p -> p.getPrecioUnitario() * p.getCantidadVendida())
				.sum();
	}

	@Override
	public ProductoVendido masVendido() {
		Optional<ProductoVendido> masVendido = this.getProductos()
			.stream()
			.reduce((p1, p2) -> p1.getCantidadVendida() > p2.getCantidadVendida() ? p1 : p2);
		
		return masVendido.get();
	}

	@Override
	public Map<String, Double> promedioUnidadesPorProducto() {
		Map<String, Double> promedio = new HashMap<String, Double>();
		List<ProductoVendido> productos = this.getProductos();
		
		Double totalProductos = productos.stream()
										.mapToDouble(p -> p.getCantidadVendida())
										.sum();

		productos.forEach(p -> {
			promedio.put(p.getNombre(),p.getCantidadVendida()/totalProductos);
		});
		
		return promedio;
	}
	
	
}
