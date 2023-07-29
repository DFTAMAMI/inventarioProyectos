package ec.edu.espe.inventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AF_SUBSECCION")
public class Subseccion {
    @Id
    @Column(name = "CODIGO_SUBSECCION")
    private int codigoSubSeccion;
    @Column(name = "COD_SECCION")
    private int codigoSeccion;
    @Column(name = "COD_AREA")
    private int codigoArea;
    @Column(name = "COD_DIRECCION")
    private int codigoDireccion;
    @Column(name = "DESC_SUBSECCION")
    private String descSubSeccion;

    public Subseccion() {
    }

    public Subseccion(int codigoSubSeccion) {
        this.codigoSubSeccion = codigoSubSeccion;
    }

    public int getCodigoSubSeccion() {
        return codigoSubSeccion;
    }

    public void setCodigoSubSeccion(int codigoSubSeccion) {
        this.codigoSubSeccion = codigoSubSeccion;
    }

    public int getCodigoSeccion() {
        return codigoSeccion;
    }

    public void setCodigoSeccion(int codigoSeccion) {
        this.codigoSeccion = codigoSeccion;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getCodigoDireccion() {
        return codigoDireccion;
    }

    public void setCodigoDireccion(int codigoDireccion) {
        this.codigoDireccion = codigoDireccion;
    }

    public String getDescSubSeccion() {
        return descSubSeccion;
    }

    public void setDescSubSeccion(String descSubSeccion) {
        this.descSubSeccion = descSubSeccion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoSubSeccion;
        result = prime * result + codigoSeccion;
        result = prime * result + codigoArea;
        result = prime * result + codigoDireccion;
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
        Subseccion other = (Subseccion) obj;
        if (codigoSubSeccion != other.codigoSubSeccion)
            return false;
        if (codigoSeccion != other.codigoSeccion)
            return false;
        if (codigoArea != other.codigoArea)
            return false;
        if (codigoDireccion != other.codigoDireccion)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Subseccion [codigoSubSeccion=" + codigoSubSeccion + ", codigoSeccion=" + codigoSeccion + ", codigoArea="
                + codigoArea + ", codigoDireccion=" + codigoDireccion + ", descSubSeccion=" + descSubSeccion + "]";
    }

}
