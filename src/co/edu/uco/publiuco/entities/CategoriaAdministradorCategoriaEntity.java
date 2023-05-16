package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;
public final class CategoriaAdministradorCategoriaEntity {

	private UUID identificador;
	private CategoriaEntity categoria;
	private AdministradorCategoriaEntity administradorCategoria;
	public static CategoriaAdministradorCategoriaEntity DEFAULT_OBJECT = new CategoriaAdministradorCategoriaEntity();

	private CategoriaAdministradorCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultValue());
		setCategoria(CategoriaEntity.getDefaultObject());
		setAdministradorCategoria(AdministradorCategoriaEntity.getDefaultObject());
	}


	public CategoriaAdministradorCategoriaEntity(UUID identificador, CategoriaEntity categoria, AdministradorCategoriaEntity administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	private final void setCategoria(final CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
	}

	private final void setAdministradorCategoria(final AdministradorCategoriaEntity administradorCategoria) {

		this.administradorCategoria = UtilObject.getDefault(administradorCategoria, AdministradorCategoriaEntity.getDefaultObject());
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

	public static CategoriaAdministradorCategoriaEntity getDefaultObject (){
		return DEFAULT_OBJECT;
	}
}