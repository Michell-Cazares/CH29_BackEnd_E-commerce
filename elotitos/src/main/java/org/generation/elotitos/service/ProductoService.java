package org.generation.elotitos.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.elotitos.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	private final ArrayList<Producto> listaProductos = new ArrayList<>();

	@Autowired
	public ProductoService() {
		listaProductos.add(new Producto("Elote preparado",
				"Elote preparado con mayonesa, queso, chile, limón y sal. Elote de grano pequeño (Tehuacán), por temporada.",
				"norma1.gif", 25.0f));
		listaProductos.add(new Producto("Elote preparado",
				"Elote preparado con mayonesa, queso, chile, limón y sal. Elote de grano grande (Cacahuazintle), por temporada.",
				"norma2.jpg", 35.0f));
		listaProductos.add(new Producto("Elote enchilado",
				"Elote con chile de la casa (jugo de limón con chilito). Elote de grano pequeño (Tehuacán), por temporada.",
				"bic1.jpg", 25.0f));
		listaProductos.add(new Producto("Elote enchilado",
				"Elote con chile de la casa (jugo de limón con chilito). Elote de grano grande (Cacahuazintle), por temporada.",
				"bic1.jpg", 35.0f));
		listaProductos.add(new Producto("Esquite natural preparado chico",
				"Esquite hervido preparado con mayonesa, queso, chile, limón y sal. Vaso chico.", "bic1.jpg", 25.0f));
		listaProductos.add(new Producto("Esquite natural preparado grande",
				"Esquite hervido preparado con mayonesa, queso, chile, limón y sal. Vaso grande.", "bic1.jpg", 30.0f));
		listaProductos.add(new Producto("Esquite asado preparado chico",
				"Elote con chile de la casa (jugo de limón con chilito). Elote de grano grande (cacahuazintle), por temporada.",
				"bic1.jpg", 25.0f));
		listaProductos.add(new Producto("Esquite asado preparado grande",
				"Esquite asado con chile de arbol, epazote y jalapeño, preparado con mayonesa, queso, chile, limón y sal.",
				"bic1.jpg", 30.0f));
		listaProductos.add(new Producto("DoriEsquites",
				"Las papitas de su gusto, con esquite mayonesa, queso de nachos, queso blanco, sal, limón, y la salsa que guste.",
				"bic1.jpg", 50.0f));
		listaProductos.add(new Producto("Maruchan Esquites",
				"Las papitas de su gusto, con esquite mayonesa, queso de nachos, queso blanco, sal, limón, y la salsa que guste.Las papitas de su gusto con Maruchan y con esquite, mayonesa, queso de nachos, queso blanco, sal, limón, y la salsa que guste.",
				"bic1.jpg", 70.0f));
	}// constructor

	public List<Producto> getAllProductos() {
		return this.listaProductos;
	}// getAllProductos

	public Producto getProducto(Long id) {
		Producto tmp = null;
		for (Producto producto : listaProductos) {
			if (producto.getId().equals(id)) {
				tmp = producto;
				break;
			} // if
		} // foreach
		return tmp;
	}// getProducto

	public Producto deleteProducto(Long idproducto) {
		// TODO Auto-generated method stub
		Producto tmp = null;
		for (Producto producto : listaProductos) {
			if (producto.getId().equals(idproducto)) {
				tmp = listaProductos.remove(listaProductos.indexOf(producto));
				break;
			} // if
		} // foreach
		return tmp;
	}// deleteProducto

	public Producto addProducto(Producto producto) {
		// TODO Auto-generated method stub
		listaProductos.add(producto);
		return producto;
	}// addProducto

	public Producto updateProducto(Long idproducto, String nombre, String descripcion, String imagen, Float precio) {
		Producto tmp = null;
		// TODO Auto-generated method stub
		for (Producto producto : listaProductos) {
			if (producto.getId().equals(idproducto)) {
				if (nombre != null)
					producto.setNombre(nombre);
				if (descripcion != null)
					producto.setDescripcion(descripcion);
				if (imagen != null)
					producto.setImagen(imagen);
				if (precio != null)
					producto.setPrecio(precio);

				tmp = producto;
				break;
			}
		}
		return tmp;
	}

}// classProductoService