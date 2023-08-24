package org.generation.elotitos.controller;

import java.util.List;

import org.generation.elotitos.model.Compra;
import org.generation.elotitos.service.CompraService;
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
@RequestMapping(path = "/api/compras/") // http://localhost:8080/api/compras/
public class CompraController {
	private final CompraService compraService;

	@Autowired
	public CompraController(CompraService compraService) {
		this.compraService = compraService;
	}// constructor

	@GetMapping
	public List<Compra> getAllCompras() {
		return compraService.getAllCompras();
	}

	@GetMapping(path = "{compraId}")
	public Compra getCompra(@PathVariable("compraId") Long idcompra) {
		return compraService.getCompra(idcompra);
	}

	@DeleteMapping(path = "{compraId}")
	public Compra deleteCompra(@PathVariable("compraId") Long idcompra) {
		return compraService.deleteCompra(idcompra);
	}

	@PostMapping
	public Compra addCompra(@RequestBody Compra compra) {
		return compraService.addCompra(compra);
	}

	@PutMapping(path="{compraId}")
	public Compra updateCompra(@PathVariable("compraId") Long idcompra,
			@RequestParam(required = false) Long idusuario,
			@RequestParam(required = false) Float pagoTotal,
			@RequestParam(required = false) Integer cantidadProductos) {
		return compraService.updateCompra(idcompra, idusuario, pagoTotal, cantidadProductos);
	}
}
