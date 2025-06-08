package ar.edu.unpaz.service;

import java.util.Map;
import ar.edu.unpaz.model.ProductoVendido;

/*
Todos los productos vendidos con su cantidad total.

Cuánto dinero se recaudó en total.

Cuál fue el producto más vendido en unidades.

(Opcional) Mostrar el promedio de unidades vendidas por producto.*/

public interface IProductosDatos {	
	public Map<String,Double> totalPorProducto();
	public double totalRecaudado();
	public ProductoVendido masVendido();
	public Map<String,Double> promedioUnidadesPorProducto();
}
