package co.edu.uco.publiuco.entities;


import java.util.UUID;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;


public final class EstadoEntity {

    private UUID identificador;
    private String nombre;
    private TipoEstadoEntity tipoEstado;
    public static EstadoEntity DEFAULT_OBJECT = new EstadoEntity();


    private EstadoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setTipoEstado(TipoEstadoEntity.getDefaultObject());
    }
    
    public static final EstadoEntity createWithIdentificador(UUID identificador) {
        return new EstadoEntity(identificador, UtilText.getDefaultValue(), TipoEstadoEntity.getDefaultObject());
    }
    
    public static final EstadoEntity createWithName(String name) {
        return new EstadoEntity(UtilUUID.getDefaultValue(), name, TipoEstadoEntity.getDefaultObject());
    }
    
    public static final EstadoEntity createWithTipoEstado(UUID identificador) {
        return new EstadoEntity(UtilUUID.getDefaultValue(), UtilText.getDefaultValue(), TipoEstadoEntity.getDefaultObject());
    }


    public EstadoEntity(UUID identificador, String nombre, TipoEstadoEntity tipoEstado) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setTipoEstado(tipoEstado);
    }

    private final void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private final void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private final void setTipoEstado(final TipoEstadoEntity tipoEstado) {

        this.tipoEstado = UtilObject.getDefault(tipoEstado, TipoEstadoEntity.getDefaultObject());
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoEntity getTipoEstado() {
        return tipoEstado;
    }

    public static EstadoEntity getDefaultObject(){
        return DEFAULT_OBJECT;
    }
}
