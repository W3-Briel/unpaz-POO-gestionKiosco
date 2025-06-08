package ar.edu.unpaz.repo;

import java.io.IOException;
import java.util.List;
import ar.edu.unpaz.model.ProductoVendido;

public interface ILectura {
	public List<ProductoVendido> leerProductos() throws IOException;
}
