package ec.edu.espe.inventario.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ACTIVOSRFID")
public class ActivoRfid implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODIGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Column(name = "CODIGO_RFID")
    private String codigoRfid;

    @Column(name = "CUSTODIO1")
    private String custodiol;

    @Column(name = "CUSTODIO2")
    private String custodio2;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "ESTADOJUSTIFICADO")
    private String estadoJustificado;

    @Column(name = "ESTADOTRANSACCION")
    private String estadoTransaccion;

    @Column(name = "FECHA_LECTURA")
    private Date fechaLectura;

    public ActivoRfid() {
    }

    public ActivoRfid(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoRfid() {
        return codigoRfid;
    }

    public void setCodigoRfid(String codigoRfid) {
        this.codigoRfid = codigoRfid;
    }

    public String getCustodiol() {
        return custodiol;
    }

    public void setCustodiol(String custodiol) {
        this.custodiol = custodiol;
    }

    public String getCustodio2() {
        return custodio2;
    }

    public void setCustodio2(String custodio2) {
        this.custodio2 = custodio2;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstadoJustificado() {
        return estadoJustificado;
    }

    public void setEstadoJustificado(String estadoJustificado) {
        this.estadoJustificado = estadoJustificado;
    }

    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    public Date getFechaLectura() {
        return fechaLectura;
    }

    public void setFechaLectura(Date fechaLectura) {
        this.fechaLectura = fechaLectura;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((codigoRfid == null) ? 0 : codigoRfid.hashCode());
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
        ActivoRfid other = (ActivoRfid) obj;
        if (codigo != other.codigo)
            return false;
        if (codigoRfid == null) {
            if (other.codigoRfid != null)
                return false;
        } else if (!codigoRfid.equals(other.codigoRfid))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ArchivoJustif [codigo=" + codigo + ", codigoRfid=" + codigoRfid + ", custodiol=" + custodiol
                + ", custodio2=" + custodio2 + ", descripcion=" + descripcion + ", usuario=" + usuario
                + ", estadoJustificado=" + estadoJustificado + ", estadoTransaccion=" + estadoTransaccion
                + ", fechaLectura=" + fechaLectura + "]";
    }

}
