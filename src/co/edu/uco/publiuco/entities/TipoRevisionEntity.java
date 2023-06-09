package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

public final class TipoRevisionEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    public static TipoRevisionEntity DEFAULT_OBJECT = new TipoRevisionEntity();

    private TipoRevisionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoRevisionEntity(UUID identificador, String nombre, String descripcion) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
    }
    public static TipoRevisionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }

    public static TipoRevisionEntity create (){
        return new TipoRevisionEntity();
    }
}


