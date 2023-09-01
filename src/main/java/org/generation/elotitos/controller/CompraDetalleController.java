package org.generation.elotitos.controller;

import java.util.List;

import org.generation.elotitos.model.CompraDetalle;
import org.generation.elotitos.service.CompraDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins="*")
@RequestMapping(path = "/api/compradetalle/") // http://localhost:8080/api/compradetalle/
public class CompraDetalleController {
	private final CompraDetalleService compraDetalleService;

	@Autowired
	public CompraDetalleController(CompraDetalleService compraDetalleService) {
		this.compraDetalleService = compraDetalleService;
	}// constructor

	@GetMapping
	public List<CompraDetalle> getAllComprasDetalles() {
		return compraDetalleService.getAllComprasDetalles();
	}

	@GetMapping(path = "{iddetalle}")
	public CompraDetalle getCompraDetalle(@PathVariable("iddetalle") Long iddetalle) {
		return compraDetalleService.getCompraDetalle(iddetalle);
	}

	@DeleteMapping(path = "{iddetalle}")
	public CompraDetalle deleteCompraDetalle(@PathVariable("iddetalle") Long iddetalle) {
		return compraDetalleService.deleteCompraDetalle(iddetalle);
	}

	@PostMapping
	public CompraDetalle addProduct(@RequestBody CompraDetalle compraDetalle) {
		return compraDetalleService.addCompraDetalle(compraDetalle);
	}

	@PutMapping(path="{iddetalle}")
	public CompraDetalle updateProduct(@PathVariable("iddetalle") Long iddetalle,
			@RequestParam(required = false) Integer cantidadProductos,
			@RequestParam(required = false) Float ventaTotal,
			@RequestParam(required = false) Long idcompra,
			@RequestParam(required = false) Long idproducto) {
		return compraDetalleService.updateCompraDetalle(iddetalle,cantidadProductos, ventaTotal, idcompra, idproducto);
	}
}
