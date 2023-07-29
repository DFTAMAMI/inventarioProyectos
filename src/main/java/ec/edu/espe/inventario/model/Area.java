package ec.edu.espe.inventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AF_AREA")
public class Area {
    @Id
    @Column(name = "CODIGO_AREA")
    private int codigoArea;

    @Column(name = "COD DIRECCION")
    private int codigoDireccion;
    @Column(name = "DESC_AREA")
    private String descArea;

    public Area() {
    }

    public Area(int codigoArea) {
        this.codigoArea = codigoArea;
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

    public String getDescArea() {
        return descArea;
    }

    public void setDescArea(String descArea) {
        this.descArea = descArea;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        Area other = (Area) obj;
        if (codigoArea != other.codigoArea)
            return false;
        if (codigoDireccion != other.codigoDireccion)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Area [codigoArea=" + codigoArea + ", codigoDireccion=" + codigoDireccion + ", descArea=" + descArea
                + "]";
    }

}
