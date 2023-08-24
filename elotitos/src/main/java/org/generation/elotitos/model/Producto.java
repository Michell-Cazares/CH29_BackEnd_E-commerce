package org.generation.elotitos.model;

public class Producto {
	private Long idproducto;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Float precio;
	private static long total = 0;

	public Producto(String nombre, String descripcion, String imagen, Float precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		Producto.total++;
		this.idproducto = Producto.total;
	}// constructor

	public Producto() {
		Producto.total++;
		this.idproducto = Producto.total;
	}// constructor

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getDescripcion() {
		return descripcion;
	}//getDescripcion

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion

	public String getImagen() {
		return imagen;
	}//getImagen

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}//setImagen

	public Float getPrecio() {
		return precio;
	}//getPrecio

	public void setPrecio(Float precio) {
		this.precio = precio;
	}//setPrecio

	public Long getId() {
		return idproducto;
	}//getId

	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + "]";
	}
	
}
