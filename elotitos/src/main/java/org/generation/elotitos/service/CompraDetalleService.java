package org.generation.elotitos.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.elotitos.model.CompraDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraDetalleService {
	private final ArrayList<CompraDetalle> listaComprasDetalles = new ArrayList<>();

	@Autowired
	public CompraDetalleService() {
		listaComprasDetalles.add(new CompraDetalle(1, 25.0F, 1L, 1L));
		listaComprasDetalles.add(new CompraDetalle(2, 50.0F, 1L, 3L));
		listaComprasDetalles.add(new CompraDetalle(1, 70.0F, 2L, 10L));
		listaComprasDetalles.add(new CompraDetalle(1, 30.0F, 2L, 6L));
		listaComprasDetalles.add(new CompraDetalle(1, 30.0F, 3L, 8L));
		listaComprasDetalles.add(new CompraDetalle(1, 50.0F, 3L, 9L));
		listaComprasDetalles.add(new CompraDetalle(1, 70.0F, 4L, 10L));
		listaComprasDetalles.add(new CompraDetalle(1, 50.0F, 4L, 9L));
		listaComprasDetalles.add(new CompraDetalle(1, 30.0F, 4L, 8L));
		listaComprasDetalles.add(new CompraDetalle(1, 25.0F, 5L, 1L));
		listaComprasDetalles.add(new CompraDetalle(2, 50.0F, 5L, 3L));
	}// constructor

	public List<CompraDetalle> getAllComprasDetalles() {
		// TODO Auto-generated method stub
		return this.listaComprasDetalles;
	}

	public CompraDetalle getCompraDetalle(Long iddetalle) {
		// TODO Auto-generated method stub
		CompraDetalle tmp = null;
		for (CompraDetalle compradetalle : listaComprasDetalles) {
			if (compradetalle.getIdcompra().equals(iddetalle)) {
				tmp = compradetalle;
				break;
			} // if
		} // foreach
		return tmp;
	}

	public CompraDetalle deleteCompraDetalle(Long iddetalle) {
		// TODO Auto-generated method stub
		
		CompraDetalle tmp = null;
		for (CompraDetalle compradetalle : listaComprasDetalles) {
			if (compradetalle.getIddetalle().equals(iddetalle)) {
				tmp = listaComprasDetalles.remove(listaComprasDetalles.indexOf(compradetalle));
				break;
			} // if
		} // foreach
		return tmp;
	}

	public CompraDetalle addCompraDetalle(CompraDetalle compraDetalle) {
		// TODO Auto-generated method stub
		listaComprasDetalles.add(compraDetalle);
		return compraDetalle;
	}

	public CompraDetalle updateCompraDetalle(Long iddetalle,Integer cantidadProductos, Float ventaTotal, Long idcompra,
			Long idproducto) {
		// TODO Auto-generated method stub
		CompraDetalle tmp = null;
		// TODO Auto-generated method stub
		for (CompraDetalle compradetalle : listaComprasDetalles) {
			if (compradetalle.getIddetalle().equals(iddetalle)) {
				if (cantidadProductos != null)
					compradetalle.setCantidadProductos(cantidadProductos);
				if (ventaTotal != null)
					compradetalle.setVentaTotal(ventaTotal);
				if (idcompra != null)
					compradetalle.setIdcompra(idcompra);
				if (idproducto != null)
					compradetalle.setIdproducto(idproducto);
				tmp = compradetalle;
				break;
			}
		}
		return tmp;
	}
	
	
	
}
