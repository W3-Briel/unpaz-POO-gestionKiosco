package ar.edu.unpaz.controller;

import ar.edu.unpaz.model.ProductoVendido;
import ar.edu.unpaz.service.IProductosDatos;

public class ProductosController {
	private IProductosDatos service;
	public ProductosController(IProductosDatos prodService) {
		this.service = prodService;
	}
	
	/*
	public Map<String,Double> totalPorProducto();
	public double totalRecaudado();
	public ProductoVendido masVendido();
	public Map<String,Double> promedioUnidadesPorProducto();*/
	
	public void totalPorProduct() {
		System.out.println("--- total por producto ---");
		this.service.totalPorProducto()
			.forEach((nombre,cantidad) -> System.out.println(nombre + ": " + cantidad));
		
		System.out.println();
	}
	
	public void totalRecaudado() {
		System.out.println("--- total recaudado ---");
		System.out.println("El total recudado es: " + this.service.totalRecaudado());
		System.out.println();
	}
	
	public void masVendido() {
		System.out.println("--- mas vendido ---");
		ProductoVendido top = this.service.masVendido();
		String p = String.format("El producto mas vendido es '%s' con una cantidad de %s",top.getNombre(),top.getCantidadVendida());
		System.out.println(p + "\n");
	}
	
	public void promedioUnidadesPorProducto() {
		
		System.out.println("--- producto y promedio ---");
		this.service.promedioUnidadesPorProducto()
			.forEach((nombre,avg) -> System.out.println(nombre + " : " + avg));
		
		System.out.println();
	}
}
