package org.generation.elotitos.controller;

import java.util.List;

import org.generation.elotitos.model.Producto;
import org.generation.elotitos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/// CRUD Create - Read - Update - Delete
/// HTTP POST 	- GET  - PUT	- DELETE

@RestController
@RequestMapping(path = "/api/productos/") // http://localhost:8080/api/productos/
public class ProductoController {
	private final ProductoService productoService;

	@Autowired
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}// constructor

	@GetMapping
	public List<Producto> getAllProducts() {
		return productoService.getAllProductos();
	}

	@GetMapping(path = "{prodId}")
	public Producto getProduct(@PathVariable("prodId") Long idproducto) {
		return productoService.getProducto(idproducto);
	}

	@DeleteMapping(path = "{prodId}")
	public Producto deleteProduct(@PathVariable("prodId") Long idproducto) {
		return productoService.deleteProducto(idproducto);
	}

	@PostMapping
	public Producto addProduct(@RequestBody Producto producto) {
		return productoService.addProducto(producto);
	}

	@PutMapping(path="{prodId}")
	public Producto updateProduct(@PathVariable("prodId") Long idproducto,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String imagen,
			@RequestParam(required = false) Float precio) {
		return productoService.updateProducto(idproducto, nombre, descripcion, imagen, precio);
	}
}// class ProductoController
