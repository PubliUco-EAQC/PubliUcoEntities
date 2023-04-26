package co.edu.uco.publiuco.entities;

import java.util.UUID;

public final class EstadoTipoRelacionInstitucionEntity {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public EstadoTipoRelacionInstitucionEntity() {
		super();
		setIdentificador(identificador);
		setNombre("");
		setDescripcion("");
	}
	
	public EstadoTipoRelacionInstitucionEntity(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final EstadoTipoRelacionInstitucionEntity setIdentificador(final UUID identificador) {
		this.identificador = identificador;
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final EstadoTipoRelacionInstitucionEntity setNombre(final String nombre) {
		this.nombre = "";
		
		if(nombre != null) {
			this.nombre = nombre.trim();
		}
		
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final EstadoTipoRelacionInstitucionEntity setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
		return this;
	}
}
