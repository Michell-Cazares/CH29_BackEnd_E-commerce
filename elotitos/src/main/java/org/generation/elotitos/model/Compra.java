package org.generation.elotitos.model;

import java.util.Date;

public class Compra {
	private Long idcompra;
	private Long idusuario;
	private Float pagoTotal;
	private Date fecha;
	private Integer cantidadProductos;
	private static long total = 0;
	public Compra(Long idusuario, Float pagoTotal, Integer cantidadProductos) {
		super();
		this.idusuario = idusuario;
		this.pagoTotal = pagoTotal;
		this.fecha = new Date();
		this.cantidadProductos = cantidadProductos;
		Compra.total++;
		this.idcompra = Compra.total;
	}// constructor

	public Compra() {
		Compra.total++;
		this.idcompra = Compra.total;
	}// constructor

	public Long getIdusuario() {
		return idusuario;
	}// getIdusuario

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}// setIdusuario

	public Float getPagoTotal() {
		return pagoTotal;
	}// getPagoTotal

	public void setPagoTotal(Float pagoTotal) {
		this.pagoTotal = pagoTotal;
	}// setPagoTotal

	public Date getFecha() {
		return fecha;
	}// getFecha

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}// setFecha

	public Integer getCantidadProductos() {
		return cantidadProductos;
	}// getCantidadProductos

	public void setCantidadProductos(Integer cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}// setCantidadProductos

	public Long getIdcompra() {
		return idcompra;
	}// getIdcompra

	@Override
	public String toString() {
		return "Compra [idcompra=" + idcompra + ", idusuario=" + idusuario + ", pagoTotal=" + pagoTotal + ", fecha="
				+ fecha + ", cantidadProductos=" + cantidadProductos + "]";
	}

}
