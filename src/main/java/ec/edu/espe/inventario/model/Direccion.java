package ec.edu.espe.inventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AF_DIRECCION")
public class Direccion {

    @Id
    @Column(name = "CODIGO_DIRECCION")
    private int codigoDireccion;

    @Column(name = "DESC_DIRECCION")
    private String descDireccion;

    public Direccion() {
    }

    public Direccion(int codigoDireccion) {
        this.codigoDireccion = codigoDireccion;
    }

    public int getCodigoDireccion() {
        return codigoDireccion;
    }

    public void setCodigoDireccion(int codigoDireccion) {
        this.codigoDireccion = codigoDireccion;
    }

    public String getDescDireccion() {
        return descDireccion;
    }

    public void setDescDireccion(String descDireccion) {
        this.descDireccion = descDireccion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        Direccion other = (Direccion) obj;
        if (codigoDireccion != other.codigoDireccion)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Direccion [codigoDireccion=" + codigoDireccion + ", descDireccion=" + descDireccion + "]";
    }

}
