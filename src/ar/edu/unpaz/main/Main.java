package ar.edu.unpaz.main;

import java.util.Scanner;

import ar.edu.unpaz.controller.ProductosController;
import ar.edu.unpaz.repo.RepoProductos;
import ar.edu.unpaz.service.ProductosService;

public class Main {

	public static void main(String[] args) {
		
		RepoProductos repo = new RepoProductos("C:\\kiosco.txt",",");
		ProductosService productos = new ProductosService(repo);
		ProductosController productosDatos = new ProductosController(productos);
				

		Scanner sc = new Scanner(System.in);
		
		String menu = "--- datos productos ---\n"
				+ "\t1: ventas totales por producto\n"
				+ "\t2: total recaudado\n"
				+ "\t3: producto mas vendido\n"
				+ "\t4: cantidad promedio de unidades vendidas por prodcuto\n"
				+ "--- ingresa una opcion: ";
		
		boolean showMenu = true;
		while (showMenu) {
			System.out.println(menu);
			char option = sc.next().charAt(0);
			
			switch (option) {
				case '1':
					productosDatos.totalPorProduct();				
					break;
				case '2':
					productosDatos.totalRecaudado();
					break;
				case '3':
					productosDatos.masVendido();
					break;
				case '4':
					productosDatos.promedioUnidadesPorProducto();
					break;
				default:
					showMenu = false;
					System.out.println("---> ---> opcion no valida\nsaliendo...");
			}
			
		}
	
	}
}
