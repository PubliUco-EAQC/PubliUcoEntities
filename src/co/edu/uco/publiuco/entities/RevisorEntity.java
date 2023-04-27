package co.edu.uco.publiuco.entities;

import java.util.UUID;

public class RevisorEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;

    public RevisorEntity(UUID identificador, PersonaEntity datosPersona, EstadoEntity estado) {
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getDatosPersona() {
        return datosPersona;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    public final void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public final void setDatosPersona(PersonaEntity datosPersona) {
        this.datosPersona = datosPersona;
    }

    public final void setEstado(EstadoEntity estado) {
        this.estado = estado;
    }
}