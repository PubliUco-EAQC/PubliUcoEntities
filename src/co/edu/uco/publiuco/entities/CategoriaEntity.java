package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;

import java.util.UUID;

public class CategoriaEntity {
    private UUID identificador;
    private CategoriaEntity categoriaPadre;
    private String nombre;
    private String descripcion;
    private EstadoEntity estado;

    public CategoriaEntity(UUID identificador, CategoriaEntity categoriaPadre, String nombre, String descripcion, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setCategoriaPadre(categoriaPadre);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
    }

    public final void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public final void setCategoriaPadre(CategoriaEntity categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public final void setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    public final void setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
    }

    public final void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaEntity getCategoriaPadre() {
        return categoriaPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoEntity getEstado() {
        return estado;
    }
}
