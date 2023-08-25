package org.generation.elotitos.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "comprasDetalle")
public class CompraDetalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddetalle",unique=true, nullable=false)
	private Long iddetalle;
	@Column(nullable=false)
	private Integer cantidadProductos;
	@Column(nullable=false)
	private Float ventaTotal;
	@Column(nullable=false)
	private Long idcompra;
	@Column(nullable=false)
	private Long idproducto;
	//private static long total = 0;

	public CompraDetalle(Integer cantidadProductos, Float ventaTotal, Long idcompra, Long idproducto) {
		super();
		this.cantidadProductos = cantidadProductos;
		this.ventaTotal = ventaTotal;
		this.idcompra = idcompra;
		this.idproducto = idproducto;
		//CompraDetalle.total++;
		//this.iddetalle = CompraDetalle.total;
	}//constructor
	
	public CompraDetalle() {
		//CompraDetalle.total++;
		//this.iddetalle = CompraDetalle.total;
	}// constructor

	public Integer getCantidadProductos() {
		return cantidadProductos;
	}// getCantidadProductos

	public void setCantidadProductos(Integer cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}// setCantidadProductos

	public Float getVentaTotal() {
		return ventaTotal;
	}// getVentaTotal

	public void setVentaTotal(Float ventaTotal) {
		this.ventaTotal = ventaTotal;
	}// setVentaTotal

	public Long getIdcompra() {
		return idcompra;
	}// getIdcompra

	public void setIdcompra(Long idcompra) {
		this.idcompra = idcompra;
	}// setIdcompra

	public Long getIdproducto() {
		return idproducto;
	}// getIdproducto

	public void setIdproducto(Long idproducto) {
		this.idproducto = idproducto;
	}// setIdproducto

	public Long getIddetalle() {
		return iddetalle;
	}// getIddetalle

	@Override
	public String toString() {
		return "CompraDetalle [iddetalle=" + iddetalle + ", cantidadProductos=" + cantidadProductos + ", ventaTotal="
				+ ventaTotal + ", idcompra=" + idcompra + ", idproducto=" + idproducto + "]";
	}

}
