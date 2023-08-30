package org.generation.elotitos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compras")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcompra", unique=true, nullable=false)
	private Long idcompra;
	@Column(nullable=false)
	private Long idusuario;
	@Column(nullable=false)
	private Float pagoTotal;
	@Column(nullable=false)
	private Date fecha;
	@Column(nullable=false)
	private Integer cantidadProductos;
	//private static long total = 0;
	
	
	public Compra(Long idusuario, Float pagoTotal, Integer cantidadProductos) {
		super();
		this.idusuario = idusuario;
		this.pagoTotal = pagoTotal;
		this.fecha = new Date();
		this.cantidadProductos = cantidadProductos;
		//Compra.total++;
		//this.idcompra = Compra.total;
	}// constructor

	public Compra() {
		//Compra.total++;
		//this.idcompra = Compra.total;
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
