package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class TipoIdentificacionEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    public static TipoIdentificacionEntity DEFAULT_OBJECT = new TipoIdentificacionEntity();

    private TipoIdentificacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoIdentificacionEntity(UUID identificador, String nombre, String descripcion) {
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

    public static TipoIdentificacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
    
    public static TipoIdentificacionEntity create (){
        return new TipoIdentificacionEntity();
    }
}


