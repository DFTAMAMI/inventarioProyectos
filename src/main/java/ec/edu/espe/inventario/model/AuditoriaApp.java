package ec.edu.espe.inventario.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AUDITORIAAPP")
public class AuditoriaApp {
    @Id
    @Column(name = "CODIGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "OPCION")
    private String opcion;
    @Column(name = "CODIGOBIEN")
    private String codigoBien;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_AUDIT")
    private Date fechaAudit;

    public AuditoriaApp(int codigo) {
        this.codigo = codigo;
    }

    public AuditoriaApp() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getCodigoBien() {
        return codigoBien;
    }

    public void setCodigoBien(String codigoBien) {
        this.codigoBien = codigoBien;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaAudit() {
        return fechaAudit;
    }

    public void setFechaAudit(Date fechaAudit) {
        this.fechaAudit = fechaAudit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AuditoriaApp other = (AuditoriaApp) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AuditoriaApp [codigo=" + codigo + ", usuario=" + usuario + ", opcion=" + opcion + ", codigoBien="
                + codigoBien + ", descripcion=" + descripcion + ", fechaAudit=" + fechaAudit + "]";
    }

}
