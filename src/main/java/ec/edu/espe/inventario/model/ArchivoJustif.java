package ec.edu.espe.inventario.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ARCHIVOSJUSTIF")
public class ArchivoJustif {

    @Id
    @Column(name = "CODIGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Column(name = "CODIGOBIEN")
    private String codigoBien;
    @Column(name = "CUSTODIO1")
    private String custodio1;
    @Column(name = "CUSTODIO2")
    private String custodio2;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "DOCUMENTO")
    private String documento;
    @Column(name = "NOMBREARCHIVO")
    private String nombreArchivo;
    @Column(name = "TIPOARCHIVO")
    private String tipoArchivo;
    @Column(name = "FECHA_INGRESO")
    private Date fechaIngreso;

    public ArchivoJustif() {
    }

    public ArchivoJustif(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoBien() {
        return codigoBien;
    }

    public void setCodigoBien(String codigoBien) {
        this.codigoBien = codigoBien;
    }

    public String getCustodio1() {
        return custodio1;
    }

    public void setCustodio1(String custodio1) {
        this.custodio1 = custodio1;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((codigoBien == null) ? 0 : codigoBien.hashCode());
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
        ArchivoJustif other = (ArchivoJustif) obj;
        if (codigo != other.codigo)
            return false;
        if (codigoBien == null) {
            if (other.codigoBien != null)
                return false;
        } else if (!codigoBien.equals(other.codigoBien))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ArchivoJustif [codigo=" + codigo + ", codigoBien=" + codigoBien + ", custodio1=" + custodio1
                + ", custodio2=" + custodio2 + ", descripcion=" + descripcion + ", documento=" + documento
                + ", nombreArchivo=" + nombreArchivo + ", tipoArchivo=" + tipoArchivo + ", fechaIngreso=" + fechaIngreso
                + "]";
    }

}
