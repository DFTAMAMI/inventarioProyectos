package ec.edu.espe.inventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AD_ACTIVOFIJOB")
public class Activo {

    @Id
    @Column(name = "CODIGO")
    private int codigo;

    @Column(name = "CODIGO_EMPRESA")
    private int codigoEmpresa;

    @Column(name = "LOCALIDAD")
    private int localidad;

    @Column(name = "ORIGEN")
    private int origen;

    @Column(name = "TIPO")
    private int tipo;

    @Column(name = "SUBTIPO")
    private int subtipo;

    @Column(name = "CLASE")
    private int clase;

    @Column(name = "COD_LOCALIDAD")
    private int codLocalidad;

    @Column(name = "CONCEPTO_TRANSACCION")
    private int conceptoTrasaccion;

    @Column(name = "LOTE")
    private int lote;

    @Column(name = "SUBLOTE")
    private int subLote;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Activo() {
    }

    public Activo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(int subtipo) {
        this.subtipo = subtipo;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getCodLocalidad() {
        return codLocalidad;
    }

    public void setCodLocalidad(int codLocalidad) {
        this.codLocalidad = codLocalidad;
    }

    public int getConceptoTrasaccion() {
        return conceptoTrasaccion;
    }

    public void setConceptoTrasaccion(int conceptoTrasaccion) {
        this.conceptoTrasaccion = conceptoTrasaccion;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getSubLote() {
        return subLote;
    }

    public void setSubLote(int subLote) {
        this.subLote = subLote;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        Activo other = (Activo) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Activo [codigo=" + codigo + ", codigoEmpresa=" + codigoEmpresa + ", localidad=" + localidad
                + ", origen=" + origen + ", tipo=" + tipo + ", subtipo=" + subtipo + ", clase=" + clase
                + ", codLocalidad=" + codLocalidad + ", conceptoTrasaccion=" + conceptoTrasaccion + ", lote=" + lote
                + ", subLote=" + subLote + ", descripcion=" + descripcion + "]";
    }

}
