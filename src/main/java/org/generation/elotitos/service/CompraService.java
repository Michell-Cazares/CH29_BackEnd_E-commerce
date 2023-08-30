package org.generation.elotitos.service;

import java.util.Date;
import java.util.List;

import org.generation.elotitos.model.Compra;
import org.generation.elotitos.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {
	private final CompraRepository compraRepository;

	@Autowired
	public CompraService(CompraRepository compraRepository) {
		super();
		this.compraRepository = compraRepository;
	}// cosntructor

	public List<Compra> getAllCompras() {
		return compraRepository.findAll();
	}// getAllCompras

	public Compra getCompra(Long idcompra) {
		// TODO Auto-generated method stub
		Compra tmp = null;
		return compraRepository.findById(idcompra)
				.orElseThrow(() -> new IllegalArgumentException("La compra con el id[" + idcompra + "] no existe."));
	}// getcompra

	public Compra deleteCompra(Long idcompra) {
		Compra tmp = null;
		if (compraRepository.existsById(idcompra)) {
			tmp = compraRepository.findById(idcompra).get();
			compraRepository.deleteById(idcompra);
		}
		return tmp;
	}// deletecompra

	public Compra addCompra(Compra compra) {
		// TODO Auto-generated method stub
		Compra tmp = null;
		compra.setFecha(new Date());
		tmp = compraRepository.save(compra);
		return tmp;
	}

	public Compra updateCompra(Long idcompra, Long idusuario, Float pagoTotal, Integer cantidadProductos) {
		// TODO Auto-generated method stub
		Compra tmp = null;
		// TODO Auto-generated method stub
		if(compraRepository.existsById(idcompra)) {
			tmp = compraRepository.findById(idcompra).get();
			if (idusuario != null)
				tmp.setIdusuario(idusuario);
			if (pagoTotal != null)
				tmp.setPagoTotal(pagoTotal);
			if (cantidadProductos != null)
				tmp.setCantidadProductos(cantidadProductos);
			compraRepository.save(tmp);
		}else {
			System.out.println("Update- La compra con el id[" + idcompra + "] no existe.");
		}
		
		return tmp;
	}

}
