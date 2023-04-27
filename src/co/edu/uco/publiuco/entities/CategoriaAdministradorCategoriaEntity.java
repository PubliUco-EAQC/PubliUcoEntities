package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;
public final class CategoriaAdministradorCategoriaEntity {

	private UUID identificador;
	private CategoriaEntity categoria;
	private AdministradorCategoriaEntity administradorCategoria;

	public CategoriaAdministradorCategoriaEntity(UUID identificador, CategoriaEntity categoria, AdministradorCategoriaEntity administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}

	public final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final void setCategoria(final CategoriaEntity categoria) {
		this.categoria = categoria;
	}

	public final void setAdministradorCategoria(final AdministradorCategoriaEntity administradorCategoria) {
		this.administradorCategoria = administradorCategoria;
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public AdministradorCategoriaEntity getAdministradorCategoria() {
		return administradorCategoria;
	}
}