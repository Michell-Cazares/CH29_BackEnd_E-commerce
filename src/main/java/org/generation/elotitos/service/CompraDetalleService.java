package org.generation.elotitos.service;


import java.util.List;

import org.generation.elotitos.model.CompraDetalle;
import org.generation.elotitos.repository.CompraDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CompraDetalleService {
	private final CompraDetalleRepository compraDetalleRepository;

	@Autowired
	public CompraDetalleService(CompraDetalleRepository compraDetalleRepository) {
		super();
		this.compraDetalleRepository = compraDetalleRepository;
	}

	public List<CompraDetalle> getAllComprasDetalles() {
		return compraDetalleRepository.findAll();

	}// getAllCompras

	public CompraDetalle getCompraDetalle(Long iddetalle) {
		// TODO Auto-generated method stub
		return compraDetalleRepository.findById(iddetalle)
				.orElseThrow(() -> new IllegalArgumentException("El Producto con el id[" + iddetalle + "] no existe."));
	}// getCompraDetalle

	public CompraDetalle deleteCompraDetalle(Long iddetalle) {
		// TODO Auto-generated method stub

		CompraDetalle tmp = null;
		if (compraDetalleRepository.existsById(iddetalle)) {
			tmp = compraDetalleRepository.findById(iddetalle).get();
			compraDetalleRepository.deleteById(iddetalle);
		}

		return tmp;
	}

	public CompraDetalle addCompraDetalle(CompraDetalle compraDetalle) {
		// TODO Auto-generated method stub
		CompraDetalle tmp = null;
		tmp = compraDetalleRepository.save(compraDetalle);
		return compraDetalle;
	}

	public CompraDetalle updateCompraDetalle(Long iddetalle, Integer cantidadProductos, Float ventaTotal, Long idcompra,
			Long idproducto) {
		// TODO Auto-generated method stub
		CompraDetalle tmp = null;
		// TODO Auto-generated method stub
		if(compraDetalleRepository.existsById(iddetalle)) {
			tmp = compraDetalleRepository.findById(iddetalle).get();
			if (cantidadProductos != null)
				tmp.setCantidadProductos(cantidadProductos);
			if (ventaTotal != null)
				tmp.setVentaTotal(ventaTotal);
			if (idcompra != null)
				tmp.setIdcompra(idcompra);
			if (idproducto != null)
				tmp.setIdproducto(idproducto);
			compraDetalleRepository.save(tmp);
		}else {
			System.out.println("Update- El producto con el ID ["+idproducto+"] no existe.");
		}
		
		
		return tmp;
	}

}
