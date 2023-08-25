package org.generation.elotitos.service;

import java.util.List;

import org.generation.elotitos.model.Producto;
import org.generation.elotitos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	private final ProductoRepository productoRepository;

	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		super();
		this.productoRepository = productoRepository;
	}// constructor

	public List<Producto> getAllProductos() {
		return productoRepository.findAll();
	}// getAllProductos

	public Producto getProducto(Long idproducto) {
		return productoRepository.findById(idproducto).orElseThrow(
				() -> new IllegalArgumentException("El Producto con el id [" + idproducto + "] no existe."));
	}// getProducto

	public Producto deleteProducto(Long idproducto) {
		// TODO Auto-generated method stub
		Producto tmp = null;
		if (productoRepository.existsById(idproducto)) {
			tmp = productoRepository.findById(idproducto).get();
			productoRepository.deleteById(idproducto);
		}
		return tmp;
	}// deleteProducto

	public Producto addProducto(Producto producto) {
		// TODO Auto-generated method stub
		Producto tmp = null;
		tmp = productoRepository.save(producto);
		return tmp;
	}// addProducto

	public Producto updateProducto(Long idproducto, String nombre, String descripcion, String imagen, Float precio) {
		Producto tmp = null;
		// TODO Auto-generated method stub
		if (productoRepository.existsById(idproducto)) {
			tmp = productoRepository.findById(idproducto).get();
			if (nombre != null)
				tmp.setNombre(nombre);
			if (descripcion != null)
				tmp.setDescripcion(descripcion);
			if (imagen != null)
				tmp.setImagen(imagen);
			if (precio != null)
				tmp.setPrecio(precio);
			productoRepository.save(tmp);
		} else {
			System.out.println("Update - El producto con el id [" + idproducto + "] no existe.");
		}
		return tmp;
	}
}// classProductoService