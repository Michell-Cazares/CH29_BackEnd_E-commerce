package org.generation.elotitos.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.generation.elotitos.model.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {
	private final ArrayList<Compra> listaCompras = new ArrayList<>();

	@Autowired
	public CompraService() {
		listaCompras.add(new Compra(1L, 75.0F, 3));
		listaCompras.add(new Compra(5L, 80.0F, 2));
		listaCompras.add(new Compra(4L, 150.0F, 3));
		listaCompras.add(new Compra(3L, 100.0F, 2));
		listaCompras.add(new Compra(1L, 100.0F, 2));
	}// constructor

	public List<Compra> getAllCompras() {
		// TODO Auto-generated method stub
		return this.listaCompras;
	}

	public Compra getCompra(Long idcompra) {
		// TODO Auto-generated method stub
		Compra tmp = null;
		for (Compra compra : listaCompras) {
			if (compra.getIdcompra().equals(idcompra)) {
				tmp = compra;
				break;
			} // if
		} // foreach
		return tmp;
	}

	public Compra deleteCompra(Long idcompra) {
		// TODO Auto-generated method stub
		Compra tmp = null;
		for (Compra compra : listaCompras) {
			if (compra.getIdcompra().equals(idcompra)) {
				tmp = listaCompras.remove(listaCompras.indexOf(compra));
				break;
			} // if
		} // foreach
		return tmp;
	}

	public Compra addCompra(Compra compra) {
		// TODO Auto-generated method stub
		compra.setFecha(new Date());
		listaCompras.add(compra);
		return compra;
	}

	public Compra updateCompra(Long idcompra, Long idusuario, Float pagoTotal, Integer cantidadProductos) {
		// TODO Auto-generated method stub
		Compra tmp = null;
		// TODO Auto-generated method stub
		for (Compra compra : listaCompras) {
			if (compra.getIdcompra().equals(idcompra)) {
				if (idusuario != null)
					compra.setIdusuario(idusuario);
				if (pagoTotal != null)
					compra.setPagoTotal(pagoTotal);
				if (cantidadProductos != null)
					compra.setCantidadProductos(cantidadProductos);
				tmp = compra;
				break;
			}
		}
		return tmp;
	}

}
