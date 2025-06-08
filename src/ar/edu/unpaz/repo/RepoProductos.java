package ar.edu.unpaz.repo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ar.edu.unpaz.model.ProductoVendido;

public class RepoProductos implements ILectura{
	private Path ruta;
	private String csvFormat; 
	public RepoProductos(String ruta, String csvFormat) {
		this.ruta = Paths.get(ruta);
		this.csvFormat = csvFormat;
	}
	@Override
	public List<ProductoVendido> leerProductos() throws IOException {
		Map<String, ProductoVendido> productos = new HashMap<String,ProductoVendido>();
		
		Files.lines(ruta)
				.forEach(p -> {
					String[] schemaP = p.split(this.csvFormat);
					
					if(schemaP.length > 3) {
						throw new Error("existe un producto que no posee el formato adecuado");
					}
					
					if (productos.containsKey(schemaP[0])) {
						ProductoVendido prod = productos.get(schemaP[0]);
						prod.setCantidadVendida(prod.getCantidadVendida() + Integer.parseInt(schemaP[2]));
						
						productos.put(schemaP[0], prod);
					} else {
						ProductoVendido prodN = new ProductoVendido(
								schemaP[0],
								Double.parseDouble(schemaP[1]),
								Integer.parseInt(schemaP[2])); 
						productos.put(schemaP[0],prodN);
					}
					 
				});
		
		return new ArrayList<ProductoVendido>(productos.values());
	}
	
}
